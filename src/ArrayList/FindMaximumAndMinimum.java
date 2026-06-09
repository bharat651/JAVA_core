package ArrayList;
import java.util.ArrayList;
import java.util.Collection;
public class FindMaximumAndMinimum {
    public static void main(String[]args){

        ArrayList<Integer> arr = new ArrayList();
        arr.add(3);
        arr.add(1);
        arr.add(4);
        arr.add(7);
        arr.add(34);
        int max = arr.get(0);
        int min = arr.get(0);
        for(int num : arr){
            if(num>max){
                max=num;
            }
            else if(num<min){
                min=num;
            }
        }
        System.out.println("Max number: "+max);
        System.out.println("Min number: "+min);

    }
}
