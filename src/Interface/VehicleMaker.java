package Interface;
interface Vehicle{
    int maxSpeed=0;
    void stop();
    void start();
    int getMaxSpeed();

}
class Car implements Vehicle{
    int maxSpeed;
    public Car(int maxSpeed){
        if(maxSpeed<450) {
            this.maxSpeed = maxSpeed;
        }
    }
    public void stop(){
        System.out.println(getClass().getSimpleName()+" is Stop");
    }


    public void start() {
        System.out.println(getClass().getSimpleName()+" is Start");
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }
}
class Bicycle implements Vehicle{
    final int maxSpeed=40;
    public void stop(){
        System.out.println(getClass().getSimpleName()+" is Stop");
    }


    public void start() {
        System.out.println(getClass().getSimpleName()+" is Start");
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }
}
public class VehicleMaker {
    public static void main(String[]a){
        Vehicle[] v = new Vehicle[2];
        v[0]=new Car(200);
        v[1]=new Bicycle();
        for(Vehicle obj:v){
            obj.start();
            obj.stop();
            System.out.println(obj.getMaxSpeed());
        }
    }
}
