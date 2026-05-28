package Interface;
interface Car{
    //in interface all variable are final
    int age=0;
    //in interface every method is public abstract
    void drive();
}
class Audi implements Car {

    public void drive() {
        System.out.println("Driving");
    }
}
public class Demo {
    public static void main(String[]args){
        Car c = new Audi(){
            public void drive(){
                System.out.println("hide drive");
            }
        };
        c.drive();
    }
}
