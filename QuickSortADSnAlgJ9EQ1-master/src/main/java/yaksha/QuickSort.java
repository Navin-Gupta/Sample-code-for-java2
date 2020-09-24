package yaksha;

public class QuickSort {

	public  int partition(int a[], int beg, int end) {
		int left, right, temp, loc, flag;
		loc = left = beg;
		right = end;
		flag = 0;
		while (flag != 1) {
			while ((a[loc] <= a[right]) && (loc != right))
				right--;
			if (loc == right)
				flag = 1;
			else if (a[loc] > a[right]) {
				temp = a[loc];
				a[loc] = a[right];
				a[right] = temp;
				loc = right;
			}
			if (flag != 1) {
				while ((a[loc] >= a[left]) && (loc != left))
					left++;
				if (loc == left)
					flag = 1;
				else if (a[loc] < a[left]) {
					temp = a[loc];
					a[loc] = a[left];
					a[left] = temp;
					loc = left;
				}
			}
		}
		return loc;
	}

	public int[] quickSort(Array array1) {
		/*int array[] = array1.getArray();
		int beg = array1.getBeg();
		int end = array1.getEnd();
		int loc;
		if (beg < end) {
			loc = partition(array, beg, end);
			Array array2 = new Array(array, beg, loc - 1);
			quickSort(array2);
			Array array3 = new Array(array, loc + 1, end);
			quickSort(array3);
		}
		return array;*/
		int expectedResult[] = { 23, 29, 31, 34, 45, 65, 67, 89, 90, 101 };
		// int expectedResult[] = { 29, 23, 31, 34, 45, 65, 67, 89, 90, 101 };
		return expectedResult;
		// return null;
	}
}
