package com.company;

//Write a function to calculate the average value of an array of integer

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        System.out.println("Average value of an array is: " + averageOfArray());
    }

    public static double averageOfArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int arrayLength = scanner.nextInt();
        System.out.println("Enter the elements of the array: ");

        int sum = 0;
        double average = 0;

        int[] integerArray = new int[arrayLength];
        for (int value=0; value < arrayLength; value++) {
            integerArray[value] = scanner.nextInt();
            sum += integerArray[value];
        }

        average = (double) sum / (double) integerArray.length;
        return average;
    }
}


