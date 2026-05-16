package ConsoleBaseQuizSystem;
import java.util.Scanner;
public class QuziService {
    Scanner input = new Scanner(System.in);
    Quzi[] q = new Quzi[7];
    public QuziService(){
        q[0] = new Quzi(1,"what is ue name","1","3","5","6","5");
        q[1] = new Quzi(1,"what is ue name","1","3","5","6","5");
        q[2] = new Quzi(1,"what is ue name","1","3","5","6","5");
        q[3] = new Quzi(1,"what is ue name","1","3","5","6","5");
        q[4] = new Quzi(1,"what is ue name","1","3","5","6","5");
        q[5] = new Quzi(1,"what is ue name","1","3","5","6","5");
        q[6] = new Quzi(1,"what is ue name","1","3","5","6","5");
    }
    public void askQuestion(){
//        for(int i=0;i<q.length;i++){
//            System.out.println(q[i].getId()+" "+q[i].getQuestion());
//            System.out.println("1. "+q[i].getOpt1()+"    "+"3. "+q[i].getOpt3());
//            System.out.println("2. "+q[i].getOpt2()+"    "+"4. "+q[i].getOpt4());
//            String userInput = input.nextLine();
//            if(userInput.equals(q[0].getAnswer())){
//                System.out.println("Right answer");
//            }
//            else{
//                System.out.println("Wrong answer");
//            }
//        }
        for(Quzi question : q){
            System.out.println(question);
            String userInput = input.nextLine();
            if(userInput.equals(question.getAnswer())){
                System.out.println("Right answer");
            }
            else{
                System.out.println("Wrong answer");
            }
        }
    }

}
