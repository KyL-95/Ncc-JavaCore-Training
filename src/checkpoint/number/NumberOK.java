package checkpoint.number;
import java.util.Scanner;
public class NumberOK {


    public static long f(long n){
        if(n == 1 ){
            return -1;
        }
        if(n % 2 == 0){
            return n/2;
        }else{
            return  -((n+1)/2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(f(n));
    }
}
