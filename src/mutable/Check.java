package mutable;

public class Check {
    public static void main(String[] args) {
        boolean result = integerEquals(129,129);
        System.out.println(result);
    }

    public static boolean integerEquals(Integer a, Integer b){
        return a == b;
    }
}
