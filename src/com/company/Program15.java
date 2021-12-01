package com.company;

//Write a method to find the number of even number and odd number in an array

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength = scanner.nextInt();

        System.out.println("Enter the elements of the array: ");
        int[] array = new int[arrayLength];
        for (int value = 0; value < arrayLength; value++) {
            array[value] = scanner.nextInt();
        }

        totalOddNumber(array);
    }

    public static void totalOddNumber(int[] array) {
        int evenNumber = 0;
        int oddNumber = 0;
        for(int value = 0; value < array.length; value++) {
            if((array[value] % 2) == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
        }

        System.out.println("Total number of even number in an array: " + evenNumber);
        System.out.println("Total number of odd number in an array: " + oddNumber);
    }
}
