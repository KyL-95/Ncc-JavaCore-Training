package thread.review;

public class Test {
    public static void main(String[] args) {
        Account acc = new Account("Khanh",15);

        Runnable ATM1 = new ATMDraw(acc);
        Thread you = new Thread(ATM1);
        Runnable ATM2 = new ATMDraw(acc);
        Thread thief = new Thread(ATM2);


        you.start();
        thief.start();
    }
}
