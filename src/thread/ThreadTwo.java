package thread;

public class ThreadTwo extends Thread{
    private StringBuilder sb;
    private StringBuffer sf;

    public ThreadTwo(StringBuilder sb,StringBuffer sf) {
        this.sb = sb;
        this.sf = sf;
    }
    @Override
    public void run() {
            for (int i = 0; i < 15; i++) {
                System.out.println("Thread 2 : " + i + sb + sf) ;

            }
    }
}
