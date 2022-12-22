package checkpoint.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n>= 3
        List<Integer> ranks = new ArrayList<>();
        List<Integer> key = new ArrayList<>();
        List<Integer> value = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ranks.add(sc.nextInt()) ;
        }
        System.out.println(ranks.toString());

        for (int i = 0; i < n ; i++) {
            int ranki = ranks.get(i);
            if (!key.contains(ranki)) {
                key.add(ranki);
                value.set(i, 1);

            }
        }
        System.out.println("Key: " + key);
        System.out.println("Value: " + value);
        // Xuất hiện n lần -> có n(n-1)/ 2 cặp trùng nhau
            int sum = 0;
        for (int i = 0; i < value.size() ; i++) {
            int valuei = value.get(i) ;
            sum = sum + (valuei * (valuei - 1))/2;
        }
            sum ++;


    }
}
