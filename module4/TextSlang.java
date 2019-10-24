/*Jessica Weinburger - Text Slang - September 25th - CSE 110*/

import java.util.Scanner;


public class TextSlang {

    public static void main(String[] args) {
        /*Declaration of Variables*/
        Scanner keyboard = new Scanner(System.in);
        String BRB = "BRB means Be Right Back";
        String FOMO = "FOMO mean Fear of Missing Out";
        String IDK = "IDK means I Don't Know";
        String IRL = "IRL means In Real Life";
        String JK = "JK means Just Kidding";
        String LOL = "LOL means Laughing Out Loud";
        String TTFN = "TTFN means Ta-Ta For Now";
        String TTYL = "TTYL means Talk To You Later";
        String YOLO = "YOLO means You Only Live Once";

            String input = "";

            System.out.println("TextSlang - Jessica Weinburger");
            /*While Loop to continually ask the player for input and breaks when TTFN is enter after printing out the case statement*/
            while (!input.equalsIgnoreCase("TTFN")) {
                /*Input set to a variable called input*/
                System.out.println("Enter a slang term, TTFN to stop - ");
                input = keyboard.nextLine();
                     /*Switch statement that looks at the input in uppercase format (to ignore the case) and goes through and prints the assigned variable. The default statement if for statement that don't exsist in the case.*/
                switch (input.toUpperCase()) {
                    case "BRB": System.out.println(BRB); break;
                    case "IDK": System.out.println(IDK); break;
                    case "IRL": System.out.println(IRL); break;
                    case "JK":  System.out.println(JK); break;
                    case "LOL": System.out.println(LOL); break;
                    case "TTFN":System.out.println(TTFN); break;
                    case "TTYL":System.out.println(TTYL); break;
                    case"YOLO": System.out.println(YOLO); break;
                    case "FOMO":System.out.println(FOMO); break;
                    default: System.out.println(input + " means something I don't know");
                }
            }

            /* Closes the scanner*/
        keyboard.close();
    }
}