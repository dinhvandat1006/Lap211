package week5.bt2;

import java.time.LocalDate;

public class Reservation {
    private String bookingID;
    private String customerName;
    private String phoneNumber;
    private int roomNumber;
    private LocalDate bookingDate;
    private FlightInformation flightInfo;

    public Reservation() {
        this.bookingID = "";
        this.customerName = "";
        this.phoneNumber = "";
        this.roomNumber = 0;
        this.bookingDate = LocalDate.now();
        this.flightInfo = null;
    }

    public Reservation(String bookingID, String customerName, String phoneNumber, int roomNumber,
                       LocalDate bookingDate, FlightInformation flightInfo) {
        this.bookingID = bookingID;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
        this.bookingDate = bookingDate;
        this.flightInfo = flightInfo;
    }

    // Getters
    public String getBookingID() {
        return bookingID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public FlightInformation getFlightInfo() {
        return flightInfo;
    }

    public String toString() {
        return "ID: " + bookingID + ", Name: " + customerName + ", Phone: " + phoneNumber +
                ", Room: " + roomNumber + ", Date: " + bookingDate + ", " +
                (flightInfo != null ? flightInfo.toString() : "No Flight Info");
    }
}

