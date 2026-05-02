package OOPs;

import static java.lang.Thread.sleep;

public class detailsOfStudent {
    // this is Attribute
    public int id;
    public  String name;
    public String branch;
    public int noOfSubject;
    public int year;



//     default constructure
    public detailsOfStudent(){
        System.out.println("default constructure call");
    }



    //this is parametarize constructur
    public detailsOfStudent(int id,String name,String branch,int Subject,int year){

        //seting value for Attribute
        System.out.println("Parametarize Constructur");
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.noOfSubject = Subject;
        this.year = year;
    }


    //copy constructure
    public detailsOfStudent(detailsOfStudent s1obj){
        //seting value for Attribute
        System.out.println("Copy Constructur");
        this.id = s1obj.id;
        this.name = s1obj.name;
        this.branch = s1obj.branch;
        this.noOfSubject = s1obj.noOfSubject;
        this.year = s1obj.year;
    }


    void sleep(){
        System.out.println(name+" is slipping");
    }
    void study(){
        System.out.println(name+" is studying");
    }
    void details(){
        System.out.println("Student Name: "+name);
        System.out.println("Student Branch: "+branch);
        System.out.println("Student No of Subject: "+noOfSubject);
        System.out.println("Student in "+year+" Year");
    }

}
