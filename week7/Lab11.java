/*--------------------
//Author - Jessica Weinburger
//FileName - Lab11
//Specification: Define a student class that has strings for students major, firstname, lastname, and student credits.
//For - CSE 110 - Lab #11
//Time Spent - 20 minutes
//--------------------*/

import java.util.Scanner;
public class Lab11 {
    public static void main(String[] args) {
        String studentMajor;
        String firstName;
        String lastName;
        int studentCredits;
        String line;


        Scanner key = new Scanner(System.in);

        System.out.println("Enter first Student's Information. ");
        System.out.println("What is your first name? ");
        firstName = key.nextLine();
        System.out.println("What is your last name? ");
        lastName = key.nextLine();
        System.out.println("What is your major? ");
        studentMajor = key.nextLine();
        System.out.println("Enter your total credits? ");
        studentCredits = key.nextInt();
        line = key.nextLine();
        

        Student student1 = new Student(firstName, lastName, studentMajor, studentCredits);

        System.out.println("Enter Second Student's Information");
        System.out.println("What is your first name? ");
        firstName = key.nextLine();
        System.out.println("What is your last name? ");
        lastName = key.nextLine();

        Student student2 = new Student(firstName, lastName);

        System.out.println("First Student's Information - ");
        System.out.println("The name of the student is - " + student1.getFullName());
        System.out.println("Major is -  " + student1.getMajor());
        System.out.println("Number of earned credits is - " + student1.getCredits());

        System.out.println("Second Student's Information -");
        System.out.println("The name of the student is - " + student2.getFullName());
        System.out.println("Major is - " + student2.getMajor());
        System.out.println("Number of earned credits is - " + student2.getCredits());

        student1.changeMajor("international Affairs");


    }


}