package az.turing.session23;

public class Main {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        Thread thread=new CustomThread();
        thread.start();
       thread.run();
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        try {
//            print();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("I am here ");
//
//    }
//
//    static void print() throws InterruptedException {
//        Runnable runnable = () -> {
//            for (int i = 1; i < 11; i++) {
//                System.out.println(i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//
//        };
//        Thread thread = new Thread(runnable);
//        thread.start();
//        //  thread.join();
    }
}
