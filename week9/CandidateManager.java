package week9;

import java.util.*;
import java.util.regex.Pattern;

public class CandidateManager {
    private List<Candidate> candidates = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addCandidate(int type) {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        int birthYear = readInt("Enter Birth Year (1900–" + java.time.Year.now().getValue() + "): ", 1900, java.time.Year.now().getValue());
        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        String phone;
        while (true) {
            System.out.print("Enter Phone (>=10 digits): ");
            phone = sc.nextLine();
            if (phone.matches("\\d{10,}")) break;
            System.out.println("Invalid phone.");
        }

        String email;
        while (true) {
            System.out.print("Enter Email (e.g., abc@xyz.com): ");
            email = sc.nextLine();
            if (Pattern.matches("^\\S+@\\S+\\.\\S+$", email)) break;
            System.out.println("Invalid email.");
        }

        switch (type) {
            case 0:
                int exp = readInt("Enter years of experience (0–100): ", 0, 100);
                System.out.print("Enter Pro Skill: ");
                String proSkill = sc.nextLine();
                candidates.add(new Experience(id, firstName, lastName, birthYear, address, phone, email, type, exp, proSkill));
                break;
            case 1:
                System.out.print("Enter Graduation Date: ");
                String gradDate = sc.nextLine();
                String rank;
                while (true) {
                    System.out.print("Enter Graduation Rank (Excellence, Good, Fair, Poor): ");
                    rank = sc.nextLine();
                    if (rank.matches("(?i)Excellence|Good|Fair|Poor")) break;
                    System.out.println("Invalid rank.");
                }
                System.out.print("Enter Education: ");
                String education = sc.nextLine();
                candidates.add(new Fresher(id, firstName, lastName, birthYear, address, phone, email, type, gradDate, rank, education));
                break;
            case 2:
                System.out.print("Enter Majors: ");
                String major = sc.nextLine();
                System.out.print("Enter Semester: ");
                String semester = sc.nextLine();
                System.out.print("Enter University Name: ");
                String uni = sc.nextLine();
                candidates.add(new Intern(id, firstName, lastName, birthYear, address, phone, email, type, major, semester, uni));
                break;
        }

        System.out.print("Do you want to continue (Y/N)? ");
        if (sc.nextLine().equalsIgnoreCase("y")) {
            addCandidate(type);
        } else {
            showAll();
        }
    }

    public void showAll() {
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for (Candidate c : candidates) {
            if (c instanceof Experience) c.showMe();
        }
        System.out.println("===========FRESHER CANDIDATE==============");
        for (Candidate c : candidates) {
            if (c instanceof Fresher) c.showMe();
        }
        System.out.println("===========INTERN CANDIDATE==============");
        for (Candidate c : candidates) {
            if (c instanceof Intern) c.showMe();
        }
    }

    public void searchCandidate() {
        showAll();
        System.out.print("Input Candidate name (First or Last): ");
        String name = sc.nextLine().toLowerCase();
        System.out.print("Input type of candidate (0–2): ");
        int type = Integer.parseInt(sc.nextLine());
        System.out.println("The candidates found:");
        for (Candidate c : candidates) {
            if ((c.getFirstName().toLowerCase().contains(name) || c.getLastName().toLowerCase().contains(name)) && c.getCandidateType() == type) {
                System.out.println(c.basicInfo());
            }
        }
    }

    private int readInt(String message, int min, int max) {
        int n;
        while (true) {
            try {
                System.out.print(message);
                n = Integer.parseInt(sc.nextLine());
                if (n >= min && n <= max) return n;
            } catch (NumberFormatException ignored) {
            }
            System.out.println("Invalid input.");
        }
    }
}
