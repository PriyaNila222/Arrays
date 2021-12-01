package com.company;

//Write a function to remove specific element from an array

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int arrayLength = scanner.nextInt();
        System.out.println("Enter the elements of the array: ");


        int[] integerArray = new int[arrayLength];
        for (int value=0; value < arrayLength; value++) {
            integerArray[value] = scanner.nextInt();
        }

        System.out.print("Enter the element to remove from an array: ");
        int element = scanner.nextInt();

        removeElement(integerArray, element);
    }

    public static void removeElement(int[] array, int element) {
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

        if(increment != 0) {
            for (int number = (index + 1) ; number < arrayLength; number++) {
                array[number - 1] = array[number];
            }
        }

        if(increment !=0) {
            System.out.println("The array after deletion of " + element + " is:");
            for (int number = 0; number < (arrayLength - 1); number++) {
                System.out.println(array[number]);
            }
        } else {
            System.out.println("Element not found");
        }
    }
}
