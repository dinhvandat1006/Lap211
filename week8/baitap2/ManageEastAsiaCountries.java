package week8.baitap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManageEastAsiaCountries {
    private ArrayList<EastAsiaCountry> countryList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addCountryInformation() {
        if (countryList.size() >= 11) return;

        System.out.print("Enter country code: ");
        String code = scanner.nextLine();
        System.out.print("Enter country name: ");
        String name = scanner.nextLine();

        float area;
        while (true) {
            try {
                System.out.print("Enter total area: ");
                area = Float.parseFloat(scanner.nextLine());
                if (area > 0) break;
            } catch (Exception e) {
            }
        }

        System.out.print("Enter country terrain: ");
        String terrain = scanner.nextLine();

        countryList.add(new EastAsiaCountry(code, name, area, terrain));
    }

    public void displayAllCountries() {
        if (countryList.isEmpty()) return;
        System.out.printf("%-10s %-20s %-10s %-20s\n", "Code", "Name", "Area", "Terrain");
        for (EastAsiaCountry country : countryList) {
            country.display();
        }
    }

    public void searchCountryByName() {
        System.out.print("Enter country name to search: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (EastAsiaCountry country : countryList) {
            if (country.getCountryName().equalsIgnoreCase(name)) {
                System.out.printf("%-10s %-20s %-10s %-20s\n", "Code", "Name", "Area", "Terrain");
                country.display();
                found = true;
            }
        }
    }

    public void sortCountriesByName() {
        if (countryList.isEmpty()) return;
        ArrayList<EastAsiaCountry> sortedList = new ArrayList<>(countryList);
        Collections.sort(sortedList, Comparator.comparing(EastAsiaCountry::getCountryName));
        System.out.printf("%-10s %-20s %-10s %-20s\n", "Code", "Name", "Area", "Terrain");
        for (EastAsiaCountry country : sortedList) {
            country.display();
        }
    }
}

