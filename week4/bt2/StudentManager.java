package week4.bt2;

import java.util.*;

public class StudentManager {
    private List<Teacher> teachers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public void run() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            Teacher t = new Teacher();
            t.inputAll(sc);
            teachers.add(t);
        }

        teachers.sort((a, b) -> Integer.compare(b.getYearInProfession(), a.getYearInProfession()));
        for (Teacher t : teachers) t.display();

        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            Student s = new Student();
            s.inputAll(sc);
            students.add(s);
        }

        students.sort(Comparator.comparingInt(Student::getYearOfAdmission));
        for (Student s : students) s.display();

        String nameToSearch = sc.nextLine();
        for (Teacher t : teachers)
            if (t.getFullName().equalsIgnoreCase(nameToSearch))
                t.display();
        for (Student s : students)
            if (s.getFullName().equalsIgnoreCase(nameToSearch))
                s.display();
    }
}

