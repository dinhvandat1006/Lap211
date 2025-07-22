package week1.bt2;

import java.util.Scanner;
import java.util.Arrays;


 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of array: ");
        int size = sc.nextInt();

        System.out.print("Enter search value: ");
        int value = sc.nextInt();

        LinearSearch ls = new LinearSearch(size);
        int[] arr = ls.getArray();
        int index = ls.search(value);

        System.out.println("The array: " + Arrays.toString(arr));
        if (index != -1) {
            System.out.println("Found " + value + " at index: " + index);
        } else {
            System.out.println(value + " not found in the array.");
        }

        sc.close();
    }
}


