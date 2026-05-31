package FunctionaInterface;
@FunctionalInterface
interface Runner{
    void run();
}
public class PracticeFunctionalInterface {
    public static void main(String[]a){
        Runner x = new Runner(){
            public void run(){
                System.out.println("i am running");
            }
        };
        x.run();
    }
}
