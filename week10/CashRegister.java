opublic class CashRegister {
    private double totalPrice;
    private int itemCount;

    public CashRegister() {
        totalPrice = 0.0;
        itemCount = 0;
    }

    public void addItem(double price) {
        if (price > 0.0) {
            totalPrice = totalPrice + price;
            itemCount++;
        }
    }

    public double getTotal() {
        System.out.println(totalPrice);
        return totalPrice;
    }

    public int getCount() {
        System.out.println(itemCount);
        return itemCount;
    }

    public void clear() {
        totalPrice = 0.0;
        itemCount = 0;
    }
}