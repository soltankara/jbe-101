package session11W3resourceOOP;
public class CircleForTask16 extends Shape {
    private double radius;

    public CircleForTask16(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
