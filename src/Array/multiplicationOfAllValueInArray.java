package Array;

public class multiplicationOfAllValueInArray {
    void main(){
        int arr[] = {1,3,4,5,10};
        int multiplicationValue= 1;
        for (int value : arr){
            multiplicationValue*=value;
        }
        System.out.println(multiplicationValue);
    }
}
