public class ShapeMain {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle2(4.0, 5.0);
        Shape circle = new Circle2(5.0);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Area and perimeters of rectangle : ");
        System.out.println("Area : " + rectangle.getArea());
        System.out.println("Perimeter : " + rectangle.getPerimeter());
        System.out.println();
        System.out.println("Area and perimeters of circle : ");
        System.out.println("Area : " + circle.getArea());
        System.out.println("Perimeter : " + circle.getPerimeter());
        System.out.println();
        System.out.println("Area and perimeters of triangle : ");
        System.out.println("Area  : " + triangle.getArea());
        System.out.println("Perimeter : " + triangle.getPerimeter());
    }
}
