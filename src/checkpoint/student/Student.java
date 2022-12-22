package checkpoint.student;

import java.util.Arrays;
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        int[] arrRank = new int[n];
        int[] arrVal = new int[n+1];
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            arrRank[i] = element;
            arrVal[element]++;
        }
        System.out.println(Arrays.toString(arrRank));
        System.out.println(Arrays.toString(arrVal));
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            int valuei = arrVal[i] ;
            sum = sum + (valuei * (valuei - 1))/2;
        }
        sum++ ;
        for (int i = 0; i < n; i++) {
            System.out.print( sum - arrVal[arrRank[i]] + " ");
        }
    }
}
