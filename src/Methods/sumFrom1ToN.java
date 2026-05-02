package Methods;
import java.util.Scanner;
public class sumFrom1ToN {
    static int userInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = input.nextInt();
        return range;
    }
     static void printSum(int range){
        int sum = 0;
        for(int i =1 ; i<=range;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    public static void main(){
        int range = userInput();
        printSum(range);
    }
}
