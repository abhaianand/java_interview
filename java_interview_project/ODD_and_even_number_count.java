public class ODD_and_even_number_count {
    public static void main(String args[]) {

        int number = 123456;
        int count1 = 0;
        int even = 0;
        int odd = 0;
        while (number!=0) {
            count1 = number % 10;
            number = number / 10;
            System.out.print(count1);
            if (count1 % 2 == 0) {
                even++;
               // System.out.print("  number of even " + even);
            }
            else {
                odd++;
                //System.out.print("  number of odd  " + odd);
            }

        }
        System.out.print("  number of even " + even);
        System.out.print("  number of odd  " + odd);
    }
}
