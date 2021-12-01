package com.company;

//Write a function to copy an array to another array

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int arrayLength = scanner.nextInt();
        System.out.println("Enter the elements of the array: ");


        int[] originalArray = new int[arrayLength];
        for (int value=0; value < arrayLength; value++) {
            originalArray[value] = scanner.nextInt();
        }

        copyArray(originalArray);
    }

    public static void copyArray(int[] array) {
        int arrayLength = array.length;

        int[] duplicateArray = new int[arrayLength];

        System.out.println("Copied array is: ");
        for (int number = 0; number < arrayLength ;number++) {
            duplicateArray[number] = array[number];
            System.out.println(duplicateArray[number]);
        }
    }
}
