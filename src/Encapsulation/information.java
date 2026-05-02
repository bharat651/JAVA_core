package Encapsulation;

public class information {
    private String name ;
    private int age;
    private String phoneNo;

    public  information(String name,int age,String phoneNo){
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;

    }
    public void getName(){
        System.out.println(name);
    }
    public void updateName(String name){
        this.name = name;
    }
}
