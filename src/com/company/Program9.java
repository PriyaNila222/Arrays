package com.company;

//Write a function to reverse the value of integer values

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength = scanner.nextInt();

        System.out.println("Enter the elements of the array: ");
        int[] array = new int[arrayLength];
        for (int value = 0; value < arrayLength; value++) {
            array[value] = scanner.nextInt();
        }

        reverseArray(array);
    }

    public static void reverseArray(int[] array) {
        int arrayLength = array.length;

        System.out.println("The reverse order of array is: ");
        for (int value = (arrayLength - 1); value >= 0; value--) {
            System.out.println(array[value]);
        }
    }
}
