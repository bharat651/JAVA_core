package SelfPractice;
abstract class computer{
    public abstract  void coding();
}
class laptop extends computer{
    public void coding(){
        System.out.println("write test compile");
    }
}
class desktop extends computer{
    public void coding(){
        System.out.println("write test compile Fast");
    }
}
class developer{
    public void dev(computer lap){
        lap.coding();
    }
}
public class demo {
    public static void main(String[]args){
        developer d = new developer();
        computer lap = new laptop();
        computer dek = new desktop();
        d.dev(dek);
    }
}
