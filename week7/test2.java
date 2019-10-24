import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a Phrase -");
        
        for(String str : strInputs){
            System.out.println(str + ": " + isPalindrome(str));
        }
    }

    private static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z]", "");

        return str.trim().equalsIgnoreCase(new StringBuilder(str.trim()).reverse().toString());
    }
}