import java.util.*;
import java.io.*;
public class Hangman3 {
   
    public static String wordGuessed = "";
    public static int count = 0;
    public static String word;
    public static String mysteryword = " ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gameWord = getGameWord();


        while (!mysteryword.equalsIgnoreCase(gameWord)) {
            String guess = sc.next();
            wordGuessed += guess.charAt(0);
            for (int i = 0; i < 1; i++) {
                if (isGuessed(guess, gameWord)) {
                        mysteryword += guess.charAt(0);
                } else {
                    mysteryword += "-";
                    System.out.println(mysteryword);
                }
            }
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

    public static boolean isGuessed(String guess, String gameWord) {
        int i = 0;
        int j = 0;

        while (i < j) {
            if (guess.charAt(i) != gameWord.charAt(j)) {
                    return false;
            }
            i++;
            j++;
        }
        return true;
    }
}