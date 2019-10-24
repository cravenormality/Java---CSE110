import java.util.Scanner;


public class Lab5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        int min = n, max = n, sum = 0, count = 0;
            do {
                if (n >= 0) {
                if (n % 2 == 0) {
                    System.out.println("Not A Prime Number");
                }
                else if (n % 3 == 0) {
                    System.out.println("Not A Prime Number");
                    } 
                else {
                    System.out.println("Is a Prime Number");
                }

            count += 1;
            sum += n;
                
                if (n <= min) {
                    min = n;
                } else if (n >= max) {
                    max = n;
                }

            } else {
                System.out.println("try again");
            }

                System.out.println("Enter a number");
                n = scan.nextInt();
            } while(n != -1);

        double avg = ((double)sum / (int)count);

        System.out.println("count - " + count);
        System.out.println("sum - " + sum);
        System.out.print("average - ");
        System.out.printf("%.2f", avg);
        System.out.println(" ");
        System.out.println("min - " + min);
        System.out.println("max - " + max);
        }
}
