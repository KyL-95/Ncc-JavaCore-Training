package thuattoan;

public class SearchInLine {

    // Tìm vị trí của phần tử k, nếu ko tồn tại trả về -1
    static int[] arr = {3,4,5,6,7,8,9,10,11};

    public static int searchInLine(int[] arr,  int k){
        int i = 0;
        while(i<arr.length){
            if(arr[i]==k){
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(searchInLine(arr,-10));
    }
}
