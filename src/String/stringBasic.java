package String;

public class stringBasic {
    public static void main(String[]args){
        String name1="Litu";
        String name2="Litu";
        String name3 = new String("Litu");
        String name4 = new String("LITU");
        // if i compare the string using == oprator
        // 1.then name1 == name2 True because it compare the reference using string pool stack present in heap memory
        System.out.println(name1 == name2);
        // 2. if i try to compare name2 == name3 then the reasult is false because the reference of name3 outside the stackpool memory there for it give me false
        System.out.println(name1 == name3);
        // 3.to compare the value of a string we use .equals() method
        System.out.println(name1.equals(name3));
        // 4. also we have .equalsIgnoreCase() method to check the value without comparring the case(Upper Case or Lower Case)
        System.out.println(name3.equalsIgnoreCase(name4));

    }
}
