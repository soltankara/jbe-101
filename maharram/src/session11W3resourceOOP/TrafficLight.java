package session11W3resourceOOP;

public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration){
        this.color=color;
        this.duration=duration;
    }
    public void changeColor(String newColor){
        color=newColor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public boolean isRead(){
        return color.equalsIgnoreCase("red");
    }
    public boolean isGreen(){
        return color.equalsIgnoreCase("green");
    }

    @Override
    public String toString() {
        return "TrafficLight{" +
                "color='" + color + '\'' +
                ", duration=" + duration +
                '}';
    }
}
