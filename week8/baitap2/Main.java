package week8.baitap2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManageEastAsiaCountries manager = new ManageEastAsiaCountries();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n===== Country Management Menu =====");
            System.out.println("1. Input the information of 11 countries in East Asia");
            System.out.println("2. Display the information of countries you've just input");
            System.out.println("3. Search the country by name");
            System.out.println("4. Display the information increasing with the country name");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                continue;
            }

            switch (choice) {
                case 1:
                    manager.addCountryInformation();
                    break;
                case 2:
                    manager.displayAllCountries();
                    break;
                case 3:
                    manager.searchCountryByName();
                    break;
                case 4:
                    manager.sortCountriesByName();
                    break;
                case 5:
                    return;
                default:
            }
        }
    }
}

