package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = Creator.createArray(5);
        Filler.fillArray(arr, 20, 10);

        Printer.printArray(arr);
    }
}
