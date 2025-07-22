package week3.bt2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử
        System.out.print("Enter number of array: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Number must be positive.");
            return;
        }

        // Khởi tạo đối tượng QuickSorter
        QuickSorter sorter = new QuickSorter(n);

        sorter.printArray("Unsorted array: ");
        sorter.sort();
        sorter.printArray("Sorted array: ");
    }
}
