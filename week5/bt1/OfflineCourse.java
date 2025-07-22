package week5.bt1;

import java.time.LocalDate;

public class OfflineCourse extends Course {
    private LocalDate begin;
    private LocalDate end;
    private String campus;

    public OfflineCourse() {
        super();
        this.begin = null;
        this.end = null;
        this.campus = "";
    }

    public void inputAll(String courseID, String courseName, String instructor, int credits,
                         LocalDate begin, LocalDate end, String campus) {
        super.inputAll(courseID, courseName, instructor, credits);
        if (campus == null || campus.isEmpty() ||
                begin == null || end == null ||
                begin.isAfter(end) || begin.isBefore(LocalDate.now())) {
            System.out.println("Invalid offline course input!");
            return;
        }
        this.begin = begin;
        this.end = end;
        this.campus = campus;
    }

    public String toString() {
        return super.toString() + ", Begin: " + begin + ", End: " + end + ", Campus: " + campus;
    }
}

