package Exception;
class LituException extends Exception{
    public LituException(String s){
        super(s);
    }
}
public class CreatingMyOwnException {
    public static void main(String[]a){
        int i =10;
        int j = 0;
        try{
            System.out.print(j/j);
            throw new LituException("i dont want to print zero");
        }
        catch(LituException e){
            System.out.println("Somting went wrong"+e);
        }
        catch(ArithmeticException e){
            System.out.println("dimoneter not be zero");
        }
    }
}
