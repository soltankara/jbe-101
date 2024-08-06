package turqut.src.w3oop;

public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }

    public void checkColor() {
        if (color.equalsIgnoreCase("red")) {
            System.out.println("Traffic light color is red now.");
        } else {
            System.out.println("Traffic light color is green now.");
        }
    }
}
