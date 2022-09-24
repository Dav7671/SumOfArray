package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextDouble(0, 100);
            System.out.print(arr[i] + " ");
        }

        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of array = " + sum);

    }
}