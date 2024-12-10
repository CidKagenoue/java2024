package bank;

public class Account {
    private String name;
    private final String accountNumber;
    private double amount;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.amount = 100;

    }

    public void deposit(String name, double amount) throws InterruptedException {
        this.amount += amount;
        this.name = name;
        System.out.println("Dit is "+ " " + name + " " + "zijn actie" + " " + "en de nieuwe balance is" + " = " + amount );
        Thread.sleep(1000);
    }
    public void withdraw(String name, double withdraw) throws InterruptedException {
        if (amount >= withdraw) {
            this.amount -= withdraw;
            this.name = name;
            System.out.println("Dit is "+ " " + name + " " + "zijn actie" + "en de nieuwe balance is" + " = " + amount );
        }
        else{
            System.out.println("niet genoeg saldo");
        }
        Thread.sleep(1000);

    }
    public double getBalance() {
        return amount;
    }

}
