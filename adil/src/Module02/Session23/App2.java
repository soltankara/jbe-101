package Module02.Session23;

public class App2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread thread = new CustomThread();
        thread.start();
        thread.run();
    }
}
