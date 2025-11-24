class CoffeeOrder {
    String size;
    double price;


    public CoffeeOrder(String size, double price) {
        this.size = size;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Size: " + size + ", Price: $" + price);
    }
}