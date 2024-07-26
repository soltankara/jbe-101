package OOPquestions.problem7;
/*Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts,
and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.*/

import java.util.ArrayList;

public class MainPart {
    public static void main(String[] args) {
        Account account1 = new Account("Kamil", 1000);
        Account account2 = new Account("Murad", 1500);

        Bank.addAccount(account1);
        Bank.addAccount(account2);

        ArrayList<Account> accounts = Bank.getAccounts();

        for (Account account : accounts) {
            System.out.println(account.accountInfo());
        }
        System.out.println("\nAfter changing: ");
        Bank.depositMoney(account1, 500);
        for (Account account : accounts) {
            System.out.println(account.accountInfo());
        }
    }
}
