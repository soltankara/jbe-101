package Module02.Session11.CW;

public class Dog extends Animal implements Runnable {
    @Override
    public void run() {
        System.out.printf("%s is running\n", getName());
    }
}
