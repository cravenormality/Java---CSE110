import java.util.Arrays;
public class PokerDice {
    public static void main(String[] args) {
        final int MAX_ROLLS = 1000000;
        int[] tally = { 0, 0, 0, 0, 0, 0, 0, 0};
        String[] handNames = {"N/A", "None", "One Pair", "Two Pairs", "Three of a Kind", "Full House", "Four of a Kind", "Five of a Kind" };
        Die[] dice = createDice();

        //Switch statement that returns the value of hand in relation to the index of the array in which we are using 
        //Sets hand to position associtated in ray with number
        for (int roll = 0; roll < MAX_ROLLS; roll++) {
            rollDice(dice);
            int hand = determineHand(dice);

            switch (hand) {
                case 0:
                    hand = 1;
                    break;
                case 1:
                    hand = 2;
                    break;
                case 2:
                    hand = 3;
                    break;
                case 3:
                    hand = 4;
                    break;
                case 4:
                    hand = 5;
                    break;
                case 6:
                    hand = 6;
                    break;
                case 10:
                    hand = 7;
                    break;
            }
            tally[hand]++;
        }

        //Prints out the numbers
        System.out.println("Poker Dice Probability Calculator - Jessica Weinburger");
        System.out.println("1,000,000 trials ran");

        for (int i = 1; i < tally.length; i++) {
            System.out.printf("Case %d) %15s %.6f\n", i ,  handNames[i], (double) tally[i] / MAX_ROLLS);
        }
    }

    //Creates an array of dice

    public static Die[] createDice() {
        Die [] dice;
        dice = new Die[5];
        for (int i = 0; i < 5; i++) {
            dice[i] = new Die(6);
        }
        return dice;
    }

    //detemines hand by getting value of die and comparing each one if equal increments counter

    public static int determineHand(Die[] dice) {
        int count = 0;
        for (int i = 0; i < dice.length; i++) {
            for (int j = i + 1; j < dice.length; j++) {
                if (dice[i].getValue() == dice[j].getValue()) {
                    count++;
                }
            }
        }
        return count;
    }

    //rolls the array of dice

    public static void rollDice(Die[] dice) {
        for(int i = 0; i < dice.length; i++) {
            dice[i].roll();
        }
    }
}