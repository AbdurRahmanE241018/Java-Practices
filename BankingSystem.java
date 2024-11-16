class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(500.0);

        System.out.println("Initial Balance: $" + myAccount.getBalance());
        myAccount.deposit(150.0);
        System.out.println("Balance after deposit: $" + myAccount.getBalance());

        myAccount.withdraw(100.0);
        System.out.println("Balance after withdrawal: $" + myAccount.getBalance());
    }
}
