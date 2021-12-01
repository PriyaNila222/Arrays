package com.company;

//Write a function to insert an element at a specific position in the array

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int arrayLength = scanner.nextInt();
        System.out.println("Enter the elements of the array");
        int[] array = new int[arrayLength];
        for (int value=0; value < arrayLength; value++) {
            array[value] = scanner.nextInt();
        }

        System.out.print("Enter the index number to insert the new element: ");
        int index = scanner.nextInt();
        System.out.println("Enter the new element");
        int newElement = scanner.nextInt();

        insertElement(array, index, newElement);
    }

    public static void insertElement(int[] array, int index, int newElement) {
        int arrayLength = array.length;
        int[] newArray = new int[arrayLength+1];
        int increment = 0;

        if(index < arrayLength) {
            for(int number = 0 ; number < arrayLength+1; number++) {
                if( number < (index)) {
                    newArray[number] = array[number];
                } else if(number == (index)) {
                    newArray[number] = newElement;
                } else {
                    newArray[number] = array[number - 1];
                }
            }
        } else {
            for(int number = 0; number < arrayLength; number++) {
                newArray[number] = array[number];
                increment++;
            }
            newArray[increment] = newElement;
        }

        System.out.println("The new array is");
        for (int number = 0 ; number < arrayLength+1; number++) {
            System.out.println(number + "index value is: " + newArray[number]);
        }
    }
}

