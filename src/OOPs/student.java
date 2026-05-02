package OOPs;

public class student {
    public static void main(String[]args){

        //default constructur
        detailsOfStudent c= new detailsOfStudent();



        detailsOfStudent A = new detailsOfStudent(1,"litu","CSE",5,4);
//        A.name = "Litu";
        System.out.println(A.name);
        System.out.println(A.id);
        System.out.println(A.branch);
        System.out.println(A.noOfSubject);
        System.out.println(A.year);

        A.sleep();
        A.details();


        //copy constructure
        detailsOfStudent B = new detailsOfStudent(A);
        System.out.println(B.name);
        System.out.println(B.id);
        System.out.println(B.branch);
        System.out.println(B.noOfSubject);
        System.out.println(B.year);
    }
}
