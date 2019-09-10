import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double principal, rate, simpleInterest;
        int months;

        System.out.print("Simple Interest - Jessica Weinburger \n");
        System.out.print("\n");

        System.out.print("What is the initial savings amount? \n");
        principal = keyboard.nextDouble();
        
        System.out.print("What is the annual interest rate? \n");
        rate = keyboard.nextDouble();

        System.out.print("What is the number of months to save? \n");
        months = keyboard.nextInt();

        simpleInterest = principal * (Math.pow(1 + rate/100/12, months)) ;

        System.out.printf("%.2f", principal);
        System.out.print(" saved for " + months);
        System.out.print(" months at ");
        System.out.printf("%.2f", rate);
        System.out.printf(" will be valued at $" + "%.2f", simpleInterest);

        keyboard.close();
    }
}