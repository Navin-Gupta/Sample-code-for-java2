package yaksha;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		int i;
		Scanner scanner = new Scanner(System.in);
		int[] array1;
		int sizeOfArray;
		System.out.println("Enter size of the Array :");
		sizeOfArray = scanner.nextInt();
		array1 = new int[sizeOfArray];
		System.out.println("Enter numbers :");
		for (i = 0; i < array1.length; i++) {
			array1[i] = scanner.nextInt();
		}
		QuickSort sort= new QuickSort();
		Array array = new Array(array1, 0, array1.length - 1);
		int result[] = sort.quickSort(array);
		System.out.println("\n The sorted array is: \n");
		for (i = 0; i < 10; i++) {
			System.out.println(result[i]);
		}
		scanner.close();
	}
}
