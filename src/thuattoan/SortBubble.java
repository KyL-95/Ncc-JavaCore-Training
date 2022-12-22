package thuattoan;

import java.util.Arrays;
import java.util.List;

public class SortBubble {
	public static void printArr(int no, int[] arr) {
		System.out.print( "Loop " + (no+1) + ": ");
		System.out.println(Arrays.toString(arr));
	}
	// method sắp xếp nổi bọt
	public static void bubbleSort(int[] arr) {
		int temp = 0;
		int leng = arr.length;
		for (int i = 0; i < leng; i++) {
			// check xem đã sắp xếp chưa
			boolean isSorted = true;
			for (int j = 0; j < leng - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// Chưa sắp xếp
					isSorted = false;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				} 
			}
			printArr(i, arr);
			// Nếu đã sắp xếp rồi thì break khỏi vòng lặp
			if(isSorted) {
				break;
			}
		}
	}
	public static void bubbleSort2(int[] a){
		int n = a.length;
		for (int i = 0; i < n; i++) {
			boolean isSorted = true;
			for (int j = 0; j < n - i - 1 ; j++) {
				if (a[j] > a[j + 1]) {
					isSorted = false;
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			printArr(i,a);
			if (isSorted){
				break;
			}
		}
	}
	public static void main(String[] args) {
		// Sắp xếp tăng dần : nổi bọt
		int[] a = { 5, 3, 2, 7, 8, 1, 2 };
		int[] b = { 1, 2, 3, 4, 5, 7, 6 };
//		bubbleSort(arr);
		bubbleSort2(b);

	}
}
