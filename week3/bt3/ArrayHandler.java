package week3.bt3;



import java.util.Arrays;
import java.util.Random;

public class ArrayHandler {
    private int[] array;

    public void generateRandomArray(int size, int min, int max) {
        Random rand = new Random();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(max - min + 1) + min;
        }
    }

    public void sortArray() {
        Arrays.sort(array);
    }

    public int[] getArray() {
        return array;
    }

    public void printArray() {
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}

