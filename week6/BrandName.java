import java.util.Random;

public class BrandName {
   public static void main(String[] args) {
       System.out.println("Brand Name Generator - Jessica Weinburger");
       System.out.println(" ");
       //Prints ten names
    for (int i = 1; i <= 10; i++) {
        //Random function to get a number between 6 and 12
       Random rand = new Random();
       int size = rand.nextInt(7)+6;
       //Stores the first letter to uppercase
       String s1 = BrandName.generateName(size).substring(0,1).toUpperCase();
        //Prints the number and the name of the brand
       System.out.print(i + " - ");  
       System.out.println(s1 + BrandName.generateName(size).substring(1,size));
       }
   }
//function to generate a random string of length size
   public static String generateName(int size) {
       //chose a Character random from these strings
        String cons = "bcdfghjklmnprstvwz";
        String vowls = "aeiou";
        StringBuilder sb = new StringBuilder(size);

        //generate a random number between 0 to vowls or const length depending on if i is divisible by two or not. So that the cons are at odd positions and vowels at even positions.
        for (int i = 0; i < size; i ++) {
            if (i % 2 != 0) {
                int index = (int) (vowls.length() * Math.random());

                sb.append(vowls.charAt(index));
            } else {
                int index = (int) (cons.length() * Math.random());

                sb.append(cons.charAt(index));
            }
         }


        return sb.toString();
   }
}