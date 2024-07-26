import java.util.ArrayList;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("John", "A101", 1000.0);
        Account account2 = new Account("Bob", "A102", 2000.0);
        Account account3 = new Account("Tom", "A103", 1800.0);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        ArrayList<Account> accounts = bank.getAccounts();

        for (Account account : accounts) {
            account.printAcountDetails();
        }

        //Some changes for accounts
        bank.depositAccount(account1, 500.0);
        bank.withdrawAccount(account2, 1000.0);
        bank.depositAccount(account3, 300.0);

        System.out.println("After changes : ");
        System.out.println();

        for (Account account : accounts) {
            account.printAcountDetails();
        }

    }
}
