package week3.b1;

import java.util.Random;

class Bubblesort {
    private int[] array;
    private int n;
    private int j;

    public Bubblesort(int size) {
        this.array = new int[size];
        this.n = size;
        this.j = size;
        generateRandomArray();
    }

    public Bubblesort(int[] array, int j, int n) {
        this.array = array;
        this.j = j;
        this.n = n;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    // viet 1 ham tim kiem 1 so, neu tim thay thi tra ve vi tri cua so do trong array
    public int linearSearch(int target){
        for(int i = 0; i < array.length; i++){
            if(array[i] == target) {
                return i;
            }
        }
        return -1;
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

    public void bubbleSort(){
        for(int i = n - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
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

    public void quickSort(int low, int high){
        if(low < high){
            int key = partition(low, high);
            quickSort(low, key - 1);
            quickSort(key + 1, high);
        }
    }

    private int partition(int low, int high){
        int key = array[low];
        int i = low;
        int j = high;
        while (i < j){
            while (i <= high && array[i] <= key) i++;
            while (array[j] > key) j--;
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j --;
            }
        }
        int temp = array[low];
        array[low] = array[j];
        array[j] = temp;
        return j;
    }
}