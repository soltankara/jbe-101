import java.time.LocalTime;

public class Airplane {
    private String flightNumber;
    private String destination;
    private LocalTime departure;
    private int delayTime;

    public Airplane(String flightNumber, String destination, LocalTime departure) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.delayTime = 0;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalTime departure) {
        this.departure = departure;
    }

    public int getDelayTime() {
        return delayTime;
    }

    public void delay(int minutes) {
        this.delayTime = minutes;
        this.departure = this.departure.plusMinutes(minutes);
    }

    public void check() {
        if (delayTime == 0) {
            System.out.println("Flight " + flightNumber + " is on time.");
        } else {
            System.out.println("Flight " + flightNumber + " is delayed " + delayTime + " minutes.");
        }
    }
}
