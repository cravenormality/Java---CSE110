/*--------------------
//Author - Jessica Weinburger
//FileName - Lab2
//Specification: Get input from the user for two strings - first and last name - concatenate them - and compare them
//For - CSE 110 - Lab #2
//Time Spent - 35 minutes
//--------------------*/

import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
            String firstName, lastName , fullName;
            int nameLength = 0;


            System.out.println("Please enter your first name - ");
            firstName = keyboard.nextLine();

            System.out.println("Please enter your last name - ");
            lastName = keyboard.nextLine();

            fullName = firstName + " " + lastName;
            fullName = fullName.toUpperCase();
            nameLength = fullName.length();

            System.out.println(fullName);
            System.out.println(nameLength);

            String title1 = new String("cse110");
            String title2 = "cse110";

            if (title1 == title2) {
                System.out.println("String comparison using \"==\" sign works");
            } else {
                System.out.println("String comparison using \"==\" does NOT work");
            }

            if (title1.equals(title2)) {
                System.out.println("String comparison using \"equals\" method works");
            } else {
                System.out.println("String comparison using \"equals\" method does NOT work");
            }
            
        keyboard.close();
    }
}