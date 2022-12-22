package checkpoint;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringSS {
    public static void main(String[] args) {
        System.out.println("Nhập vào một string : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkString(s));

    }

    public static boolean checkString(String s){
        int length = s.length();
        if(length % 2 != 0){
            return false;
        }
        int x = length/2;
        s = s.trim();
        String s1 = s.substring(0,x);
        String s2 = s.substring(x,length);
        String[] arrS1 = s1.split("");
        System.out.println("arr 1 : " + Arrays.toString(arrS1));
        String[] arrS2 = s2.split("");
        List<String> listS2 = Arrays.asList(arrS2);
        Collections.reverse(listS2);
        arrS2 = listS2.toArray(arrS2);
        System.out.println("arr 2 : " + Arrays.toString(arrS2));
        int count = 0;
        for (int i = 0; i < x; i++) {
            if(arrS1[i].equals(arrS2[i])){
                count ++;
            }
        }
        System.out.println("Count - x : " + count +" - " + x);
        return count == x;
    }
}
