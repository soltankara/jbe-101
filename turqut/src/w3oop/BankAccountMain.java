package turqut.src.w3oop;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("AZ10435AZN345", "Turqut Ismayil", 1000.0);
        System.out.println("Current balance for " + account.getAccountHolderName() + " : " + account.checkBalance());
        account.deposit(4000.0);
        account.withdraw(3000.0);
        System.out.println("Current balance: " + account.checkBalance());

        SavingAccounts savings = new SavingAccounts("TR10872TRL641", "Kaan Yigit", 2000.0, 5.0);
        savings.applyInterest();
        System.out.println("Savings account balance: " + savings.checkBalance());
    }
}
