public class Factorial_of_number {
    public static void main(String args[]) {

        int number = 5;
        int count = number;
        int fact = 1;
        while(count>=1){
          fact = fact*count;
            count--;
        }
      System.out.print(fact);
    }
}
