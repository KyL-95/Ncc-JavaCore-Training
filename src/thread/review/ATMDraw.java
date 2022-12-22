package thread.review;

public class ATMDraw implements Runnable{
    private Account acc;

    public ATMDraw(Account acc) {
        this.acc = acc;
    }

    @Override
    public void run() {
        try {
            this.acc.drawMoney(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
