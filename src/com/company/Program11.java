package com.company;

//Write the program to find the common values between two arrays

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the  1st array: ");
        int firstArrayLength = scanner.nextInt();

        System.out.println("Enter the elements of the 1st array: ");
        int[] firstArray = new int[firstArrayLength];
        for (int value = 0; value < firstArrayLength; value++) {
            firstArray[value] = scanner.nextInt();
        }

        System.out.print("Enter the length of the 2nd array: ");
        int secondArrayLength = scanner.nextInt();

        System.out.println("Enter the elements of the 2nd array: ");
        int[] secondArray = new int[secondArrayLength];
        for (int value = 0; value < secondArrayLength; value++) {
            secondArray[value] = scanner.nextInt();
        }

        System.out.println("Common elements between two arrays: ");
        for (int value = 0; value < firstArrayLength; value++) {
            for (int number = 0; number < secondArrayLength; number++) {
                if(firstArray[value] == secondArray[number]) {
                    System.out.println(firstArray[value]);
                }
            }
        }
    }
}
