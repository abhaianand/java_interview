public class Triangle_star {
    public static void main(String args[]) {
        int level = 6;
        String space = " ";
        String star = "*";
        for (int i = 1; i<= level;i++) {
            for (int p = 1; p <= 7 - i; p++) {
                System.out.print(" ");
            }
            for (int r =1;r<=i*2-1;r++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}


     /*   123456*
                12345***
        1234*****
        123*******
        12*********
        1***********
       *************

        space(p) star(r) loop(i)   relation of r  relation of p
        6          1       1          r=i*2-1        p =7-i
        5          3       2
        4          5       3
        3      	   7       4
        2          9       5
        1          11      6*/
