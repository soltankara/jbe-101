package ClassworkMaps;

public enum Grades {
    A("A"),
    B("B"),
    C("C"),
    D("D"),
    E("E");
    private String mark;

    Grades(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

}
