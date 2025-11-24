import java.util.Scanner;

class Product {
    private String name;
    private double price;

    // Constructor to set both attributes
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to apply a discount
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            double discountAmount = this.price * (percentage / 100.0);
            this.price -= discountAmount;
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }

    // Method to get the updated price
    public double getPrice() {
        return this.price;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Product object ("Laptop" with a price of 1000.0)
        Product product1 = new Product("Laptop", 1000.0);

        // Ask the user to enter a discount percentage
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        // Apply the discount using the method
        product1.applyDiscount(discountPercentage);

        // Display the new price of the product
        System.out.println("The new price of the product is: $" + *product1.getPrice()*);

        scanner.close();
    }
}