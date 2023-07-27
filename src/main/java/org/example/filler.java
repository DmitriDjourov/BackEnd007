package org.example;

import java.util.Arrays;
import java.util.Random;

public class filler {
    public static void main(String[] args) {
        int N = 5;
        int[] array = createArray(N);
        System.out.printf("В массиве %s  ", Arrays.toString(array));
    }

    //Метод для создания и заполнения массива случайными числами
    public static int[] createArray(int N) {
        int[] array = new int[N];
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * N) + 1;
        }
        return array;
    }
}
