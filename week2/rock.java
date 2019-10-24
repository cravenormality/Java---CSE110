import java.util.Scanner;
import java.lang.Math;
import java.util.*;
import java.text.NumberFormat;

public class Rock {
  public static void main(String[] args) {
    String Player1, Player2;

    Scanner scan = new Scanner (System.in);

    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    
    System.out.println("Coin Machine - Jessica Weinburger");

    System.out.println("Rock, Paper, Scissor ");
    Player1 = scan.nextString();
    Player1.toLowerCase();

    System.out.println("Rock, Paper, Scissor ");
    Player2= scan.nextDouble();

    if (Player1 = "rock" || "paper" ||  "scissors") {
        System.out.println("Your change is - " + fmt.format(change / 100));
    if (dollars >= 1) {
      System.out.println("dollars - " + dollars);
    }
    while (coins > 0) {
        if (coins >= 25) {
          int prequarters = coins / 25;
          int quarters = prequarters - (((prequarters * 100) % 100) / 100);
          System.out.println("quarters - " + quarters);
          coins = coins - (quarters * 25);
        
        } else if (coins >= 10) {
          int predimes = coins / 10;
          int dimes = predimes - (((predimes * 100) % 100) / 100);
          System.out.println("dimes - " + dimes);
          coins = coins - (dimes * 10);
        
        } else if (coins >= 5) {
          int prenickles = coins / 5;
          int nickles = prenickles - (((prenickles * 100) % 100) / 100);
          System.out.println("nickles - " + nickles);
          coins = coins - (nickles * 5);
        
        } else if (coins >= 1) {
          int pennies = coins;
          System.out.println("pennies - " + pennies);
          coins = coins - (pennies * 1);
        }
    }
    } else {
        System.out.print("You did not provide enough money. You are " + fmt.format((change / 100) * -1)  + " short.");
    }
  }
}