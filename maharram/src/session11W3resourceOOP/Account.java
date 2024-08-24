package session11W3resourceOOP;

import com.sun.jdi.connect.Connector;

public class Account {
    private String customerName;
    private String accountNumber;
    private double balance ;
    public Account(String customerName,String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.customerName=customerName;
        this.balance=balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit (double amount ){
       if (amount>0){
           balance+=amount;
           System.out.println("deposit amount  : "+amount+" balance : "+balance);
       }else {
           System.out.println("Invalid deposit amount  ");
       }
    }
    public void withdrav(double amount){
        if(amount>0&&amount<=balance){
            balance-=amount;
            System.out.println("withdravn amount : "+amount+" balance : "+balance);
        }else{
            System.out.println("Invalid withdrav amount ");
        }
    }
    @Override
    public String toString() {
        return "Account{" +
                "customerName='" + customerName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance + '}';
    }
}
