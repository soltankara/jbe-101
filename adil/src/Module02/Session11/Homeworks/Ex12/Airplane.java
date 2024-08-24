package Module02.Session11.Homeworks.Ex12;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Airplane {
    //12. Write a Java program to create a class called "Airplane" with a flight number, destination, and
    // departure time attributes, and methods to check flight status and delay.
    private int flightNumber;
    private String destination;
    private LocalTime departureTime;
    private int delayTime;

    public Airplane(int flightNumber, String destination, LocalTime departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delayTime = 0;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public int getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(int delayTime) {
        this.delayTime = delayTime;
        this.departureTime = this.departureTime.plusMinutes(delayTime);
    }

    public void checkStatus() {
        if (delayTime == 0) System.out.println("Flight " + flightNumber + " is on time.");
        else {
            System.out.println("Flight " + flightNumber + " is delayed by " + delayTime + " minutes. It will " +
                    "be at " + departureTime);
        }
    }
}
