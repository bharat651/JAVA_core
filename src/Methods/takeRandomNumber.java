package Methods;
import java.util.Scanner;
public class takeRandomNumber {
    static int[] createArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = input.nextInt();
        int arr[]=new int [size];
        for(int i =0;i<size;i++){
            System.out.println("Enter the value");
            arr[i]=input.nextInt();
        }
        return arr;
    }
    static void takeRandom(int[] arr){
        int randomValueIndex = (int) (Math.random()*arr.length);
        System.out.println("Random value of the Array is : "+arr[randomValueIndex]);
    }
    public static void main(String[]args){
       int[] Array=createArray();
        takeRandom(Array);
    }
}
