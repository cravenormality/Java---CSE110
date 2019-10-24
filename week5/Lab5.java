/*--------------------
//Author - Jessica Weinburger
//FileName - Lab4
//Specification: Create an array and print out the array and sum of the array using a for loop
//For - CSE 110 - Lab #5
//Time Spent - 20 minutes
//--------------------*/

import java.util.Scanner;
import java.util.Arrays;

public class Lab5 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int length;
        double cur, sum = 0;

        System.out.println("How many elements in the array?");
        length = key.nextInt();

        Double[] doubleArray = new Double[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Please enter the next value");
            doubleArray[i] = key.nextDouble();
        }
         for (int j = doubleArray.length - 1; j >= 0;j--){
                cur = doubleArray[j];
                sum+=cur;
                                
                System.out.printf("%.3f", cur);
                System.out.print("\t");
                
                if (doubleArray.length >=8) {
                    if (j % 8 == 2) {
                        System.out.println();
                    }
                }
         }
        System.out.println("\n");
        System.out.printf("%.3f", sum);
    }
}