public class Reverse_string {

    public static void main(String args[]){

     String name = "abhai";

     String reverse =" ";


     int length_of_name = name.length();
System.out.println(length_of_name);




for (int i =length_of_name-1;i>=0;i--) {
     reverse = reverse + String.valueOf(name.charAt(i));

}

        System.out.print(reverse);

    }
}
