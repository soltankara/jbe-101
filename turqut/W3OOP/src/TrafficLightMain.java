public class TrafficLightMain {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("red", 30);

        trafficLight.checkColor();
        System.out.println("Traffic light duration is " + trafficLight.getDuration() + " now.");
        System.out.println("Color changed.");
        trafficLight.changeColor("GREEn");
        trafficLight.checkColor();

        trafficLight.setDuration(12);

        System.out.println("Traffic light duration is " + trafficLight.getDuration() + " now.");


    }
}
