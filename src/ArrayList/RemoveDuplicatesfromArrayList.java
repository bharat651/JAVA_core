package ArrayList;

import java.util.ArrayList;
import java.util.Collection;

//public class RemoveDuplicatesfromArrayList {
//    public static void main(String[]a){
//        Collection<Integer> arr = new ArrayList<Integer>();
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(4);
//        arr.add(5);
//        arr.add(3);
//        arr.
//        Collection<Integer> newarr = new ArrayList<>();
//        for(int num:arr){
//            if(!newarr.contains(num)){
//                newarr.add(num);
//            }
//        }
//        for (int x:newarr){
//            System.out.println(x);
//        }
//    }
//}


import java.util.ArrayList;

public class RemoveDuplicatesfromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j))) {
                    arr.remove(j);
                    j--;
                }
            }
        }

        System.out.println(arr);
    }
}
