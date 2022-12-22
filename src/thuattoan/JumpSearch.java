package thuattoan;

public class JumpSearch {

    static int[] arr = {3,4,5,6,7,8,9,10,11};

    public static int jumpSearch(int[] arr, int k) {
        for (int i = 0; i < arr.length; i+=3) {
            if(arr[i] > k){
                for (int j = i-3; j < i; j++) {
                    if(arr[j] == k){
                        return j;
                    }

                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(jumpSearch(arr,72));
    }
}
