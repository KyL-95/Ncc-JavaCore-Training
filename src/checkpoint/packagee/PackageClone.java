package checkpoint.packagee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PackageClone {
    public static int inputInt(Scanner sc){
        return sc.nextInt();
    }

    public static void main(String[] args) {
        List<Integer>  list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            int ai = inputInt(sc);
            int bi = inputInt(sc);

            for (int j = bi; j > 0; j--) {
                list.add(ai);
            }
        }
        list.sort((i1,i2) -> {return i1-i2;});
        int m = inputInt(sc);
        System.out.println(list.get(m-1));
    }
}
