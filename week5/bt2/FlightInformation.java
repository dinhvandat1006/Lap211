package week5.bt2;

import java.time.LocalTime;

public class FlightInformation {
    private String flightNumber;
    private int seatNumber;
    private LocalTime timePickUp;

    public FlightInformation() {
        this.flightNumber = "";
        this.seatNumber = 0;
        this.timePickUp = LocalTime.now();
    }

    public FlightInformation(String flightNumber, int seatNumber, LocalTime timePickUp) {
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.timePickUp = timePickUp;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public LocalTime getTimePickUp() {
        return timePickUp;
    }

    public String toString() {
        return "Flight: " + flightNumber + ", Seat: " + seatNumber + ", PickUp: " + timePickUp;
    }
}

