package OOP;

public class Bank {
    private int[] accounts = new int[100];
    private int accountNumber;
    private String accountName;
    private double balance;
    public Bank() {
    }
    public Bank(int[] accounts, int accountNumber, String accountName, double balance) {
        this.accounts = accounts;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public int[] getAccounts() {
        return accounts;
    }
    public void setAccounts(int[] accounts) {
        this.accounts = accounts;
    }
    public double deposit(double amount) {
        this.balance += amount;
        return this.balance;
    }
    public double withdraw(double amount) {
        this.balance -= amount;
        return this.balance;
    }
    public void addAccount(){
        for(int i = 0; i < accounts.length; i++){
            accounts[i]++;
        }
        System.out.println(accountNumber + " is added");
    }
    public void removeAccount(){
        for(int i = 0; i < accounts.length; i++){
            accounts[i]--;
        }
        System.out.println(accountNumber + " is removed");
    }
    public void displayAccounts(){
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i] + " ");
        }
    }
}
