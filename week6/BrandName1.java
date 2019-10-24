import java.util.Random;

public class BrandName1 {
   public static void main(String[] args) {
       for (int i = 0; i <= 10; i++) {
           String name = brandName(7);
           System.out.println(name);
       }
   }
   public static String brandName(int size) {

        Random rand = new Random();
        int i = 1;
        int length = rand.nextInt(7)+6;
        String[] name = new String[length];
        String drugName = name[i];
            for (i = 1; i < length * 4; i++) {
                 length --;
                if (length % 2 == 0) {
                    int val = rand.nextInt(5);

                    switch(val) {
                        case 1:
                            name[i] = "a";
                            break;
                        case 2:
                            name[i] = "e";
                            break;
                        case 3:
                            name[i] = "i";
                            break;
                        case 4:
                            name[i] = "o";
                            break;
                        case 5:
                            name[i] = "u";
                            break;
                        }
                    } else {
                        int letter = rand.nextInt(19);
                            
                        switch(letter) {
                        case 1:
                            name[i] = "b";
                            break;
                        case 2:
                            name[i] = "c";
                            break;
                        case 3:
                            name[i] = "d";
                            break;
                        case 4:
                            name[i] = "f";
                            break;
                        case 5:
                            name[i] = "g";
                            break;
                        case 6:
                            name[i] = "h";
                            break;
                        case 7:
                            name[i] = "j";
                            break;
                        case 8:
                            name[i] = "k";
                            break;
                        case 9:
                            name[i] = "l";
                            break;
                        case 10:
                            name[i] = "m";
                            break;
                        case 11:
                            name[i] = "n";
                            break;
                        case 12:
                            name[i] = "p";
                            break;
                        case 13:
                            name[i] = "r";
                            break;
                        case 14:
                            name[i] = "s";
                            break;
                        case 15:
                            name[i] = "t";
                            break;
                        case 16:
                            name[i] = "v";
                            break;
                        case 17:
                            name[i] = "w";
                            break;
                        case 18:
                            name[i] = "x";
                            break;
                        case 19:
                            name[i] = "z";
                            break;
                }
                drugName = name[i];
             }
         }
         return drugName;
    }
}