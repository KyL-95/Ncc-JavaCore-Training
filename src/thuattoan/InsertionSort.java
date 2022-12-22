package thuattoan;

import java.util.Arrays;

public class InsertionSort {
    public static void printArr(int no, int[] arr) {
        System.out.print( "Loop " + (no+1) + ": ");
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSort(int[] a){
       int n = a.length;
        for (int i = 1; i < n; i++){ // i = 0 mặc định đã sắp xếp nên ko cần duyệt
           int current = a[i]; // giá trị hiện tại của phần tử cần sắp xếp
           int j = i - 1; // Duyệt mảng giảm dần từ vị trí bên trái của i -> 0 :
            while (j >=0 && a[j] > current){ //
                a[j+1] = a[j];
                j --;
            }
            a[j+1] = current;
            printArr(i,a);
        }
    }

    public static void main(String[] args) {
        int[] a = { 5, 3, 2, 7, 8, 1, 2 };
        int[] b = { 1, 2, 3, 4, 5, 7, 6 };
        insertSort(a);
    }
}
