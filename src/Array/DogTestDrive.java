package Array;

public class DogTestDrive {
    public static void main(String[]args){
        Dog[] d;
        d = new Dog[3];
        d[0]=new Dog(3,"puppy","black");
        d[1]=new Dog(5,"kalu","brown");
        d[2]=new Dog(6,"tommy","white");
        d[2].run();
    }
}
