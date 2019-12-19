/*--------------------
//Author - Jessica Weinburger
//FileName - Lab10
//Specification: Reading a file and putting into matrix.
//For - CSE 110 - Lab #10
//Time Spent - 20 minutes
//--------------------*/

import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        String nameBuilder;
        Scanner key = new Scanner(System.in);
        System.out.println("Name of the builder: ");
        nameBuilder = key.next();

        Builder builder = new Builder(nameBuilder);
        System.out.println("The name of the builder is " + builder.getName());

        System.out.println("Enter a positive integer - ");
        int num = key.nextInt();

        System.out.println(builder.makeRow(num, "*", "="));

        System.out.println("Enter a positive odd integer -");
        num = key.nextInt();
        builder.makePyramid(num, "*");

    }
}