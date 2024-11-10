public class Palendrom_string {
    public static void main(String args[]) {
        //reverse string
        String input_value = "malayalam";
        String rev ="";
        int length_of_input_value = input_value.length();
        for (int i=length_of_input_value-1;i>=0;i--) {
             rev = rev+String.valueOf(input_value.charAt(i));
        }
        System.out.print(rev);
        if (input_value.equals(rev)){
            System.out.print("   palendrom");
        }
        else {
            System.out.print("   no palendrom");
        }
    }
    }



