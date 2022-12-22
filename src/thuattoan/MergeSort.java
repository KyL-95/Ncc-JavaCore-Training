package thuattoan;

public class MergeSort {

    public static int[] mergerSort(int[]a , int L , int R){
        // TH Đặc biệt
        if(L > R )  return new int[0];
        if(L==R) {
            int [] singElement = {a[L]};
            return singElement;
        }

        return a;
    }

    public static int[] sortArray(int[]a){
        return mergerSort(a, 0 , a.length - 1);
    }
}
