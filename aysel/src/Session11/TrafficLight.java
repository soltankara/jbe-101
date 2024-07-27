package Session11;

public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;


    }

    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isRed() {
        return "Red".equalsIgnoreCase(color);
    }

    public boolean isGreen() {
        return "Green".equalsIgnoreCase(color);
    }

    public void displayTrafficLightState() {
        System.out.println("Color: " + color);
        System.out.println("Duration: " + duration + " seconds");
    }
}

