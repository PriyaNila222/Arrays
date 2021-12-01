package com.company;

//Write a method to verify if the array contains two specific elements(12,23)

import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int arrayLength = scanner.nextInt();
        System.out.println("Enter the elements of the array: ");

        int[] integerArray = new int[arrayLength];
        for (int value=0; value < arrayLength; value++) {
            integerArray[value] = scanner.nextInt();
        }

        findElements(integerArray , 12, 23);
    }

    public static void findElements(int[] array, int element1, int element2) {
        int value = 0;
        int increment1 = 0;
        int increment2 = 0;
        int index1 = 0;
        int index2 = 0;

        while (value < array.length) {
            if (array[value] == element1) {
                index1 = value;
                increment1++;
                value++;
            } else if(array[value] == element2){
                index2 = value;
                increment2++;
                value++;
            } else {
                value++;
            }
        }

        if (increment1 != 0 && increment2 != 0) {
            System.out.println("Element 12 is found in the index: " + index1);
            System.out.println("Element 23 is found int the index:" + index2);
        } else if(increment1 !=0 && increment2 == 0) {
            System.out.println("Element 12 is found in the index: " + index1);
            System.out.println("Element 23 is not found");
        } else if(increment1 == 0 && increment2 != 0) {
            System.out.println("Element 12 is not found");
            System.out.println("Element 23 is found in the index: " + index2);
        } else {
            System.out.println("Both elements 12 and 23 is not found in the array");
        }

    }
}
