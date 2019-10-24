import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        String phrase1;
        Scanner key = new Scanner(System.in);
        String phrase = key.nextLine();
        StringBuilder sb = new StringBuilder(phrase);
        

        while (!phrase.equalsIgnoreCase("done")) {
            phrase1 = StringBuilders(phrase).reverse();
            for (int i = 0; i <= phrase.length() - 1; i++) {
                sb.append(vowls.charAt(index));
                phrase1 = sb;
            }
            if (phrase.equalsIgnoreCase(phrase1)) {
                System.out.println("That is a plindrome");
            } else {
                System.out.println("That is not a palindrome");
            }
        }
    }
}