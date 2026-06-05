package Exception;
class Division{
    int firstNumber;
    int secondNumber;
    public Division(int a , int b){
        this.firstNumber = a;
        this.secondNumber = b;
    }
    public int division(){
        try{
            return firstNumber/secondNumber;
        } catch (Exception e) {
            System.out.print("denometer not be zero"+e);
        }
        return 0;
    }
}
class Calculator extends Division{
    public Calculator(int a ,int b){
        super(a,b);
    }

}
public class PracticeException {
    public static void main(String[]a){
        Calculator c = new Calculator(20,0);
        c.division();
        int[] num = new int[5];
        try{
            System.out.println(num[1]);
            System.out.println(num[5]);
        }
        catch (Exception e){
            System.out.println("Somting went wrong "+e.getMessage());
        }
    }
}
