import java.util.Random;


public class Die {
    //instance variables
        public int numSides;
        public int value;
        public boolean frozen;
        
    //Constructor that takes numSides and set values of a default dice;
    public Die(int numSides) {
        this.numSides = numSides;
        value = 1;
        frozen = false;
    }
    
    //sets the value of the dice. Takes value v. runs it through an if not frozen statement. Than checks to see if it's greater than zero and that its less than or equal to numSides.
    // else it prints it assumes that the value is one.
    public void setValue(int v) {
        if (!frozen) {
            //if (v > 0 || v <= numSides) {
            if (0 < v && v <= numSides) {
                value = v;
                getValue();
            } else {
                value = v;
                System.out.println("Attempted to set value to " + value + " , assumed 1.");
                this.value = 1;
                getValue();
            }
        }
    }
//Returns value
    public int getValue() {
        return value;
    }
//rolls the dice if not frozen using math.random and multipling the sides and adding one.
    public void roll() {
        if(!frozen) {
            this.value = ((int)(Math.random() * numSides + 1));
        }
    }
//Prints a basic dice with a value and side value.
    public void print() {
        System.out.print("[ " + value + ":" + numSides + " ]");
    }
//Draws the dice. Prints out the dice if the dice is less than or equal to six sides. else it reverts back to print.
    public void draw() {
        if (numSides <= 6) {
            System.out.println("- - - - - -");
            
            for (int i = numSides - 2; i < numSides; i++) {
                System.out.print(" | ");
                for (int j = 0; j < this.value ; j++) {
                    if (value == 1) {
                        System.out.print("  ");
                    }
                    if (i % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    if (value == 1) {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
            System.out.println("- - - - - -");
        } else {
            print();
        }
    }
    //Changes the boolean value of frozen. if the dice is frozen.
    public void freeze() {
        this.frozen = true;
    }
    //Changes the boolean value of frozen if the dice is unfrozen.
    public void unfreeze() {
        this.frozen = false;
    }
}