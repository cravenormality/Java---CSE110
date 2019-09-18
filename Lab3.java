/*--------------------
//Author - Jessica Weinburger
//FileName - Lab2
//Specification: Get input from the user for a grade than check if the grade is valid - if messeage isn't valid end program with valid message.
//For - CSE 110 - Lab #3
//Time Spent - 35 minutes
//--------------------*/

import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
            double finalExamGrade , midtermGrade , homeworkGrade, finalGrade;
            char letterGrade = ' ';

            System.out.println("Enter homework grade - ");
            homeworkGrade = keyboard.nextDouble();

            System.out.println("Enter midterm grade - ");
            midtermGrade = keyboard.nextDouble();

            System.out.println("Enter final grade - ");
            finalExamGrade = keyboard.nextDouble();

            if (homeworkGrade >= 0 && homeworkGrade <= 100 && midtermGrade >= 0 && midtermGrade <= 100 && finalExamGrade >= 0 && finalExamGrade <= 200) {
               finalGrade = ((finalExamGrade/200)*50) + ((midtermGrade/100)*25) + ((homeworkGrade/100)*25);
                 
                if (finalGrade >= 50) {
                    letterGrade = 'P';
                } else {
                    letterGrade = 'F';
                }
    
                    if (letterGrade == 'P') {
                        System.out.println("Student Passed the class");
                    } else {
                        System.out.println("Student Failed the class");
                    }
            } else {
               System.out.println("Invalid input. Homework and midterm grades should be between 0 and 100 and the final grade should be between 0 and 200");
            }

            
            

            
        keyboard.close();
    }
}