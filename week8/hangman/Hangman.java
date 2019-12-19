import java.io.*;
import java.util.*;

public class Hangman {
    public static void main(String[] args) throws IOException {
        String line;
        String[] words = new String[10];


        try {
            FileReader fr = new FileReader("test.txt");
            BufferedReader inFile = new BufferedReader(fr);

            for (int i=0; i < 10; i++) {
                    line = inFile.readLine();
                    words[i] = line;
                }
            inFile.close();
        }
        catch (IOException ioe) {
            System.out.println("Something went wrong");
        }

        while () {

        }
    }

    public static char getWord(String[] words) {
        char finalWord = ' ';
        Random rand = new Random();
        String word = words[rand.nextInt(words.length)];
        char[] charWord = word.toCharArray();
        char[] guessed = new char [charWord.length];

        for (int i = 0; i < guessed.length; i++) {
            guessed[i] = '-';
            finalWord = guessed[i];
        }

        return finalWord;
}

    public static char found(char[] charWord, char[] guessed, char letter) {
        int instancesFound = 0;
        for (int i = 0; i < charWord.length; i++) {
            if (charWord[i] == letter) {
                ++instancesFound;
                guessed[i] = letter;
            }
        }
        return letter;
    }

    public static String letter(char letter) {
        String guessedLetters = " ";
        if (!guessedLetters.equals(letter)) {
            guessedLetters += letter;
        }

    return guessedLetters;
}

    public static char getLetter() {
    Scanner key = new Scanner(System.in);
    System.out.println("Enter a letter - ");
    char letter = key.next().charAt(0);

    return letter;
    }
}
