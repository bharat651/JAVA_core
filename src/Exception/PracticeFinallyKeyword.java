package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class A  {
    int num = 0;
    public void show() throws IOException,NumberFormatException{
        try(BufferedReader br = new BufferedReader( new InputStreamReader(System.in)); ){

            ;
            num = Integer.parseInt(br.readLine());
        }
//        finally {
//            br.close();
//        }
    }

}

public class PracticeFinallyKeyword {
    public static void main(String[]agsr){
        A a = new A();
        try{
            a.show();
        }
        catch(Exception e){
            System.out.println("Hii");
        }
    }
}
