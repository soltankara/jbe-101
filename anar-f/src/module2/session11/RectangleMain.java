package module2.session11;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(10);
        int area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println(area);
    }
}
