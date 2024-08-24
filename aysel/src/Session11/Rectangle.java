package Session11;

public class Rectangle {
    private double width;
    private double height;
    private double area;
    private double perimeter;

    public Rectangle (double width,double height){
        this.area=width*height;
        this.perimeter=2*(width+height);


    }



    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
