package String;
import java.util.Scanner;
public class useOfStringBuffer {
    public static void main(String[]args){
        StringBuffer s = new StringBuffer("Litu");
        System.out.println(s);
        s.append(" Mohanty");
        System.out.println(s);
        s.insert(0,"Bharat ");
        System.out.println(s);
        s.replace(7,11,"Bhusan");
        System.out.println(s);
    }
}
