package Array;
import java.util.Scanner;
public class minimumValueInArray {
    int[] creatingArray(){
        System.out.println("Enter the size of an Array:");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr [] = new int[size];
        return insertValue(arr);
    }

    int[] insertValue(int[]Array){
        int length = Array.length;
        for(int i =1;i<=length;i++){
            int index = i-1;
            System.out.println("Enter the "+index+"'s value:");
            Scanner input = new Scanner(System.in);
            int value = input.nextInt();
            Array[index] = value;
        }
        return Array;
    }

    int findTheMinimumValue(int[]Array){
        int minimumValue = Integer.MAX_VALUE;
        for(int value:Array){
            if(value<minimumValue){
                minimumValue = value;
            }
        }
        return minimumValue;
    }


    void main(){
        int Array[] =creatingArray();
        int result = findTheMinimumValue(Array);
        System.out.println("Smallest number in the Array is : "+result);
    }
}
