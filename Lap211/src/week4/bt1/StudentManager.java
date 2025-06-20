package week4.bt1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void createStudent(Student student) {
        students.add(student);
    }

    public void printAllStudents() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    public void deleteStudent(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) { // get(i) la phuong thuc co san trong arraylist
                students.remove(i);
                break;
            }
        }
    }

    public Student findStudentByID(String id) {
        for (Student student : students) {
            if (student.getId().equals(id))
                return student;
        }
        return null;
    }

    public void sortStudentsByName() {
        students.sort(Comparator.comparing(Student::getStudentName));
        System.out.println("Name of students after sorting:");
        printAllStudents();
    }

}
