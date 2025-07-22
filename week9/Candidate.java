package week9;



public abstract class Candidate {
    protected String candidateId;
    protected String firstName;
    protected String lastName;
    protected int birthYear;
    protected String address;
    protected String phone;
    protected String email;
    protected int candidateType;

    public Candidate(String candidateId, String firstName, String lastName, int birthYear, String address, String phone, String email, int candidateType) {
        this.candidateId = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCandidateType() {
        return candidateType;
    }

    public String basicInfo() {
        return firstName + " " + lastName + " | " + birthYear + " | " + address + " | " + phone + " | " + email + " | " + candidateType;
    }

    public abstract void showMe();
}
