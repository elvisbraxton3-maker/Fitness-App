
public class ShoppingCart {
    public static void main(String[] args) {

        int[] prices = {120, 80, 150, 60, 200, 90};

        System.out.println("Item Prices:");
        for (int price : prices) {
            System.out.print(price + " ");
        }

        int total = 0;
        for (int price : prices) {
            total += price;
        }

        System.out.println("\nTotal Amount: " + total);
    }
}
