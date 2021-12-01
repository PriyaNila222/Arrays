package com.company;

//Write a function to find the min and max value of an array

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength = scanner.nextInt();

        System.out.println("Enter the elements of the array: ");
        int[] array = new int[arrayLength];
        for (int value = 0; value < arrayLength; value++) {
            array[value] = scanner.nextInt();
        }

        maxValue(array);
        minValue(array);
    }

    public static void maxValue(int[] array) {
        int arrayLength = array.length;
        int maxValue = 0;
        for(int value = 0; value < arrayLength; value++) {
            if(array[value] > maxValue) {
                maxValue = array[value];
            }
        }
        System.out.println("The maximum value in the array is: " + maxValue);
    }

    public static void minValue(int[] array) {
        int arrayLength = array.length;
        int minValue = array[0];
        for(int value = 0; value < arrayLength; value++) {
            if(array[value] < minValue) {
                minValue = array[value];
            }
        }
        System.out.println("The minimum value in the array is: " + minValue);
    }
}
