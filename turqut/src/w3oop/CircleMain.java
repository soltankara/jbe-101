package turqut.src.w3oop;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.5);
        circle1.CalculateCircumference();
        circle1.CalculateArea();

        circle1.setRadius(2.5);

        System.out.println("Updated details : ");

        circle1.CalculateCircumference();
        circle1.CalculateArea();
    }
}
