package BattleShipConsoleGame;
import java.util.Scanner;
public class SimpleStartupTestDrive {
    public static void main(String[]args){
        int randomNum = (int)(Math.random()*5);
        int[] locationCell = {randomNum,randomNum+1,randomNum+2};
        int[] hitCell = new int[3];
        SimpleStartup S = new SimpleStartup();
        Scanner sc = new Scanner(System.in);
        S.setLocationCell(locationCell);
        boolean isAlive = true;
        while(isAlive){
            int guss = S.getUserInput("Enter the number");
            String result=S.checkYourSelf(guss);
            System.out.println(result);
            if(result=="Kill"){
                isAlive=false;
            }
        }
        int numOfTry = S.getNumOfTry();
        System.out.println("You Try "+numOfTry+" Times");
    }
}
class SimpleStartup{
    private int[] locationcell;
    private int numOfHits = 0;
    private int numOfTry=0;

    public void setLocationCell(int[] locationCell){
        this.locationcell = locationCell;
    }
    public int getNumOfTry(){
        return numOfTry;
    }

    public String checkYourSelf(int guss){
        String result = "Miss";
        for(int g:locationcell){
            if(g==guss) {
                result="Hits";
                numOfHits++;
                break;
            }
        }
        if(numOfHits == locationcell.length){
            result="Kill";
        }
        numOfTry++;
        return result;
    }

    public int  getUserInput(String console){
        Scanner input = new Scanner(System.in);
        System.out.print(console+":");
        int guss = input.nextInt();
        return guss;
    }
}