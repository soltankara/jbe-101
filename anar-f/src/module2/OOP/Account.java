package module2.OOP;

public class Account {
    private double balance;
    private String accountName;
    private int accountNumber;

    public Account() {
    }

    public Account(double balance, String accountName, int accountNumber) {
        this.balance = balance;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accountName='" + accountName + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
