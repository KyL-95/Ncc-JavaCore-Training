package checkpoint.packagee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Package {
    public static int inputBi(Scanner sc, int max){ //  Số bao hàng
        System.out.println("Enter bi value <= " + max);
        return sc.nextInt();
    }

    public static int inputAi(Scanner sc, int max){ // Khối lượng 1 bao
        System.out.println("Enter ai value <= " + max);
        return sc.nextInt();
    }

    public static int inputM(Scanner sc, int size ){
        System.out.println("Enter M value <= " +  size);
        return sc.nextInt();
    }

    // tìm phần tử nhỏ thứ n của mảng 
    public static void main(String[] args) {
        List<Integer>  list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int max = 1000000000;
        System.out.println("Enter N value");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("---- Lần " + i + " -----");
            int ai = inputAi(sc,max);
            int bi = inputBi(sc,max);

            for (int j = 0; j < bi; j++) {
                list.add(ai);
            }
        }
        list.sort((i1,i2) -> {return i1-i2;});
        System.out.println(list.toString());
       int m = inputM(sc,list.size());
        System.out.println(list.get(m-1));
    }
}
