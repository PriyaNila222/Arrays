package com.company;

//Write a method to find the second largest number in an array

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength = scanner.nextInt();

        System.out.println("Enter the elements of the array: ");
        int[] array = new int[arrayLength];
        for (int value = 0; value < arrayLength; value++) {
            array[value] = scanner.nextInt();
        }

        secondLargestNumer(array);
    }

    public static void secondLargestNumer(int[] array) {
        int temporary;

        for(int value = 0; value < array.length; value++) {
            for (int number = (value + 1); number < array.length; number++) {
                if (array[value] > array[number]) {
                    temporary = array[value];
                    array[value] = array[number];
                    array[number] = temporary;
                }
            }
        }

        System.out.println("The second largest element of an array is: " + array[array.length - 2]);
    }

}
