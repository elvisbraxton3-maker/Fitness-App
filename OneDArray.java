public class OneDArray {
    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25};
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("\nSum of elements: " + sum);
    }
}