package Methods;
import java.util.Scanner;
public class printYourNameNTimes {
    void printName(){
        Scanner range = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = range.nextLine();
        System.out.println("Enter the range");
        int x = range.nextInt();
        for(int i = 1;i<=x;i++){
            System.out.println(name);
        }
    }
    void main(){
        printName();
    }
}
// in this programm i lear about when i accept a intger value using scanner class the obj.nextInt() also create a empty line
