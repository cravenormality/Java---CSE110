import java.util.Scanner;
import java.lang.Math;
import java.util.*;
import java.text.NumberFormat;

public class CoinMachine {
  public static void main(String[] args) {
    double owed, recieved, change;

    Scanner scan = new Scanner (System.in);

    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    
    System.out.println("Coin Machine - Jessica Weinburger");

    System.out.println("Enter the amount owed - ");
    owed = scan.nextDouble();

    System.out.println("Enter the amount recieved - ");
    recieved = scan.nextDouble();

    change = ((recieved - owed) * 100);
    double newchange = Math.round(change*100) / 100;
    int dollars = (int)change / 100;
    int coins = (int)newchange % 100;


    if (change >= 0) {
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