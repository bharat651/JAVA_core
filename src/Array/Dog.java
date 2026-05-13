package Array;

public class Dog {
    private int age;
    private String name;
    private String color;
    public Dog(int age,String name,String color){
        this.age = age;
        this.name = name;
        this.color = color;
    }
    public void run(){
        System.out.println(this.name+" is Runing");
    }
}
