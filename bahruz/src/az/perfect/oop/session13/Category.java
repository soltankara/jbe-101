package az.perfect.oop.session13;

public enum Category implements Size {

    PHONE(1, "Phone"),
    TV(2, "Tv"),
    PC(3, "Pc");

    private Integer number;
    private String title;

    Category(Integer number, String title) {
        this.number = number;
        this.title = title;
    }

    @Override
    public String toString() {
        return number + "." + title;
    }

    @Override
    public double has(double a, double b) {
        return a + b;
    }
}
