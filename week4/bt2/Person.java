package week4.bt2;

public class Person {
    protected String id;
    protected String fullName;
    protected String phoneNumber;
    protected int yearOfBirth;
    protected String major;

    public Person() {
        this.id = "";
        this.fullName = "";
        this.phoneNumber = "";
        this.yearOfBirth = 0;
        this.major = "";
    }

    public void inputAll(java.util.Scanner sc) {
        id = sc.nextLine();
        fullName = sc.nextLine();
        phoneNumber = sc.nextLine();
        yearOfBirth = Integer.parseInt(sc.nextLine());
        major = sc.nextLine();
    }

    public String getFullName() {
        return fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void display() {
        System.out.printf("%s | %s | %s | %d | %s\n", id, fullName, phoneNumber, yearOfBirth, major);
    }
}
