package thuattoan.dailylcode;

import java.util.Arrays;

public class DailyLeetCode {
    // 1. [1,1,0,1,1,1] -> output: 3     [1,1,1,1,0,2,1,1] -> output: 4
    public static int getMaxDaySoGiongNhauLienTiep(int[] a){
        int count = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            // Nếu gặp số 1 liên tiếp sẽ tăng count lên 1
            if(a[i] == 1){
                count++;
                // Max = max(max, count);
                max = Math.max(count, max);
                // Gặp số != 1 sẽ reset count = 0
            } else if(a[i] != 1){
                count = 0;
            }
        }
        return max;
    }

    // 2. Đếm các số có số chữ số của nó là chẵn
    public static int countEvenNumber(int [] a){
        // Đếm các số theo yêu cầu
        int count = 0;
        // Đếm số các chữ số của 1 số
        int countDigits = 1;
        for(int i = 0; i < a.length; i++){
            while(a[i] / 10 >= 1){
                countDigits++;
                a[i] = a[i] / 10;
            }
            if(countDigits % 2 == 0){
                count++;
            }
            countDigits = 1;
        }
        return count;
    }
    // 3. Sắp xếp mảng mới là bình phương của mảng cũ
    public static int[] sortSquare(int[] a){
        for (int i = 0; i < a.length; i++){
            a[i] = a[i]* a[i];
        }
        for (int j = 0; j < a.length; j++){
            int x = a[j];
            int pos = j - 1;
            while(pos >= 0 && a[pos] > x){
                a[pos+1] = a[pos];
                pos--;
            }
            a[pos + 1] = x;
        }
        return  a;
    }
    public static void main(String[] args) {
        int [] a1 = {1,1,1,1,1,1,0,1,1,1,1,1}; //  -> 6
        int [] a2 = {143,131,124,73,10,56,343}; // -> 2
        int [] a3 = {-4,-1,0,3,10}; // -> {0,1,9,16,100}
        System.out.println(getMaxDaySoGiongNhauLienTiep(a1));
        System.out.println(countEvenNumber(a2));
        System.out.println(Arrays.toString(sortSquare(a3)));
    }
}
