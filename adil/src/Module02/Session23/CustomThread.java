package Module02.Session23;

public class CustomThread extends Thread{
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread name is " + threadName);
    }
}
