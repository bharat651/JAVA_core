package Array;
import java.util.Scanner;

public class sumOfAllValueInArray {
    void main(){
        System.out.println("Enter the size of an Array");
        Scanner input = new Scanner(System.in);
        int sizeOfArray = input.nextInt();
        int arr [] = new int[sizeOfArray];
        for(int i =1;i<=sizeOfArray;i++){
            int index = i-1;
            System.out.println("Enter the "+index+"'s index value");
            Scanner value = new Scanner(System.in);
            int arrayValue = value.nextInt();
            arr[index]=arrayValue;
        }
        int sumOfValue = 0;
        for(int value : arr){
            sumOfValue += value;
        }
        System.out.println("Sum of Array value is : "+sumOfValue);
        input.close();
    }
}
