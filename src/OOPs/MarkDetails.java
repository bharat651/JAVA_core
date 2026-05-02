package OOPs;

public class MarkDetails {
    int id;
    String name;
    int mark;
    public  MarkDetails(int id,String name,int mark){
        this.id = id;
        this.name = name;
        this.mark=mark;
    }
    public void Ispass(){
        if(this.mark >= 40){
            System.out.println(this.name+" is pass");
        }
        else{
            System.out.println(this.name+" is fail");
        }
    }

    public void gread(){
        if(this.mark <=100){
            if(this.mark >=90){
                System.out.println("Gread: A");
            }
            else if(this.mark >=70){
                System.out.println("Gread: B");
            }
            else if(this.mark >=60){
                System.out.println("Gread: C");
            }
            else if(this.mark >=40){
                System.out.println("Gread: D");
            }
            else {
                System.out.println("Gread: F");
            }
        }
        else{
            System.out.println("Enter the valid number");
        }
    }

    public static void topper(MarkDetails s1,MarkDetails s2,MarkDetails s3){
        int MaxMark = Math.max(s1.mark,Math.max(s2.mark,s3.mark));
        if(s1.mark == MaxMark){
            System.out.println(s1.name+" is topper");
        }
        else if(s2.mark == MaxMark){
            System.out.println(s2.name+" is topper");
        }
        else{
            System.out.println(s3.name+" is topper");
        }
    }
}
