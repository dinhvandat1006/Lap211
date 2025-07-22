package week4.bt2;



public class Student extends Person {
    private int yearOfAdmission;
    private float englishScore;

    public Student() {
        super();
        this.yearOfAdmission = 0;
        this.englishScore = 0;
    }

    @Override
    public void inputAll(java.util.Scanner sc) {
        super.inputAll(sc);
        yearOfAdmission = Integer.parseInt(sc.nextLine());
        englishScore = Float.parseFloat(sc.nextLine());
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("%d | %.2f\n", yearOfAdmission, englishScore);
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }
}

