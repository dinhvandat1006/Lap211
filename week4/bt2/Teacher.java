package week4.bt2;

public class Teacher extends Person {
    private int yearInProfession;
    private String contractType;
    private double salaryCoefficient;

    public Teacher() {
        super();
        this.yearInProfession = 0;
        this.contractType = "";
        this.salaryCoefficient = 0.0;
    }

    @Override
    public void inputAll(java.util.Scanner sc) {
        super.inputAll(sc);
        yearInProfession = Integer.parseInt(sc.nextLine());
        contractType = sc.nextLine();
        salaryCoefficient = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("%d | %s | %.2f\n", yearInProfession, contractType, salaryCoefficient);
    }

    public int getYearInProfession() {
        return yearInProfession;
    }
}
