public class Count_sumof_digit {

    public static void main(String args[]) {
        int inputvalue = 123456;
        int sum = 0;
        while (inputvalue!=0) {
            sum = sum + inputvalue % 10; //0=0+6=6; =6+
            inputvalue = inputvalue/10;
        }
        System.out.print(sum);
    }
}
