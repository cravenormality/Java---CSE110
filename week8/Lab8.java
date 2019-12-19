/*--------------------
//Author - Jessica Weinburger
//FileName - Lab8
//Specification: Reading a file and putting into matrix.
//For - CSE 110 - Lab #7
//Time Spent - 20 minutes
//--------------------*/

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Lab8 {
    public static void main(String[] args) {
        String line;
        String[][] myArray = new String[4][3];

        try {
            FileReader fr = new FileReader("c:\\Users\\crave\\Documents\\college\\cse110\\week8\\test.txt");
            BufferedReader inFile = new BufferedReader(fr);

            for (int i=0; i < 4; i++) {
                for (int j = 0; j < 3; j++) {
                    line = inFile.readLine();
                    myArray[i][j] = line;

                }
            }
            inFile.close();
        }
        catch (IOException ioe) {
            System.out.println("Something went wrong");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-20s", myArray[i][j]);
            }
            System.out.println();
        }
    }
}