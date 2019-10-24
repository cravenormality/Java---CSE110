import java.util.Scanner;
public class palindrone {
    //check the amount of lowercase or uppercase A's in a word
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        String phrase = key.nextLine();
        int acount = 0;
            if(phrase.contains("a")) {
                acount++;
            } else if (phrase.contains("A")) {
                acount++;
            } else {
                break;
            }
        }
    }
}