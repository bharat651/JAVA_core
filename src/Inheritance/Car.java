package Inheritance;

public class Car extends Vehicle{
    int noOfDoors;
    int milage;
    Car(String name,String model,int noOfTair,int noOfDoors,int milage){
        super(name,model,noOfTair);
        this.name = name;
        this.model = model;
        this.noOfTair = noOfTair;
        this.noOfDoors = noOfDoors;
        this.milage = milage;
    }
    public void startCar(){
        System.out.println(this.name+" "+this.model+" \nNo Of Tairs: "+this.noOfTair+" \nNo Of Doors: "+this.noOfDoors+" \nIt Have "+this.milage+" Milage");
    }

    public static void main(String[]args){
        Car c = new Car("Audi","A4",4,6,10);
        c.startEngine();
        c.startCar();
        c.stopEngine();
    }
}
