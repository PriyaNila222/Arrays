package com.company;

//Write the function to find the duplicate value of the array

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength = scanner.nextInt();

        System.out.println("Enter the elements of the array: ");
        int[] array = new int[arrayLength];
        for (int value = 0; value < arrayLength; value++) {
            array[value] = scanner.nextInt();
        }

        duplicateElements(array);
    }

    public static void duplicateElements(int[] array) {
        int arrayLength = array.length;

        System.out.println("Duplicate elements in the array: ");
        for(int value = 0; value < arrayLength; value++) {
            for (int number = (value + 1); number < arrayLength; number++) {
                if(array[value] == array[number]) {
                    System.out.println(array[number]);
                }
            }
        }
    }
}
