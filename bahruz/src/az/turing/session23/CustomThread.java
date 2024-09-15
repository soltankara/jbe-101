package az.turing.session23;

public class CustomThread extends Thread {

    @Override
    public void run(){
      String threadName=Thread.currentThread().getName();
        System.out.println("Thread name is:"+threadName);
    }
}
