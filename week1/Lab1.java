import java.util.Scanner;

public class Lab1 {
    /*--------------------
    //Author - Jessica Weinburger
    //FileName - Lab1
    //Specification: A program that finds the average of three test by getting user input
    //For - CSE 110 - Lab #1
    //Time Spent - 35 minutes
    //--------------------*/

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
            int test1, test2, test3;
            final double NUM_TESTS = 3;
            double average;

            System.out.print("Enter the score on the first test - ");
            test1 = keyboard.nextInt();

            System.out.print("Enter the score on the second test - ");
            test2 = keyboard.nextInt();

            System.out.print("Enter the score on the third test - ");
            test3 = keyboard.nextInt();


            average = (test1 + test2 + test3) / (double)NUM_TESTS;

            System.out.println("Your first test score - " + test1);
            System.out.println("Your second test score - " + test2);
            System.out.println("Your third test score - " + test3);
            System.out.println("Your average test score - ")  
            System.out.printf("%.4f", average);
        
        keyboard.close();
    }
}