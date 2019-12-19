
import java.util.*;
public class hangman1 {
    public static String[] words = { "one" , "two" };
    public static int count = 0; 
    public static String word;
    public static String gameWord;
    public static String wordGuessed = "";

    public hangman1() {
        gameWord = new String(new char[word.length()]).replace("\0", "-");
    }

    public void hang(String guess) {
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

    public int getCount() {
        return count;
    }

    public String getGameWord() {
        return gameWord;
    }

    public static void main(String[] args) {
        hangman1 game = null;
        Scanner key = new Scanner(System.in);

        game = new hangman1();
        System.out.println(game.getGameWord());

        while(game.getCount() < 5 && true) {
            System.out.println("Enter your guess -");
            String guess = key.nextLine();
            game.hang(guess);
            wordGuessed += guess.charAt(0);
            System.out.println(game.getGameWord());
            System.out.println(wordGuessed);
            System.out.println(game.getCount());
        }
        key.close();
        System.exit(0);
    }
}