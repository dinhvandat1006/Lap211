package week5.bt2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Reservation> list = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("*** Reservation Management ***");
            System.out.println("1. Create new reservation");
            System.out.println("2. Print all");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    createReservation();
                    break;
                case 2:
                    printAll();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    public static void createReservation() {
        System.out.print("Booking ID (6 digits): ");
        String id = sc.nextLine();
        System.out.print("Customer name: ");
        String name = sc.nextLine();
        System.out.print("Phone (12 digits): ");
        String phone = sc.nextLine();
        System.out.print("Room number (4 digits): ");
        int room = Integer.parseInt(sc.nextLine());
        System.out.print("Booking date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(sc.nextLine());

        System.out.print("Need airport pickup? (Y/N): ");
        String pickup = sc.nextLine();
        FlightInformation flight = null;
        if (pickup.equalsIgnoreCase("Y")) {
            System.out.print("Flight number: ");
            String flightNum = sc.nextLine();
            System.out.print("Seat number: ");
            int seat = Integer.parseInt(sc.nextLine());
            System.out.print("Time pickup (HH:mm): ");
            LocalTime time = LocalTime.parse(sc.nextLine());
            flight = new FlightInformation(flightNum, seat, time);
        }

        Reservation r = new Reservation(id, name, phone, room, date, flight);
        list.add(r);
        System.out.println("Reservation added.");
    }

    public static void printAll() {
        for (Reservation r : list) {
            System.out.println(r);
        }
    }
}

