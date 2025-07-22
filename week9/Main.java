package week9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CandidateManager manager = new CandidateManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCANDIDATE MANAGEMENT SYSTEM");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Internship");
            System.out.println("4. Searching");
            System.out.println("5. Exit");
            System.out.print("Please choose 1-5: ");

            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    manager.addCandidate(0);
                    break;
                case "2":
                    manager.addCandidate(1);
                    break;
                case "3":
                    manager.addCandidate(2);
                    break;
                case "4":
                    manager.searchCandidate();
                    break;
                case "5":
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
