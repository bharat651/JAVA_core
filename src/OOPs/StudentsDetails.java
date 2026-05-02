package OOPs;

public class StudentsDetails {
    public static void main(String[]args){
        MarkDetails s1 = new MarkDetails(1,"Bharat",65);
//        s1.Ispass();
//        s1.gread();
        MarkDetails s2 = new MarkDetails(2,"Prabhu Prasad",89);
        MarkDetails s3 = new MarkDetails(3,"Chakra",86);
        MarkDetails.topper(s1,s2,s3);
    }
}
