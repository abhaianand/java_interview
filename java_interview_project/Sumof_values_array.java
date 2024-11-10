public class Sumof_values_array {
    public static void main(String args[]) {

        int a[] = {5,2,3,1};
        int sum =0;

        int length = a.length-1;
         //System.out.print(length);
        for (int i =length;i>=0;i--){
            sum = sum+a[i];
        }
        System.out.print(sum);
    }
    }

