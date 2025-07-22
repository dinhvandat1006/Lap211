package week4.bt1;

public class Student {
    private String id;
    private String studentName;
    private String semester;
    private String courseName;

    public Student(String id, String studentName, String semester, String courseName) {
        this.id = id;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    // Getter & Setter
    public String getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSemester() {
        return semester;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return studentName + " | " + courseName + " | " + semester;
    }
}
