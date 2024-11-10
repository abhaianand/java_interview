public class Largest_of_digit {
    public static void main(String args[]) {
        int a= 1;
        int b = 2;
        int c= 1;
        if(a>b && a>c){
            System.out.print("a is larger number = "+a);
        } else if (b>a && b>c) {
            System.out.print("b is larger number = "+b);
        }
        else {
            System.out.print("c is larger number = "+c);
        }
    }
}
