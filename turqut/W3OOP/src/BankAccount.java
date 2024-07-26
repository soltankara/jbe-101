public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountName, String accountHolderName, double balance) {
        this.accountNumber = accountName;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited : " + amount + ". New balance : " + balance);
        } else {
            System.out.println("Deposit must be greater than 0.0");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn : " + amount + ". New balance : " + balance);
        } else {
            System.out.println("Withdrawal amount must be greater than 0.0 and not exceed the current balance.");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}
