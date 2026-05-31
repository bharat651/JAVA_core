package Annotation;
class NickName{
    public void name(){
        System.out.print("Litu");
    }
}
class FullName extends NickName{
    @Override
    public void name(){
        System.out.print("Bharat Bhusan Mohanty");
    }
}
public class PracticeAnnotation {
    public static void main(String[]a){
        FullName f = new FullName();
        f.name();
    }
}
