package com.company;

//Write a function to add integer value of an array

public class Program1 {
    public static void main(String[] args) {
        System.out.println("Sum of an arrray is: " + sumOfArray());
    }

    public static int sumOfArray() {
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 12;
        array[2] = 13;
        array[3] = 17;
        array[4] = 20;
        int sum = 0;

        for(int value=0; value < array.length; value++){
            sum += array[value];
        }

        return sum;
    }
}
