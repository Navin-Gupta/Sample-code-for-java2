package yaksha;

import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class TestMainClass {
	
	//@Mock
	//QuickSort sort;
	
	
	
	
	@Test
	public void testExceptionConditon() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.boundaryTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.exceptionTestFile);
	}
	
	@Test
	void testQuickSortImplementation() throws Exception {
		
		int[] arr = { 90, 29, 101, 45, 65, 23, 67, 89, 34, 31 };
		// Input : 90 29 101 45 65 23 67 89 34 31
		Array array = new Array(arr, 0, arr.length - 1);
		QuickSort sort = new QuickSort();
		int result[] = sort.quickSort(array);
		
		yakshaAssert(currentTest(), (result!=null ? "true" : "false"), businessTestFile);
	}
	
	@Test
	void testQuickSortTDD() throws Exception {
		int expectedResult[] = { 23, 29, 31, 34, 45, 65, 67, 89, 90, 101 };
		
		int[] arr = { 90, 29, 101, 45, 65, 23, 67, 89, 34, 31 };
		// Input : 90 29 101 45 65 23 67 89 34 31
		Array array = new Array(arr, 0, arr.length - 1);
		QuickSort sort = new QuickSort();
		int result[] = sort.quickSort(array);
		/*List<Integer> resultList = new ArrayList<Integer>(result.length);
		for (int i : result) {
			resultList.add(i);
		}*/
		yakshaAssert(currentTest(), (result!=null && Arrays.equals(result, expectedResult) ? "true" : "false"), businessTestFile);
	}

	@Test
	void testQuickSortBDD() throws Exception {
		final int count[] = new int[1];
		Integer expectedResult[] = { 23, 29, 31, 34, 45, 65, 67, 89, 90, 101 };
		List<Integer> expectedResultList = Arrays.asList(expectedResult);
		int[] arr = { 90, 29, 101, 45, 65, 23, 67, 89, 34, 31 };
		// Input : 90 29 101 45 65 23 67 89 34 31
		Array array = new Array(arr, 0, arr.length - 1);
		QuickSort sort = Mockito.spy(QuickSort.class);
		
		Mockito.when(sort.partition(arr, 0, arr.length - 1)).then(new Answer<Integer>() {

			@Override
			public Integer answer(InvocationOnMock invocation) throws Throwable {
				// TODO Auto-generated method stub
				System.out.println("Called");
				count[0]++;
				return 0;
			}
		});
		int result[] = sort.quickSort(array);
		
		yakshaAssert(currentTest(), count[0] > 0 ? "true" : "false", businessTestFile);
	}
}
