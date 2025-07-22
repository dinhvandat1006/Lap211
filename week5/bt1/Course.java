package week5.bt1;

public class Course {
    protected String courseID;
    protected String courseName;
    protected String instructor;
    protected int credits;

    public Course() {
        this.courseID = "";
        this.courseName = "";
        this.instructor = "";
        this.credits = 0;
    }

    public void inputAll(String courseID, String courseName, String instructor, int credits) {
        if (courseID == null || courseID.isEmpty() ||
                courseName == null || courseName.isEmpty() ||
                credits <= 0) {
            System.out.println("Invalid course input!");
            return;
        }
        this.courseID = courseID;
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    public String toString() {
        return "CourseID: " + courseID + ", Name: " + courseName + ", Instructor: " + instructor + ", Credits: " + credits;
    }
}

