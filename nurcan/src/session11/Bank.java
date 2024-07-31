package session11;

public class Bank {
    private Account[] accounts;
    private int numberOfAccounts;

    public Bank(int capacity) {
        accounts = new Account[capacity];
        numberOfAccounts = 0;
    }

    public void addAccount(Account account) {
        if (numberOfAccounts < accounts.length) {
            accounts[numberOfAccounts++] = account;
        } else {
            System.out.println("There is no place");
        }
    }

    public void removeAccount(String accountNumber) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                accounts[i] = accounts[numberOfAccounts - 1];
                accounts[numberOfAccounts - 1] = null;
                System.out.println("Account deleted");
            } else {
                System.out.println("Account not found");
            }
        }
    }

    public void withDraw(Account account, double amount) {
        account.withDraw(amount);
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

}
