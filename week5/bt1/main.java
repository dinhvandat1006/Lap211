package week5.bt1;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        // Test OnlineCourse
        OnlineCourse oc = new OnlineCourse();
        oc.inputAll("C001", "Java OOP", "Mr. Dinh", 3, "Udemy", "Mr. A, Ms. B", "Self-paced");
        System.out.println(oc);

        // Test OfflineCourse
        OfflineCourse ofc = new OfflineCourse();
        ofc.inputAll("C002", "Advanced Java", "Ms. Hoa", 4,
                LocalDate.of(2025, 8, 1),
                LocalDate.of(2025, 8, 31),
                "FPT Campus");
        System.out.println(ofc);
    }
}

