package checkpoint.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n>= 3
        List<Integer> ranks = new ArrayList<>();
        List<Integer> value = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            ranks.add(element) ;
            value.set(i,1);
        }

        System.out.println(ranks);
        System.out.println(value);
            int sum = 0;
        for (int i = 0; i < value.size() ; i++) {
            int valuei = value.get(i) ;
            sum = sum + (valuei * (valuei - 1))/2;
        }
            sum ++;


    }
}
