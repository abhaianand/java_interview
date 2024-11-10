public class Swap_two_number {
    public static void main (String args[]){}


        static void method1(){


            int a = 1;
            int b = 2;
            int c =5;

            int d = a+b+c; //8
            a=d-a-b;
            System.out.println(a);
        }


        static void method2(){

            int a = 1;
            int b = 2;

            a=a+b; //3
            b=a-b; //1
            a=a-b;
            System.out.println(a);

        }

    }


