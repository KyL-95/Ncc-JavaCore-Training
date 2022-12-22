package exception;

import java.util.Scanner;

public class TryCatchResource {
    static final int x = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        try
//        {
            System.out.println("Nhập Integer: ");
            int s = Integer.parseInt(sc.nextLine());
            System.out.println(s);
//        } catch (NumberFormatException e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            sc.close();
//        }
    }
}
