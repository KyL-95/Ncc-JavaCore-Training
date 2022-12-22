package thuattoan.dailylcode;

public class DeQuy {
    public static int deQuy(int n){
        if(n == 0){
            return 1;
        }
        return deQuy(n - 1) * n;
    }
    public static void main(String[] args) {
        int x = deQuy(3);
        System.out.println(x);
    }
}
