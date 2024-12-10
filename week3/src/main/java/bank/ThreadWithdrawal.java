package bank;

public class ThreadWithdrawal extends Thread{
    private final Account accountNumber;
    private final double amount;
    private final String user;


    public ThreadWithdrawal(Account accountNumber,String user, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.user = user;
    }

   public void run() {
       try {
           accountNumber.withdraw(user, amount);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
   }
}
