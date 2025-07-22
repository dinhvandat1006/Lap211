package week4.bt1;
import java.util.*;

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


    public void sortStudents(){
        students.sort(Comparator.comparing(Student::getStudentName));
        System.out.println("name student after sort:");
        printAllStudents();
    }

    public void updateStudent(String id) {

        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Student update:" + student);
                System.out.println("Enter new name:");

                System.out.println("Enter new semester:");

                System.out.println("Enter new course name:");

                System.out.println("Student update successfully.");
                return;
            }
        }
    }
    public void report() {
        Map<String, Integer> reportMap = new HashMap<>();
          for (Student student : students){
              String key = student.getStudentName()+ " | " + student.getCourseName();
              reportMap.put(key, reportMap.getOrDefault(key, 0) + 1);

          }


        System.out.println("Report of students:");
        for (Map.Entry<String, Integer> entry : reportMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }
}
