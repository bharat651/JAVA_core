package BattleShipConsoleGame;
import java.util.ArrayList;
public class StartUpBurst {
    GameHelper help = new GameHelper();
    ArrayList<StartUp> startups = new ArrayList<StartUp>();
    int numOfGuesses = 0;
    public void setUpGame(){
        StartUp one = new StartUp();
        one.setName("Apple");
        StartUp two = new StartUp();
        two.setName("Apple");
        StartUp three = new StartUp();
        three.setName("Apple");
        startups.add(one);
        startups.add(two);
        startups.add(three);
    }
}
