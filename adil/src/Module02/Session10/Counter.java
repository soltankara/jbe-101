package Module02.Session10;

public class Counter {
    static int count = 0;

    public Counter() {
        count++;
    }
    public void displayCount(){
        System.out.println("Count: " + count);
    }
}
