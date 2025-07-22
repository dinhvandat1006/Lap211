package week4.bt1;

public class Mainn {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        // Thêm 3 sinh viên mẫu
        studentManager.createStudent(new Student("DE01", "Cong", "SP25", "Java"));
        studentManager.createStudent(new Student("DE02", "Tung", "SP25", ".NET"));
        studentManager.createStudent(new Student("DE03", "Huy", "SP25", "Java"));

        System.out.println(" Danh sách sinh viên ban đầu:");
        studentManager.printAllStudents();


        System.out.println(" Xóa sinh viên có ID = DE02");
        studentManager.deleteStudent("DE02");

        System.out.println("Danh sách sau khi xóa:");
        studentManager.printAllStudents();


        System.out.println(" Tìm sinh viên có ID = DE04");


        Student foundStudent = studentManager.findStudentByID("DE04");
        if(foundStudent != null){
            System.out.println("tim thay sv");
            System.out.println(foundStudent);
        }else{
           System.out.println("khong tim thay ");

        }

        System.out.println(" Cập nhật sinh viên có ID = DE04");

        studentManager.createStudent(new Student("DE04", "Thao", "SP25", "NodeJS"));
        studentManager.updateStudent("DE04");

        System.out.println(" Danh sách sau khi cập nhật:");
        studentManager.printAllStudents();


        System.out.println(" Báo cáo sinh viên:");
        studentManager.report();
    }
}
