package com.company;

//Write a function to get the difference of largest and smallest value

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength = scanner.nextInt();

        System.out.println("Enter the elements of the array: ");
        int[] array = new int[arrayLength];
        for (int value = 0; value < arrayLength; value++) {
            array[value] = scanner.nextInt();
        }

        int largestValue = 0;
        int smallestValue = array[0];

        for(int value = 0; value < arrayLength; value++) {
            if(array[value] > largestValue) {
                largestValue = array[value];
            } else if(array[value] < smallestValue) {
                smallestValue = array[value];
            }
        }

        difference(largestValue, smallestValue);
    }

    public static void difference(int largestValue, int smallestValue) {
        System.out.println("Largest value in an array: " + largestValue);
        System.out.println("Smallest value in an array: " + smallestValue);
        System.out.println("Difference of largest value and smallest value is: " + (largestValue - smallestValue));
    }

}
