package az.perfect.oop.session10and11exercise;

public class Circle {

    //Exercise 4
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }
}
