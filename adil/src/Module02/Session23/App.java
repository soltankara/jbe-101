package Module02.Session23;

public class App {
    public static void main(String[] args) {
//        print();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("I am here");
        System.out.println(Thread.currentThread().getName());
        Thread thread = new CustomThread();
        thread.start();
        thread.run();
    }

    //    private static void print() {
//        Thread thread = new MyThread();
//        thread.start();
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
    private static void print() {
        Runnable runnable = () -> {
            for (int i = 1; i < 11; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
