package collections;

import java.util.*;

public class TinhTongCacChuSo {
    public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên :");
        Integer i = sc.nextInt(); // 25436 --> 2 + 5 + 4 + 3 + 6 = 20
        Integer total = 0;
        do {
            total += i % 10;
            i /= 10;
        }
        while (i > 10);
            total += i;
        System.out.println(total);
    }
}