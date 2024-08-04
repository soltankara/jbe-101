package az.perfect.oop.session10and11exercise;

public class Rectangle {

    //Exercise 3

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double areaOfRectangle() {
        return length * width;
    }

    public double perimeterOfRectangle() {
        return (length + width) * 2;
    }
}
