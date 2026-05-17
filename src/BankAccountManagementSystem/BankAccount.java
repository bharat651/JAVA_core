package BankAccountManagementSystem;

public class BankAccount {
    public static void main(String[]a){
        Account ac = new Account();
        ac.setBalance(20);
        ac.setAccountNumber();
        long x=ac.getAccountNumber();

        System.out.println(x);
    }
}
