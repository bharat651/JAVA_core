package LamdaExpression;
interface Check{
    int show(int i , int j );
}

public class PracticeLamdaExpression {
    public static void main(String[]a){
        Check c = ( i,j) -> i+j;





       System.out.println( c.show(10,20));
    }
}
