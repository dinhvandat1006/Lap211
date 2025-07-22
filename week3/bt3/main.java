package week3.bt3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayHandler arrayHandler = new ArrayHandler();
        BinarySearch binarySearch = new BinarySearch();

        System.out.print("Enter number of array: ");
        int size = scanner.nextInt();

        System.out.print("Enter search value: ");
        int searchValue = scanner.nextInt();

        arrayHandler.generateRandomArray(size, 0, 100);
        arrayHandler.sortArray();
        int[] sortedArray = arrayHandler.getArray();

        arrayHandler.printArray();

        int index = binarySearch.search(sortedArray, searchValue);
        if (index != -1) {
            System.out.println("Found " + searchValue + " at index: " + index);
        } else {
            System.out.println(searchValue + " not found in array.");
        }

        scanner.close();
    }
}
