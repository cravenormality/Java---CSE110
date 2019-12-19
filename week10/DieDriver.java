public class DieDriver {
    public static void main(String[] args) {

        System.out.println("Jessica Weinburger - Die program");
        //Test case 1
        //Die 1
        System.out.println("1. Creation of Die");
        Die d1 = new Die(6);
        d1.getValue();
        System.out.print("a - ");
        d1.print();
        System.out.println("");
        //Die 2
        Die d2 = new Die(4);
        d2.getValue();
        System.out.print("b - ");
        d2.print();
        System.out.println("");
        //Die 3
        Die d3 = new Die(10);
        d3.getValue();
        System.out.print("c - ");
        d3.print();
        System.out.println("");
        System.out.println("-------------------------------");

        //Test Case 2
        System.out.println("2. Setting Value of Die");
        d1.setValue(3);
        d2.setValue(5);
        d3.setValue(0); 
        
        System.out.print("a - ");
        d1.print();
        System.out.println("");
        System.out.print("b - ");
        d2.print();
        System.out.println("");
        System.out.print("c - ");
        d3.print();
        System.out.println("");
        System.out.println("-------------------------------");

        //Test Case 3
        System.out.println("3. Freezing a Die");
        d1.freeze();
        d1.setValue(5);
        System.out.print("a - ");
        d1.print();
        System.out.println("");
        d1.unfreeze();
        d1.setValue(5);
        System.out.print("b - ");
        d1.print();
        System.out.println("");
        System.out.println("-------------------------------");

        //Test Case 4 -- Fix
        System.out.println("4. Drawing a Die");
        System.out.println("a -");
        d1.draw();
        System.out.println(" "); 
        System.out.println("b -");
        d2.draw();
        System.out.println(" ");
        System.out.print("c - "); 
        d3.draw();
        System.out.println("");
        System.out.println("-------------------------------");

        //Test Case 5
        System.out.println("5. Rolling a Die");
        System.out.print("a - ");
        for(int i = 0; i < 10; i++) {
            d1.roll();
            d1.print();
        }
        System.out.println("");
        System.out.print("b - ");
        for(int i = 0; i < 3; i++) {
            d2.roll();
            d2.print();
        }
        System.out.println("");
        System.out.print("c - ");
        for(int i = 0; i < 10; i++) {
            d3.roll();
            d3.print();
        }
        System.out.println("");
        System.out.println("-------------------------------");
    }
}