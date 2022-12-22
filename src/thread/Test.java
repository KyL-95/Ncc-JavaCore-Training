package thread;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("builder");
        StringBuffer sf1 = new StringBuffer("buffer");
        Runnable t1 = new ThreadOne(sb1,sf1);
//        Runnable t3 = new ThreadOne(sb1);
        Runnable t2 = new ThreadTwo(sb1,sf1);
//        System.out.println(t1.isAlive());

//        Thread th1 = new Thread(t1);
//        Thread th2 = new Thread(t2);

        Thread th1 = new ThreadOne(sb1,sf1);
        Thread th2 = new ThreadTwo(sb1,sf1);
        th1.start();

        th2.start();
//        System.out.println(ThreadOne.activeCount());
        }

}