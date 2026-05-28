package AbstractAnonymousInnerClass;
abstract class Car{
    public abstract void playMusic();
    public abstract void drive();
}
class Audi extends Car{
    public void playMusic(){
        System.out.println("Music playing...");
    }
    public void drive(){
        System.out.println("not Driving");
    }
}
public class Demo {
    public static void main(String[]a){
        Audi obj = new Audi(){
            public void drive(){
                System.out.println("Drinving...");
            }
        };
        obj.drive();
    }
}
