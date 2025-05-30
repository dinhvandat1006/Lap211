package week3.b1;

import java.util.Random;

class Bubblesort {
    private int[] array;

    public Bubblesort(int size) {
        array = new int[size];
        generateRandomArray();
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    private void generateRandomArray() {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10); // random từ 0 đến 9
        }
    }

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public void bubbleSort() {
        for (int k = 0; k < array.length - 1; k++) {
            for (int h = 0; h < array.length - 1 - k; h++) {
                if (array[h] > array[h + 1]) {
                    int tmp = array[h];
                    array[h] = array[h + 1];
                    array[h + 1] = tmp;
                }
            }
        }
    }

    public int binarySearch(int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target)
                return mid;
            if (array[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }


    public void quickSort(int low , int hight){
      if(low < hight){
          int key = partition(low, hight);
          quickSort(low, key -1);
          quickSort(key + 1, hight);
      }

    }

    private int partition (int low, int hight){
        int key = array[low];
        int i = low;
        int j = hight;
        while (i <= j){
            while (i <= hight && array[i] <= key) i++;
            while (array[j] > key) j--;
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[low];
        array[low] = array[j];
        array[j] = temp;
        return j;
    }
}
