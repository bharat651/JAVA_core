package BattleShipConsoleGame;
import java.util.Scanner;
public class GameHelper {
    public int checkInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Guess");
        int userInput = input.nextInt();
        return userInput;
    }
}
