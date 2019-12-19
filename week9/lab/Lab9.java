/*--------------------
//Author - Jessica Weinburger
//FileName - Lab9
//Specification: Reading a file and putting into matrix.
//For - CSE 110 - Lab #9
//Time Spent - 20 minutes
//--------------------*/

import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("Enter the first name of the person - ");
        String firstName = key.nextLine();
        System.out.println("Enter the last name of the person - ");
        String lastName = key.nextLine();
        System.out.println("Enter the birth year of the person - ");
        int birthYear = key.nextInt();

        Person person = new Person(firstName, lastName, birthYear);

        System.out.println(person.getFirstName() + " " + person.getLastName() + " is " + person.getAge(2019) + " years old in 2019 and will be " + person.getAge(2029) + " years old in ten years.");

        key.close();
    }
}