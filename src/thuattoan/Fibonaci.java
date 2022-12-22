package thuattoan;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Fibonaci {
    // Cho dẫy số theo quy luật sau : 4, 7, 5, 16, 28, 49, ...
//	f(n) = f(n-1) + f(n-2) + f(n-3);
// Viết function return phần tử thứ n

    // C1 : dùng for
    public static void main(String[] args) {
        int f0 = 4;
        int f1 = 7;
        int f2 = 5;
        int fn = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử thứ n");
        int n = sc.nextInt();

        for (int i = 3; i < n; i++) {
            fn = f0 + f1 + f2;
            f0 = f1;
            f1 = f2;
            f2 = fn;
        }
        System.out.println("fn = " + fn);
        System.out.println("Đệ quy " + "fn = " + fib(n ));
        String fileName = "lines.txt";
    }

    // C2 : dùng đệ quy
    static int fib(int n) {
        if (n == 1) {
            return 4;
        } else if (n == 2) {
            return 7;
        } else if (n == 3) {
            return 5;
        } else
        return fib(n - 1) + fib(n - 2) + fib(n - 3);
        }

    }


