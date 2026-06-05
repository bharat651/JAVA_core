package Exception;
class FindClass{
    public void findClass() throws ClassNotFoundException{
        Class.forName("java.lang.String");
    }
}
class SubFindClass extends FindClass{
    public void findClass(){
        try{
            super.findClass();
            System.out.println("Class Found");
        }
        catch(ClassNotFoundException e){
//            try{
//                findClass();
//                System.out.println("Class found");
//            }
//            catch(ClassNotFoundException e){
//                e.printStackTrace();
//                System.out.println("Class not found");
//            }
            e.printStackTrace();
            System.out.println("Class not found");
        }
    }
}
public class PracticeThrowsKeyword {

    public static void main(String[]a) {

        SubFindClass sb = new SubFindClass();
        sb.findClass();

    }
}
