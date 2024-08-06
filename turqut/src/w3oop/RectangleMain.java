package turqut.src.w3oop;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(4.5, 5.0);
        rec1.CalculateArea(rec1.getWidth(), rec1.getHeight());
        rec1.CalculatePerimeter();
    }
}
