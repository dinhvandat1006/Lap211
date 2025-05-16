
package week1.bt2;

import java.util.Random;

public class LinearSearchArray {
    private int[] array;
    private int size;

    public LinearSearchArray(int size) {
        this.size = size;
        this.array = new int[size];
    }


public linearSearchArray(int n) {
    this.n = n;
    this.array = new int[n];
    Random random = new Random();
    for (int i = 0; i < n; i++) {
        array[i] = random.nextInt(100); // Fill with random numbers between 0 and 99
    }

