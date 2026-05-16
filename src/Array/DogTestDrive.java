package Array;

public class DogTestDrive {
    public static void main(String[]args){
        Dog[] d;
        d = new Dog[3];
        d[0] =new Dog(3,"puppy","black");
        d[1]=new Dog(5,"kalu","brown");
        d[2]=new Dog(6,"tommy","white");

        //if i need d2 refer to the existing object d1 then the code is
        d[2]=d[1];
        d[2].run();
        // i have not insert any value to d[4] if i want to access the d[4].run()
        // d[3].run();
    }
}
//package Array;
//class DogTestDrive{
//    public static void main(String[]args){
//        String[] isaland = new String[2];
//        int[] index = new int[2];
//        isaland[0]="Barmunda";
//        isaland[1]="Fizi";
//        index[0] = 1;
//        index[1]=0;
//        int y = 0;
//        int ref;
//        while(y<2){
//            ref = index[y];
//            System.out.println("island = "+isaland[ref]);
//            y=y+1;
//        }
//
//    }
//}
