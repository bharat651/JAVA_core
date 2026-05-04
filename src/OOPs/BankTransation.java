package OOPs;

public class BankTransation {
    private int balance=0 ;
    public void deposit(int amount){
        balance+= amount;
        System.out.println("You have credit "+amount+" Acc. Now your balance is "+balance);
    }

}
