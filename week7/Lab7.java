/*--------------------
//Author - Jessica Weinburger
//FileName - Lab6
//Specification: Create an array, populate, display, and find the sum of each row of array. Display the array.
//For - CSE 110 - Lab #7
//Time Spent - 20 minutes
//--------------------*/

import java.util.Scanner;
import java.util.Arrays;
public class Lab7 {
   public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int rows, cols, sum;

        System.out.println("Enter the number of rows in the array -");
        rows = key.nextInt();

        System.out.println("Enter the number of columns in the array -");
        cols = key.nextInt();

        int[][] intArray = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                 System.out.println("Please enter a value -");
                 intArray[i][j] = key.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(intArray[i][j] + "\t");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < rows; i++) {
            sum = 0;
            for (int j = 0; j < cols; j++) {
                sum = sum + intArray[i][j];
            }
            System.out.print("Sum of the elements of row " + i + " is: " + sum + "\n");
        }
   }
}