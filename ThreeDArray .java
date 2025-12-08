public class ThreeDArray {
    public static void main(String[] args) {

        int[][][] sales = {
            {   // Branch 1
                {20, 30, 40},   
                {25, 35, 45}    
            },
            {   // Branch 2
                {15, 22, 33},   
                {18, 28, 38}    
            }
        };

        System.out.println("Sales Data (3D Array):");
        for (int branch = 0; branch < sales.length; branch++) {
            System.out.println("Branch " + (branch + 1) + ":");
            for (int month = 0; month < sales[branch].length; month++) {
                System.out.print("  Month " + (month + 1) + ": ");
                for (int product = 0; product < sales[branch][month].length; product++) {
                    System.out.print(sales[branch][month][product] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}