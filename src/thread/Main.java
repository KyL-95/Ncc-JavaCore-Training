package thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        // cách 1 :
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 30; i++) {
                    System.out.println(" Thread 1 > " + i);
                }
            }
        });

        t.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 30; i++) {
                    System.out.println(" Thread 2 > " + i);
                }
            }
        });

        Thread t3 = new Thread(()->{
            for (int i = 0; i < 30; i++) {
                System.out.println(" Thread 3 > " + i);
            }
        });

        t2.start();
        // Cách 2:
        new Thread(new Runnable() {
            @Override
            public void run() {
            // to do ...
            }
        }).start();

        System.out.println("End");
    }
}
