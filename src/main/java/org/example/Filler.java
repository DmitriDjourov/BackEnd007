package org.example;

public class Filler {
    public static void fillArray(int[] array, int maxNum, int minNum) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (maxNum - minNum) + 1) + minNum;
        }
    }
}
