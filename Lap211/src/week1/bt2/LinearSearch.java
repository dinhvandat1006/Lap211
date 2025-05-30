package week1.bt2;
import java.util.Random;

public class LinearSearch {

        private int[] array;

        public LinearSearch(int size) {
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

        public int search(int target) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    return i;
                }
            }
            return -1; // không tìm thấy
        }
    }


