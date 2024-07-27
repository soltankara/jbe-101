package session11W3resourceOOP;
public class RectangleForTask16 extends Shape {
    private double length;
    private double width;
    public RectangleForTask16(double width, double length) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}
