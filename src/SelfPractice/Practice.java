package SelfPractice;

public class Practice {
    public static void main(String[]args){
//        int x= 0;
//        ContactObject contact;
//        String[] arr = new String[4];
//        arr[0]="Bharat";
//        arr[1]="Lipi";
//        arr[2]="Sonu";
//        arr[3]="Mama";
//        while(x<4){
//            contact = new ContactObject();
//            contact.name = arr[x];
//            System.out.println(contact.name);
//            x=x+1;
//        }
        int orgin = 42;
        Practice p = new Practice();
        int y = p.go(orgin);
        System.out.println(y);


    }
    int go(int orgin){
        return orgin = orgin*2;
    }
}
