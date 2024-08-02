package OOP;

import java.util.Arrays;

public class Bank{
    private static Account[] accounts = new Account[100];
    private static int count = 0;
    public Bank() {
    }
    public void addAccount(Account account){
        if(accounts.length < count){
            accounts = Arrays.copyOf(accounts, accounts.length * 2);
        }
        accounts[count++] = account;
    }
    public void removeAccount(int accountNumber) {
        for (int i = 1; i <= count; i++) {
            for (int j = 0; j < accounts.length; j++) {
                if (accounts[j] != null && accounts[j].getAccountNumber() == accountNumber) {
                    accounts[j] = null;
                    break;
                }
            }
        }
    }
    public void displayAccounts(){
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i] + " ");
        }
    }
}
