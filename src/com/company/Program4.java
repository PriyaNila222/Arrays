package com.company;

//Write a function to test if array contains a specific value

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int arrayLength = scanner.nextInt();
        System.out.println("Enter the elements of the array: ");

        int[] integerArray = new int[arrayLength];
        for (int value=0; value < arrayLength; value++) {
            integerArray[value] = scanner.nextInt();
        }

        System.out.print("Enter the element to find the index: ");
        int element = scanner.nextInt();

        findIndex(integerArray , element);
    }

    public static void findIndex(int[] array, int element) {
        int arrayLength = array.length;
        int value = 0;
        int increment = 0;
        int index = 0;

        while (value < arrayLength) {
            if (array[value] == element) {
                index = value;
                increment++;
                break;
            } else {
                value++;
            }
       }

        if (increment != 0) {
            System.out.println("Element is found in the index: " + index);
        } else {
            System.out.println("Element is not found");
        }
    }
}
