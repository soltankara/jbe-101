package OOP;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setAccountNumber(95498334);
        bank.addAccount();
        bank.removeAccount();
        bank.displayAccounts();
    }
}
