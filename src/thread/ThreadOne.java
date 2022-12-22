package thread;

public class ThreadOne extends Thread {
private StringBuilder sb;
private StringBuffer sf;

    public ThreadOne(StringBuilder sb,StringBuffer sf) {
        this.sb = sb;
        this.sf = sf;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1 : " + i + sb );

        }

    }

}
