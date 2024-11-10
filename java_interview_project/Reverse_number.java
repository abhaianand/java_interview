public class Reverse_number {

    public static void main(String args[]) {
        int number = 1234;
        int rev = 0;

        while (number != 0) {
            rev = rev * 10 + number % 10;  // Extract last digit and add it to the reversed number
            number = number / 10;          // Remove the last digit from the original number
        }

        System.out.println("Reversed number: " + rev);
    }
}
