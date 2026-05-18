package BankAccountManagementSystem;
import java.util.Scanner;
public class BankAccount {
    public static void main(String[]a){
       Scanner sc = new Scanner(System.in);
       System.out.println("1.Create Account");
        System.out.println("2.Check Balance");
        System.out.println("3.Transfer Money");
        System.out.println("4.Diposit");
        System.out.println("Select the number:");
        int oprationNo = sc.nextInt();
        if(oprationNo == 1){
            CreateAccount ca = new CreateAccount();
            ca.getDetails();
        }
    }
}
