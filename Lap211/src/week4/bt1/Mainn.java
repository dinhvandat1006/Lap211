package week4.bt1;

public class Mainn {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        studentManager.createStudent(new Student("DE01","cong","SP25","Java"));
        studentManager.createStudent(new Student("DE02","tung","SP25",".net"));
        studentManager.createStudent(new Student("DE03","huy","SP25","Java"));

        System.out.println("Danh sach sv ban dau");
        studentManager.printAllStudents();

        System.out.println("Xoa sinh vien co id = DE02");
        studentManager.deleteStudent("DE02");

        System.out.println("Danh  sach sv sau khi xoa");
        studentManager.printAllStudents();
    }

}