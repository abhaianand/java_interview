public class Fibancci_series {
    public static void main(String args[]) {
        int n1 = 1;
        int n2 = 2;
        int max_count = 10;
        int sum = 0;
        System.out.print("  "+n1+"  "+n2);
        while (max_count > 0) {
            sum = n1 + n2;  // Add n1 and n2
            System.out.print("  "+sum);
           // System.out.print("  "+n1+"  "+n2);
            // Update n1 and n2 to move to the next pair in the sequence
            n1 = n2;
            n2 = sum;
            max_count--;  // Decrease max_count in each iteration
        }
    }
}
