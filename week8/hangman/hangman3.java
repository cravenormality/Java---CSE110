import java.io.*;
import java.util.*;

class HangmanSession {
    public Player player;
    public Words secretWord;
    public LetterBox letterBox;

    public HangmanSession() {
    player = new Player();
    player.askName();
    secretWord = new Words();
    letterBox = new LetterBox();
}

public void printState() {
    letterBox.print();
    System.out.print( "Hidden word : " );
    secretWord.print();
    System.out.print( "Tries left: " + triesNumber + "<guess letter:>" );
}

public void play() {
    boolean bool = true;
    while( true ) {
        bool = true;
        printState();
        char ch = player.takeGuess();
        if( letterBox.contains( ch ) ) {
            System.out.println( "Try again, you've already used the letter " + ch );
            bool = false;
        }
        if( bool ) {
            if( secretWord.guess( ch ) ) {
                System.out.println( "You have found the letter " + ch );
            }
            else {
                triesNumber--;
            }
            if( triesNumber < 1 )
                gameOver();

            if( secretWord.found() )
                congratulations();
        }
    }
}

public String fv;
public StringBuffer pValue;
public int found = 0;
{

    String Words[] = new String[23];

    Words[0] = "carbon";
    Words[1] = "dictionary";
    Words[2] = "restaurant";
    Words[3] = "televison";
    Words[4] = "responsible";
    Words[5] = "technology";
    Words[6] = "computer";
    Words[7] = "communicate";
    Words[8] = "automobile";
    Words[9] = "coffee";
    Words[10] = "federation";
    Words[11] = "exaggerate";
    Words[12] = "cappuccino";
    Words[13] = "macintosh";
    Words[14] = "apple";
    Words[15] = "microsoft";
    Words[16] = "lighter";
    Words[17] = "shark";
    Words[18] = "bunker";
    Words[19] = "argument";
    Words[20] = "playstation";
    Words[21] = "parrot";
    Words[22] = "canine";

    Random random = new Random();
    int randomWord = random.nextInt(22);

    for (int i = 0; i < Words.length; i++);

    String[] displayLetters = new String[Words[randomWord].length()];

    for (int i=0; i<displayLetters.length; i++)

    {
        displayLetters[i] = "_";
    }
    for (int i=0; i<displayLetters.length; i++)
    {
        System.out.print(displayLetters[i]+" ");
    }
}
{

}   

public boolean found() {
    System.out.println( "Letters found:" + found + "/" + fv.length() );
    return ( found == fv.length() );
}


public boolean guess( char c ) {
    int index = fv.indexOf( c );
    if( index == -1 )
        return false;
    else {
        found = found + findOccurances( c );
        return true;
    }
}

public int findOccurances( char c ) {
    fv = Words[randomWord];
    pValue = new StringBuffer(fv.length());
    for (int i = 0; i < displayLetters.length; i++) {
        displayLetters[i] = "-";
        pValue.append('-');
    }
    return counter;
}

public void printp() {
    System.out.println( pValue );
}


public char takeGuess() {
    return receiveInput().charAt( 0 );
}

public String receiveInput() {
    String str = " ";
    BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    try {
        str = br.readLine();
    }
    catch( IOException ex ) {
        ex.printStackTrace();
    }
    return str;
}

public String toString() {
    return name;
}


public char[] lbox = new char[24];
public int counter = 0;

public boolean contains( char c ) {
    for( int i = 0; i < counter; i++ ) {
        if( lbox[i] == c )
            return true;
    }
    lbox[counter] = c;
    counter++;
    return false;
}

public void print() {
    System.out.print( "\nLetterBox:" );
    for( int i = 0; i < counter; i++ ) {
        System.out.print( lbox[i] );
    }
    System.out.println( "" );



}
public static void main( String[] args ) {
    HangmanSession hangmanSession = new HangmanSession();
    hangmanSession.play();
}

}
