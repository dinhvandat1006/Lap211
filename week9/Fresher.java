package week9;



public class Fresher extends Candidate {
    private String graduationDate;
    private String graduationRank;
    private String education;

    public Fresher(String id, String fName, String lName, int birthYear, String address, String phone, String email, int type,
                   String graduationDate, String rank, String education) {
        super(id, fName, lName, birthYear, address, phone, email, type);
        this.graduationDate = graduationDate;
        this.graduationRank = rank;
        this.education = education;
    }

    @Override
    public void showMe() {
        System.out.println(firstName + " " + lastName);
    }
}

