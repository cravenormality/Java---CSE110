import java.io.*;
import java.util.*;

public class hangman5 {
    static String[] wordList;
    static String secretWord;
    static ArrayList<Character> lettersGuessed;
    static boolean[] lettersRevealed;
    static int guesses;

    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        hangman.readFile("words.txt");
    }
    public static boolean checkIfWon() {
        for(boolean isLetterShown : lettersRevealed) {
            if (!isLetterShown) {
                return false;
            } 
        }
        return true;
    }

    static boolean checkuserGuess(String word) {
        if (word.length() == 1 && !lettersGuessed.contains(word.charAt(0))) {
            lettersGuessed.add(word.charAt(0));
            return true;
        } 
        return false;
    }

    public static String secretWord(String[] wordList) {
        return wordList[(int)(Math.random() * wordList.length)];
    }

    public String[] readFile(String loc) {
        try {
            FileReader fr = new FileReader("C:\\Users\\crave\\Documents\\college\\cse110\\week8\\hangman\\words.txt");
            BufferedReader inFile = new BufferedReader(fr);
            
            String line = inFile.readLine();

            while (currentLine != null) {
                wordList.add(currentLine);
                currentLine = inFile.readLine();
            }
            inFile.close();
        } catch (IOException exception) {
            System.out.println("Could not read File");
        }
        return wordList;
    }

    public static void setUpGame() {
        secretWord = chooseSecretWord(wordList);
        lettersRevealed = new boolean[secretWord.length()];
        Arrays.fill(lettersRevealed, false);
        lettersGuessed = new ArrayList<character>(26);
    }

    public static void updateSecretWord(String word) {
        ArrayList<Integer> changeBool = new ArrayList<Integer>();

        if (secretWord.contains(word)) {
            for(int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == word.charAt(0)) {
                    changeBool.add(i);
                }
            }

            for (Integer i : changeBool) {
                lettersRevealed[i] = true;
            }
        }
    }

}
