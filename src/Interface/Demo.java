package Interface;
interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Coding in Laptop");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Coding in Desktop");
    }
}
class Dev{
    public void develop(Computer C){
        C.code();
        System.out.println("developing....");
    }
}
public class Demo {
    public static void main(String[]a){
        Dev d = new Dev();
        Computer lap = new Laptop();
        Computer des = new Desktop();
        d.develop(lap);
    }
}
