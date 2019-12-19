import java.util.Scanner;
public class Palindrome {

    static boolean isPalindrome(String palindrome) {
        /*Variable i is set to 0 to index from the begining to the last position
        While variable j is set to -1 to index from the last position to the first*/
        int i = 0, j = palindrome.length()-1;
        /*Loops through the word while i is less than j.*/
        while (i < j) {
            /*Checks to see if the character at position i is not the same as at position j. Returns false if true.*/
            if (palindrome.charAt(i) != palindrome.charAt(j)) {
                return false;
            }
            /*Counter to increase or decrease the position we are looking at.*/
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        /*Variable declaration*/
        Scanner key = new Scanner(System.in);
        String phrase = "";

        System.out.println("Palindrome Checker - Jessica Weinburger");
        /*Do while loop so that it runs at least once, but continually until done is inputed.*/
        do {
            /*Ask for input and set it equal to variable*/
        System.out.println("Enter Phrase -");
        phrase = key.nextLine();
        /*Sets it to lowercase and removes spaces and special character*/
        String phrase1 = phrase.toLowerCase();
        String palindrome = phrase1.replaceAll("[^a-z]", "");
        /*Checks to see if input is not equal to do if so it goes through the nested if statements*/
        if (!phrase.equalsIgnoreCase("done")) {
            /*Checks the returned value form the other method to see wether it returned true or false*/
            if (isPalindrome(palindrome)) {
                System.out.println("That is a Palindrome");
            } else {
                System.out.println("That is Not a Palindrome.");
            }
    }
    } while (!phrase.equalsIgnoreCase("done"));
    }
}