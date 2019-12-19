public class PokerDice1 {
    public static void main(String[] args) {
        final int MAX_ROLLS = 1;
        int[] tally = { 0, 0, 0, 0, 0, 0};
        String[] handNames = {"N/A", "None", "One Pair", "Two Pairs", "Three of a Kind", "Full House", "Four of a Kind", "Five of a Kind" };
        Die[] dice = createDice();

        for (int roll = 0; roll < MAX_ROLLS; roll++) {
            rollDice(dice);
            int hand = determineHand(dice);
            tally[hand]++;
            System.out.println(hand);
        }

        //printHeading(MAX_ROLLS);
        for (int i = 1; i < tally.length; i++) {
            System.out.printf("Case %d) %15s %.5f\n", i ,  handNames[i], (double) tally[i] / MAX_ROLLS);
        }
    }

    public static Die[] createDice() {
        Die [] dice;
        dice = new Die[5];
        for (int i = 0; i < 5; i++) {
            dice[i] = new Die(6);
        }
        return dice;
    }


    public static void rollDice(Die[] dice) {
        for(int i = 0; i < dice.length; i++) {
            dice[i].roll();
        }
    }

    private static int[] count(Die[] dice) {
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int[] count = new int[6];

        for(int i = 0; i < count.length; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 1) {
                one++;
            }
        }
        count[0] = one;

        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 1) {
                three++;
            }
        }
        count[2] = three;


        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 1) {
                two++;
            }
        }
        count[1] = two;


        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 1) {
                four++;
            }
        }
        count[3] = four;

        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 1) {
                five++;
            }
        }
        count[4] = five;

        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 1) {
                six++;
            }
        }
        count[5] = six;

        return count;
    }

    private static int determineHand(Die[] dice) {
       int hand = 0;
       int[] count = count(dice);
       int pair = 0;
       int threekind = 0;
       int fourkind = 0;
       int fivekind = 0;
       for (int i = 0; i < count.length; i++) {
           if (count[i] == 2) {
               pair++;
           }
           if (pair == 1) {
               hand = 2;
           }
           if (pair == 2){
               hand = 3;
           }

           if (count[i] == 3) {
               threekind++;
           }

           if (threekind == 1) {
                hand = 3;
           }

           if (threekind == 1 && pair == 1) {
                hand = 4; 
           }

           if (count[i] == 4) {
               fourkind++;
           }

           if (fourkind == 1) {
               hand = 5;
           }

           if (count[i] == 5) {
               fivekind++;
           }

           if (fivekind == 1) {
               hand = 6;
           }
       }
       return hand;
    }
}