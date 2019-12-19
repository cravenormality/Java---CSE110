/*--------------------
//Author - Jessica Weinburger
//FileName - Lab6
//Specification: Create an array and sort the array
//For - CSE 110 - Lab #6
//Time Spent - 60 minutes
//--------------------*/

import java.util.Scanner;
import java.util.Arrays;

public class Lab6 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("How many elements in the array?");
        int length = key.nextInt();

        int[] myArray = new int [length];

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Next Number - ");
            myArray[i] = key.nextInt();
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    int exchange = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = exchange;
                }
            }
        }

        System.out.println("The Array's elements after sorting - ");

        for (int k = 0; k < myArray.length; k++) {
            System.out.print(myArray[k] + ", ");
        }

        System.out.println(" ");

        for (int i = 0; i < myArray.length - 1; i++) {
            myArray[i] = myArray[i+1];
        }
            myArray[myArray.length - 1] = 0;

        System.out.println("The array's elements after left shift - ");
        for (int k = 0; k < myArray.length; k++) {
            System.out.print(myArray[k] + ", ");
        }

        System.out.println(" ");

        System.out.println("Enter the element to search in the array - ");
        int search_element = key.nextInt();
        boolean element_found_flag = false;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == search_element) {
                element_found_flag = true;
            }
            if (element_found_flag && i < myArray.length - 1) {
                myArray[i] = myArray[i + 1];
            }
        }
        if (element_found_flag) {
            myArray[myArray.length - 1] = 0;
            System.out.println("Search element found");
        }

        System.out.print("Final Array - ");
        for (int k = 0; k < myArray.length; k++) {
            System.out.print(myArray[k] + ", ");
        }
        System.out.println(" ");


    }
}

