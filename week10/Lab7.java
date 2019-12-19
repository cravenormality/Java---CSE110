/*-------------------------------------------------------------
// AUTHOR: Seraphine Ritenour
// FILENAME: Lab7
// SPECIFICATION: printing row and pyramid by builder
// FOR: CSE 110- Lab #7
// TIME SPENT: how long it took you to complete the assignment.
//----------------------------------------------------------- */

import java.util.Scanner;

public class Lab7
{
    public static void main(String[] args)
    {
        // Declare variables if needed
        // -->
    	String nameBuilder; 
    	
        // Declare a Scanner object
        // -->
    	Scanner scanner = new Scanner(System.in);
    	
		// Get the name from the user and store it in a variable
        // -->
    	System.out.println("Name of the builder: ");
    	nameBuilder = scanner.next();

        // Create a brand-new builder with a given name using our Builder class
        // and the name of the user. The syntax is pretty similar to the way
        // you use Scanner
        // -->
    	Builder builder1 = new Builder(nameBuilder);

        // Print the name of the builder by its method.
        System.out.println("The name of builder is: " + builder1.getName());
        // -->
        
        

        // ======================= Use makeRow =======================

        // Ask for integer n from user by Scanner
        System.out.println("Enter a positive integer:");
        // -->
        int num = scanner.nextInt();
     ///.out.println(buildRow());

        // Using your builder's makeRow method print the pattern
        // -->
        System.out.println(builder1.makeRow(num, "*"));

        // ======================= Use makePyramid =======================

        // Ask for odd integer t from user by Scanner
        System.out.println(
            "Enter a positive odd integer, " +
            "representing number of stars in the base of a pyramid: ");
        num = scanner.nextInt();
        builder1.makePyramid(num, "*");

        // Using the Builder method makePyramid and integer t,
        // print pyramid with "*" as a string
        // -->

    }
}