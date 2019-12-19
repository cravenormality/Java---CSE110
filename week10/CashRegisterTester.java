public class CashRegisterTester {
    public static void main(String[] args) {
        CashRegister reg1 = new CashRegister();

        reg1.addItem(3.25);
        reg1.addItem(1.95);

        CashRegister reg2 = new CashRegister();
        reg2.addItem(3.25);
        reg2.clear();

        reg1.getCount();
        //System.out.println(itemCount);
        reg1.getTotal();
        //System.out.println(totalPrice);
        reg2.getCount();
        //System.out.println(itemCount);
        reg2.getTotal();
        //System.out.println(totalPrice);
        
    }
}