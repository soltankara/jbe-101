package OOPquestions.problem4;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return 2 * Math.PI * Math.pow(radius, 2);
    }

    public double getcircumference(){
        return 2 * Math.PI * radius;
    }
}
