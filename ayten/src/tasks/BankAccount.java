package tasks;

public class BankAccount {
    public String accountNumber;
    public double current;

    public BankAccount(String accountNumber, double current) {
        this.accountNumber = accountNumber;
        this.current = current;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCurrent(double current) {
        this.current = current;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getCurrent() {
        return current;
    }
}
