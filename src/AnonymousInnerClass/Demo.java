package AnonymousInnerClass;
 class Car{
    public void playMusic(){
        System.out.println("Music Playing...");
    }
    public  void drive(){
        System.out.println("");
    }
}

public class Demo {
    public static void main(String[]a){
        Car obj = new Car(){
            //this is anonymous inner class
            public void drive(){
                System.out.println("Driving..");
            }
        };
        obj.drive();
    }
}
