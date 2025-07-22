package week3.bt2;

import java.util.Random;
import java.util.Arrays;

public class QuickSorter {
    private int[] array;

    public QuickSorter(int size) {
        array = new int[size];
        generateRandomArray();
    }

    // Sinh mảng ngẫu nhiên
    private void generateRandomArray() {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10); // Số từ 0–9
        }
    }

    public void sort() {
        quickSort(0, array.length - 1);
    }

    private void quickSort(int low, int high) {
        if (low < high) {
            int pi = partition(low, high);
            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
        }
    }

    private int partition(int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(i, j);
            }
        }

        swap(i + 1, high);
        return i + 1;
    }

    private void swap(int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public void printArray(String message) {
        System.out.println(message + Arrays.toString(array));
    }
}
