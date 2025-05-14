  import java.util.Scanner;
import java.util.Random;


public class BT2 {
// Bài 2: Tìm kiếm tuyến tính
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Bước 1: Nhập số phần tử của mảng
        System.out.print("Enter number of array: ");
        int n = scanner.nextInt();

        // Tạo mảng và gán giá trị ngẫu nhiên từ 0 đến 10
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(11); // random từ 0 đến 10
        }

        // Hiển thị mảng
        System.out.print("The array: [");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            if (i != n - 1) System.out.print(", ");
        }
        System.out.println("]");

        // Bước 2: Nhập giá trị cần tìm
        System.out.print("Enter search value: ");
        int searchValue = scanner.nextInt();

        // Bước 3: Tìm kiếm tuyến tính
        int foundIndex = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == searchValue) {
                foundIndex = i;
                break;
            }
        }

        // Bước 4: In kết quả
        if (foundIndex != -1) {
            System.out.println("Found " + searchValue + " at index: " + foundIndex);
        } else {
            System.out.println(searchValue + " not found in the array.");
        }

        scanner.close();
    }
}


