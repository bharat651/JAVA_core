package BankAccountManagementSystem;
import java.time.LocalDateTime;
public class Account {
    private double balance;
    private long account_number=550340;
    LocalDateTime datetime =  LocalDateTime.now();
    public void setBalance(int amount){
        balance +=  amount;
    }
    public double getBalance(){
        return balance;
    }
    public void setAccountNumber(){
        account_number += 1;
    }
    public long getAccountNumber(){
        return account_number;
    }
//    public String toString(){
//        account_number+=1;
//        return null;
//    }

}
