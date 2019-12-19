import java.io.*;
import java.util.*;

public class Hangman4 {
        public static String mysteryWord;
        public static StringBuilder currentGuess;

        public static ArrayList<Charater> previousGuesses = new ArrayList<Character>();
        public static int currentTry = 0;
        public static  ArrayList<String> wordList = new ArrayList<String>();

    public static String File() throws IOException {
        ArrayList<String> wordList = new ArrayList<String>();
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

    public static String pickWord() {
        Random rand = new Random();

        int wordIndex = Math.abs(rand.nextInt()) % wordList.size();
        return wordList.get(wordIndex);
    }

    public static StringBuilder currentGuess() {
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < mysteryWord.length(); i++) {
           current.append("-");
        }
        return current;
    }

    public static String getFormalCurrentGuess() {
        return "Current Guess: " + currentGuess.toString();
    }

    public static boolean gameOver() {
        if (didWeWin()) {
            System.out.println();
            System.out.println("Congrats!");
            return true;
        } else {
            return false;
        }
    }

    public static boolean didWeWin() {
        String guess = getCondensedCurrentGuess();
        return guess.equals(mysteryWord);
    }

    public static String getCondensedCurrentGuess() {
        String guess = currentGuess.toString();
        return guess.replace(" ", "");
    }

    public static boolean isGuessedAlready(char guess) {
        return previousGuesses.contains(guess);
    }

    public static boolean playGuess(char guess) {
        boolean isItAGoodGuess = false;
        for (int i = 0;  i < mysteryWord.length(); i++) {
            if (mysteryWord.charAt(i) == guess) {
                currentGuess.setCharAt(i, guess);
                isItAGoodGuess = true;
        }
    }
    previousGuesses.add(guess);
    if(!isItAGoodGuess) {
        currentTry++;
    }
    return isItAGoodGuess;
}

    public static void main(String[] args) {
        
        mysteryWord = pickWord();
        currentGuess = currentGuess();
    }
}