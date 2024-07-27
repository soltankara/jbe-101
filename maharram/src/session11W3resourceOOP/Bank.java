package session11W3resourceOOP;
import java.util.ArrayList;
public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<Account>();
    }

    public void addAcount(Account account) {
        accounts.add(account);
         System.out.println("account added " + account);
    }

    public void removeAccount(String accountNumber) {
        Account accountToRemove = null;
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                accountToRemove = account;
                break;
            }
        }
        if (accountToRemove != null) {
            accounts.remove(accountToRemove);
            System.out.println("account removed : " + accountToRemove);
        } else {
            System.out.println("account not found : " + accountNumber);
        }
    }

    public void showAcounts() {
        System.out.println("Bank accounts :");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
