package Array;

public class reverseArray {
    void main(){
        int [] arr = {11,10,13,43};
        int i =0;
        int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for (int value:arr){
            System.out.print(value+" ");
        }
    }
}
