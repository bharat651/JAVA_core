package Enum;
enum Status{
    Running,Pending,Faild,Sucess;
}
enum laptop{
    Apple(80000),Asus(60000),Hp(50000),Lenovo();
    private int price;
    // it is the constructur to give price to the object
    private laptop(int price){
        this.price = price;
    }
    //if there is any object present without any attribute or any value then we can create a
    //default constructure to set the default value
    private laptop(){
        this.price=40000;
    }
    public int getPrice(){
        return price;
    }
}
public class PracticeEnum {
    public static void main(String[]a){
//        Status s = Status.Sucess;
//        Status[] ss = Status.values();
//        System.out.println(s.ordinal());
//        System.out.println(s.equals(s.Running));
//        for(Status each: ss){
//            System.out.println(each);
//        }
//        switch(s){
//            case Running:{
//                System.out.println("Running");
//                break;
//            }
//            case Pending:{
//                System.out.println("Wait");
//                break;
//            }
//            case Faild:{
//                System.out.println("Try Again");
//                break;
//            }
//            default:{
//                System.out.println("Donee");
//                break;
//            }
//        }

        //video 2
        // to access all the object in enum class
        laptop[] lap = laptop.values();
        for (laptop eachValue:lap){
            System.out.println(eachValue+" : "+eachValue.getPrice());
        }
    }
}
