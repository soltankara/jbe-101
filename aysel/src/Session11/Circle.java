package Session11;

public class Circle {
    public double radius;
    public double area;
    public double circumference;
    public double pi = 3.14;


    public Circle(double radius) {
        this.radius=radius;
        calculateAreaAndCircumference();
    }
    public void setRadius(double radius) {
        this.radius = radius;
        calculateAreaAndCircumference(); // Radius dəyişəndə sahə və çevrəni yenilə
    }

    // Sahəni və çevrəni hesablayan metod
    private void calculateAreaAndCircumference() {
        this.area = pi * Math.pow(radius, 2);
        this.circumference = 2 * pi * radius;
    }

    // Sahəni əldə edən metod
    public double getArea() {
        return area;
    }

    // Çevrəni əldə edən metod
    public double getCircumference() {
        return circumference;
    }
}




