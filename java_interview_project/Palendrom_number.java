public class Palendrom_number {

    public static void main(String args[]) {
        //123454321
        int number = 12345;
        int rev = 0;
        while (number!=0) {
            int revr = rev * 10 + number % 10;
            number = number/10;
            System.out.print(revr);
        }
        if (rev==number){
            System.out.println("   palendrom");
        }
    }
}
