package Array;
import java.util.Scanner;
public class sumOf2dArray {
    int[][] creating2dArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row size");
        int row = input.nextInt();
        System.out.println("Enter column size");
        int column = input.nextInt();
        int arr[][] = new int [row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                Scanner value = new Scanner(System.in);
                arr[i][j]=value.nextInt();
            }
        }
        return arr;
    }
    void main(){
        int Array[][]=creating2dArray();
        int sum = 0;
        for(int[] value:Array){
            for (int x:value){
                sum+=x;
            }
        }
        System.out.println(sum);
    }
}
