import java.util.*;
import java.io.*;
public class Hangman2 {
   
    public static String wordGuessed = "";
    public static int count = 0;
    public static String word;
    public static String mysteryword = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gameWord = getGameWord();


        while (wordGuessed.length() != gameWord.length()) {
            String guess = sc.next();

            tickmarks(guess, gameWord);
            wordGuessed += guess.charAt(0);
            System.out.println(wordGuessed);


            System.out.println(mysteryword);
            //+ "You've guessed the word so far " + wordGuessed + " - and number of life " + getCount()); 
        }

        sc.close();

    }

    public static int getCount() {
        return count;
    }    

    public static String getGameWord() {
        String line;
        String[] words = new String[10];
        try {
            FileReader fr = new FileReader("C:\\Users\\crave\\Documents\\college\\cse110\\week8\\hangman\\hangman2\\words.txt");
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

        Random rand = new Random();
        String gameWord = words[rand.nextInt(words.length)];

        System.out.println(gameWord);

        return gameWord;
    }

    public static String tickmarks(String gameWord, String guess) {
        guess = guess.toLowerCase();

        for (int i=0; i < gameWord.length(); i++) {
            if (gameWord.charAt(i) == guess.charAt(0)) {
                mysteryword += guess.charAt(i);
            } else if (mysteryword.charAt(i) != '-') {
                mysteryword += mysteryword.charAt(i);
            } else {
                String tick = "-";
                mysteryword += tick;
            }
            count = 0;
            count++;
        }

        if (gameWord.equals(mysteryword)) {
            count++;
            System.exit(0);
        } 

        return mysteryword;
    }

}