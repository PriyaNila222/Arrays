package com.company;

//Write a program to find the index of an array element

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int arrayLength = scanner.nextInt();
        System.out.println("Enter the elements of the array: ");

        int value = 0;

        int[] integerArray = new int[arrayLength];
        for (int number=0; number < arrayLength; number++) {
            integerArray[number] = scanner.nextInt();
        }

        int index = 0;
        int increment = 0;

        System.out.print("Enter the element to find the index: ");
        int element = scanner.nextInt();

        while (value < arrayLength) {
            if (integerArray[value] == element) {
                index = value;
                increment++;
                break;
            } else {
                value++;
            }
        }

        if (increment != 0) {
            System.out.println("Element found in the index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
