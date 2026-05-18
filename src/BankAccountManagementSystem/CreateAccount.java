package BankAccountManagementSystem;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class CreateAccount {
    private String firstname;
    private String lastname;
    private int age;
    private String city;
    Scanner input = new Scanner(System.in);
    public CreateAccount(){

        System.out.println("Enter Your First Name");
        setFirstName(input.nextLine());
        System.out.println("Enter Your Last Name");
        setLastName(input.nextLine());
        System.out.println("Enter Your Age");
        setAge(input.nextInt());
        System.out.println("Enter Your City");
        input.nextLine();
        setCity(input.nextLine());
    }

    public void setFirstName(String firstname){
        this.firstname = firstname.trim();
    }
    public void setLastName(String lastname){
        this.lastname = lastname.trim();
    }
    public String getName(){
        return(firstname+" "+lastname);
    }
    public void setAge(int age){
        if(age<100 && age>1){
            this.age = age;
        }
        else{
            System.out.println("Enter valid age");
            setAge(input.nextInt());
        }
    }
    public int getAge(){
        return age;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return city;
    }
    public void getDetails(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("City: "+getCity());
    }





//    private LocalDate dob;

//    public static LocalDate readDateOfBirth(Scanner sc) {
//        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        while (true) {
//            System.out.print("Enter date of birth (dd/MM/yyyy): ");
//            String line = sc.nextLine().trim();
//            try {
//                LocalDate dob = LocalDate.parse(line, fmt);
//                if (dob.isAfter(LocalDate.now())) {
//                    System.out.println("Date of birth cannot be in the future.");
//                    continue;
//                }
//                if (dob.isBefore(LocalDate.now().minusYears(150))) {
//                    System.out.println("Please enter a realistic birth year (not older than 150 years).");
//                    continue;
//                }
//                return dob;
//            } catch (DateTimeParseException e) {
//                System.out.println("Invalid format, please try again.");
//            }
//        }
//    }
}
