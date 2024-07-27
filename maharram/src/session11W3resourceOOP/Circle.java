package session11W3resourceOOP;
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

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumferene() {
        return 2 * Math.PI * radius;
    }
    public void printInfoAboutCircle(){
        System.out.println("the radius of circle : "+radius);
        System.out.println("the area of circle : "+calculateArea());
        System.out.println("the circumference of circle : "+calculateCircumferene());
    }
}
