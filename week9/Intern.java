package week9;

public class Intern extends Candidate {
    private String major;
    private String semester;
    private String university;

    public Intern(String id, String fName, String lName, int birthYear, String address, String phone, String email, int type,
                  String major, String semester, String university) {
        super(id, fName, lName, birthYear, address, phone, email, type);
        this.major = major;
        this.semester = semester;
        this.university = university;
    }

    @Override
    public void showMe() {
        System.out.println(firstName + " " + lastName);
    }
}
