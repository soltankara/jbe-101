package az.perfect.oop.session10and11exercise;

public class Account {

    //Exercise 7
    private String name;
    private String accountnumber;
    private double balance;

    public Account(String name, String accountnumber, double balance) {
        this.name = name;
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMoney(double amount) {
        return balance = balance -= amount;

    }

    public double addMoney(double amount) {
        return balance += amount;
    }

    public String getAccountInfo() {
        return "Name: " + name + " ,Account number: " + accountnumber + " ,Balance: " + balance;
    }
}
