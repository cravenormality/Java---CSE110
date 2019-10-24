/*--------------------
//Author - Jessica Weinburger
//FileName - Lab4
//Specification: Use loops to get user input of a number to cast to choice. In which you use switch statements to run through the 3 choices and do certain things.
//For - CSE 110 - Lab #4
//Time Spent - 20 minutes
//--------------------*/

import java.util.Scanner;


public class Lab4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Please choose your choice from the following menu: ");
            System.out.println("1 - Print through all integer numbers between two given integers ");
            System.out.println("2 - Display a right triangular pattern of stars ");
            System.out.println("3 - Quit ");
            choice = keyboard.nextInt();

            switch (choice) {
                case 1: 
                    int start, end;
                    System.out.println("Enter the start number - ");
                    start = keyboard.nextInt();
                    System.out.println("Enter the end number - ");
                    end = keyboard.nextInt();

                    for (int i = start; i <= end; i++) {
                        System.out.print(i + " ");
                    }
                        System.out.println(" ");
                        break;
                case 2: 
                    int height;
                    System.out.println("Enter the height - ");
                    height = keyboard.nextInt();

                    for (int i = 0; i <= height - 1; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                        System.out.println(" ");
                        break;
                case 3:
                    System.out.println("See you later.");
                        break;
                default: 
                    System.out.println("Your Input was not correct. Try Again.");
                        break;
            }
        } while (choice != 3);
    }

}