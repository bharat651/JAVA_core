package Inheritance;

public class Vehicle {
     String name ;
    public String model;
    public int noOfTair;
    Vehicle(String name,String model,int noOfTair){
        this.name = name;
        this.model = model;
        this.noOfTair = noOfTair;
    }
    public void startEngine(){
        System.out.println("Engine Start");
    }
    public void stopEngine(){
        System.out.println("Engine Stop");
    }
}
