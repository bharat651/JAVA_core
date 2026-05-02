package String;
import java.util.Scanner;
// reverse a string without using StringBuffer.reverse()
public class reverseString {
    static String getString(){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        return str;
    }
    public static void main(String[]args){
        String str = getString();
        int lengthOfString = str.length();
        String new_str = "";
        for(int i = lengthOfString-1 ; i>=0 ; i--){
            new_str += str.charAt(i);
        }
        System.out.println(new_str);
    }
}
