package com.company;

//Write a function to find the missing number of sorted array 1 to 100

import java.util.BitSet;
import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength = scanner.nextInt();

        System.out.println("Enter the elements of the array: ");
        int[] array = new int[arrayLength];
        for (int value = 0; value < arrayLength; value++) {
            array[value] = scanner.nextInt();
        }

       missingNumber(array, 100);
    }

    public static void missingNumber(int[] array, int count) {
        int missingNumber = count - array.length;
        int increment = 0;

        for(int value = 1; value <= count; value++) {
            if(array[increment] == value) {
                if(increment < array.length - 1) {
                    increment++;
                } else if(increment == array.length - 1) {
                    increment--;
                }

            } else {
                System.out.println("Missing number is: " + value);
            }
        }
    }
}
