package checkpoint.number;

import java.util.Scanner;

public class Number2 {
    public static long input (Scanner scanner) {
        while (true) {
            try {
                System.out.println("Mời nhập số nguyên dương n :");
                String input = scanner.nextLine().trim();
                long n = Long.parseLong(input);
                if(input.length() >=16){
                    throw new StringIndexOutOfBoundsException("Số đã nhập quá lớn, mời nhập lại");
                }
                if (n >= 1) {
                    return n;
                } throw new Exception(n + " Không phải số nguyên dương");
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng số nguyên");
            } catch (StringIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static long f(long n){
        if(n % 2 == 0){
            return n/2;
        } return (long) -(n/2 - 0.5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = input(sc);
        System.out.println(f(n));


    }
}
