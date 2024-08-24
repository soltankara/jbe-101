package turqut.src.w3oop;

public class Circle2 extends Shape {
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
