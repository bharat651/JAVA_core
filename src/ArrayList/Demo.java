package ArrayList;

import java.util.ArrayList;

public class Demo {
    public static void main(String[]a){
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Litu");
        myList.add("Bharat");
        myList.add("Bhusan");
        System.out.println(myList.get(1));
        myList.remove("Bharat");
        System.out.println(myList.get(1));
        System.out.println(myList.indexOf("Bhusan"));
        System.out.println(myList.isEmpty());
        System.out.println(myList.contains("Bhusan"));
        System.out.println(myList.size());
    }
}
