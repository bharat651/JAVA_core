package InnerClass;
class Car{
    public void playMusic(){
        System.out.println("Music Playing...");

    }
    class WagonR{
        public void drive(){
            System.out.println("Driving ... ");
        }
    }
}
public class Demo {
    public static void main(String[]a){
        //creating Car class object
        Car c = new Car();
        c.playMusic();
        //creating WagonR class(inner class) object
        Car.WagonR W = c.new WagonR();
        W.drive();
    }
}
