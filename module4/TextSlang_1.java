

import java.util.Scanner;

import jdk.internal.jshell.tool.resources.l10n;

public class TextSlang_1 {

    public static void main(String[] args) {
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

            while (!input.equalsIgnoreCase("TTFN")) {
                System.out.println("Enter a slang term, TTFN to stop - ");
                input = keyboard.nextLine();
                     
                switch (input) {
                    case "BRB": System.out.println(BRB);
                    case "IDK": System.out.println(IDK);
                    case "IRL": System.out.println(IRL);
                    case "JK":  System.out.println(JK);
                    case "LOL": System.out.println(LOL);
                    case "TTFN":System.out.println(TTFN);
                    case "TTYL":System.out.println(TTYL);
                    case"YOLO": System.out.println(YOLO);
                    case "FOMO":System.out.println(FOMO);
                    default: System.out.println(input + "means something I don't know");
                }
            }


        keyboard.close();
    }
}