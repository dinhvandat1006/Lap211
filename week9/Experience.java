package week9;



public class Experience extends Candidate {
    private int expInYear;
    private String proSkill;

    public Experience(String id, String fName, String lName, int birthYear, String address, String phone, String email, int type, int exp, String proSkill) {
        super(id, fName, lName, birthYear, address, phone, email, type);
        this.expInYear = exp;
        this.proSkill = proSkill;
    }

    @Override
    public void showMe() {
        System.out.println(firstName + " " + lastName);
    }
}

