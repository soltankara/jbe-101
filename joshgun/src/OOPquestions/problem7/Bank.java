package OOPquestions.problem7;

import java.util.ArrayList;

public class Bank {
    private final static ArrayList<Account> accounts = new ArrayList<Account>();

    public static void addAccount(Account account) {
        accounts.add(account);
    }

    public static void removeAccount(Account account) {
        accounts.remove(account);
    }

    public static void depositMoney(Account account, int money) {
        account.deposit(money);
    }

    public static void witdrawMoney(Account account, int money) {
        account.withdraw(money);
    }

    public static ArrayList<Account> getAccounts() {
        return accounts;
    }
}
