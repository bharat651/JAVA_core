package Abstraction;
abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Playing Music...");
    }
}
abstract class WagonR extends Car{
    public void drive(){
        System.out.println("Driving.....");
    }
    public abstract void fly();
}

class UpdatedWagonR extends WagonR{
    public void fly(){
        System.out.println("flying....");
    }
}
public class Demo {
    public static void main(String[]args){
        WagonR c = new UpdatedWagonR();
        c.drive();
        c.playMusic();
        c.fly();
    }
}
