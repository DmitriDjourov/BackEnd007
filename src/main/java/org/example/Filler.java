package org.example;

import java.util.Arrays;
import java.util.Random;

public class Filler {


    //Метод для создания и заполнения массива случайными числами
    public static void createArray(int[] array) {
//        int[] array = new int[N];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
        }
    }
}
