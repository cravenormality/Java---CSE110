import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
public class Hangman4 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> words = readWords();
        String word = pickWord(words);
        String guesses = "";
        Scanner in = new Scanner(System.in);
        System.out.println("\nHangman - E. Eckert");
        do {
            printWord(word, guesses);
            guesses = guesses + getUniqueGuess(in, guesses);
        } while (!guesses(word, guesses));
            printWord(word, guesses);
            System.out.println("\nYou guessed it in " + guesses.length() + " tries.");
            in.close();
    }
    private static ArrayList<String> readWords() throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<String>();
        File inputFile = new File("words.txt");
        Scanner in = new Scanner(inputFile);
        while (in.hasNext()) {
            words.add(in.next());
        }
        System.out.println("I know " + words.size() + " words.");
        in.close();
        return words;
    }
    static String pickWord(ArrayList<String> list) {
        int choice = (int) (Math.random() * list.size());
        return list.get(choice).toUpperCase();
    }

    private static boolean guesses(String word, String guesses) {
        int cnt = 0;
        for (int i = 0; i < word.length(); i++) {
            if (guesses.indexOf(word.charAt(i)) >= 0) {
                cnt += 1;
            }
        }

        if (cnt == word.length()) {
            return true;
        } else {
            return false;
        }
    }

    private static char getUniqueGuess(Scanner in, String guesses) {
        char guess;
        do {
            System.out.print("Enter a letter");
            guess = in.next().charAt(0);
        } while (guesses.indexOf(guess) >= 0);
        return Character.toUpperCase(guess);
    }

    private static void printWord(String word, String guesses) {
        System.out.print("\n");
        for (int i = 0; i < word.length(); i++) {
            if (guesses.indexOf(word.charAt(i)) >= 0) {
                System.out.print(word.toUpperCase().charAt(i));
            } else {
                System.out.print(guesses);
            }
        }
    }

}