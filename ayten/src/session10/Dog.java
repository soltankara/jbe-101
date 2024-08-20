package session10;

public class Dog extends Animal implements Runnable{
    @Override
    public void run() {
        System.out.printf("%s is running",getName());
    }
//    public void eat(){
//        System.out.println("this dog eats food");
//    }

}
