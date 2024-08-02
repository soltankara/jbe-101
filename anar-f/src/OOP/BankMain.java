package OOP;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account1 = new Account(24.34, "anar", 87347884);
        Account account2 = new Account(21.34, "adil", 3242445);
        account1.deposit(34243.32);
        account2.withdraw(2342.23);
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.removeAccount(87347884);
        bank.removeAccount(3242445);
        bank.displayAccounts();
    }
}
