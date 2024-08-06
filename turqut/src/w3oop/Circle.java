package turqut.src.w3oop;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    void CalculateCircumference() {
        System.out.println("Circumference is : " + 2 * Math.PI * radius);
    }

    void CalculateArea() {
        System.out.println("Area is : " + Math.PI * radius * radius);
    }
}
