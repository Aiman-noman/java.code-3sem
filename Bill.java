class Bill {

    void bill(int quantity, int price) {
        System.out.println("Total Bill = " + (quantity * price));
    }

    void bill(int quantity, double price) {
        System.out.println("Total Bill = " + (quantity * price));
    }

    public static void main(String[] args) {

        Bill b = new Bill();

        b.bill(5, 100);
        b.bill(3, 50.5);
    }
}