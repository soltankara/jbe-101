import tasks.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bank=new BankAccount("2039",123);
        System.out.println(withdraw(bank,123.5));
    }

    public void StringToInteger(String s){
        try {
            int number=Integer.parseInt(s);
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }
    public double divide(int n1,int n2){

        if(n2!=0) return n1/n2;
        throw new ArithmeticException("divide by zero is impossible");
    }
    public static double withdraw(BankAccount ba,double amount){
        try{
            if(amount>ba.getCurrent())  {
                throw new Exception("Not enough money");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ba.current-amount;
    }

}