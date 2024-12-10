package bank;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account("BE00.1111.2222");

        ThreadWithdrawal t1 = new ThreadWithdrawal(account, "Sofia", 20);
        ThreadWithdrawal t2 = new ThreadWithdrawal(account, "Jeroen", 40);
        ThreadDeposit t3 = new ThreadDeposit(account, "Rupta", 35);
        ThreadWithdrawal t4 = new ThreadWithdrawal(account, "Bruno", 80);
        ThreadWithdrawal t5 = new ThreadWithdrawal(account, "Kesha", 40);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        while (t1.isAlive() || t2.isAlive() || t3.isAlive() || t4.isAlive()|| t5.isAlive()) {

        };

        System.out.println(account.getBalance());
    }
}
