package com.company;

//Write a program to remove the duplicate elements and return the new array

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength = scanner.nextInt();

        System.out.println("Enter the elements of the array: ");
        int[] array = new int[arrayLength];
        for (int value = 0; value < arrayLength; value++) {
            array[value] = scanner.nextInt();
        }

        removeDuplicate(array);
    }

    public static void removeDuplicate(int[] array) {
        var set = new LinkedHashSet<>();

        for(int value = 0; value < array.length; value++) {
            set.add(array[value]);
        }

        System.out.println("Array without duplicate value: ");

        int[] newArray = new int[set.size()];
        Iterator iterator = set.iterator();

        for(int value = 0; value < newArray.length; value++) {
            while (iterator.hasNext()) {
                newArray[value] = (int)iterator.next();
                System.out.println(newArray[value]);
            }
        }
    }
}
