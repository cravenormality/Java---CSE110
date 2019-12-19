import java.util.*;
import java.io.*;
public class Hangman2 {
   
    public static String wordGuessed = "";
    public static int count = 0;
    public static String word;
    public static String gameWord = "";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        word = getGameWord();

        System.out.println(word);

        while (wordGuessed.length() != word.length()) {
            String guess = sc.next();

            hang(guess);

            wordGuessed += guess.charAt(0);

            System.out.println(getGameWord() + ", so far " + wordGuessed + " - and number of life " + getCount()); 
        }

        sc.close();

    }

    public Hangman2() {
        gameWord = new String(new char[word.length()]).replace("\0", "-");
    }

    public static void hang(String guess) {
        guess = guess.toLowerCase();
        String newGameWord = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newGameWord += guess.charAt(0);
            } else if (gameWord.charAt(i) != '-') {
                newGameWord += word.charAt(i);
            } else {
                newGameWord += "-";
            }
        }

        if (gameWord.equals(newGameWord)) {
            count++;
        } else {
            gameWord = newGameWord;
        }

        if (gameWord.equals(word)) {
            System.exit(0);
        }
    }
    public static int getCount() {
        return count;
    }    

    public static String getGameWord() {
        String line;
        String[] myArray = new String[10];

        try {
            FileReader fr = new FileReader("C:\\Users\\crave\\Documents\\college\\cse110\\week8\\hangman\\words.txt");
            BufferedReader inFile = new BufferedReader(fr);

            for (int i=0; i < 10; i++) {
                    line = inFile.readLine();
                    myArray[i] = line;
                    gameWord += myArray[i];
            }
            inFile.close();
        }
        catch (IOException ioe) {
            System.out.println("Something went wrong");
        }

        return gameWord;
    }

}