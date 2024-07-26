public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    void CalculateArea(double width, double height) {
        System.out.println("Area is : " + width * height);
    }

    void CalculatePerimeter() {
        System.out.println("Perimeter is : " + 2 * (width + height));
    }
}
