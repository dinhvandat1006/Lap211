package week5.bt1;

public class OnlineCourse extends Course {
    private String platform;
    private String instructors;
    private String note;

    public OnlineCourse() {
        super();
        this.platform = "";
        this.instructors = "";
        this.note = "";
    }

    public void inputAll(String courseID, String courseName, String instructor, int credits,
                         String platform, String instructors, String note) {
        super.inputAll(courseID, courseName, instructor, credits);
        if (platform == null || platform.isEmpty() || note == null || note.isEmpty()) {
            System.out.println("Invalid online course input!");
            return;
        }
        this.platform = platform;
        this.instructors = instructors;
        this.note = note;
    }

    public String toString() {
        return super.toString() + ", Platform: " + platform + ", Instructors: " + instructors + ", Note: " + note;
    }
}

