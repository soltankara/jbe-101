package OOPquestions.problem8;

/*Write a Java program to create class called"TrafficLight" with attributes for color and duration,
  and methods to change the color and check for red or green.*/
public class MainPart {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("green", 10);

        System.out.println(light.isGreen());
        System.out.println(light.getDuration());
        System.out.println(light.isRed());
    }
}
