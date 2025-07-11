package week3.b1;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Bubblesort sorter = new Bubblesort(10);

        System.out.println("Mảng ban đầu:");
        sorter.printArray();

        sorter.bubbleSort();
        System.out.println("Sau khi Bubble Sort:");
        sorter.printArray();

        // Tìm kiếm nhị phân
        int target = 5;
        int result = sorter.binarySearch(target);
        if (result != -1) {
            System.out.println("Tìm thấy " + target + " tại chỉ số " + result);
        } else {
            System.out.println("Không tìm thấy " + target + " trong mảng.");
        }

        sorter = new Bubblesort(10);
        System.out.println("\nMảng mới:");
        sorter.printArray();

        sorter.quickSort(0, sorter.getArray().length - 1);
        System.out.println("Sau khi Quick Sort:");
        sorter.printArray();

        // Tìm kiếm tuyến tính
        target = 5; // Reuse the existing target variable
        result = sorter.linearSearch(target);
        System.out.println("\nLinear Search for " + target + ": ");
        if (result != -1) {
            System.out.println("Found at index: " + result);
        } else {
            System.out.println("Not found");
        }
    }
}