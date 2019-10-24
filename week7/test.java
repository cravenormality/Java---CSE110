import java.util.Scanner;
public class Palindrone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Phrase -");
        String phrase = in.nextLine();
    }
    public static boolean isPalindrome(char[] word) {
            for (int i = 0 , j = s.length() - 1; i < j; i++, j--) {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
            }
            return true;
    }
}