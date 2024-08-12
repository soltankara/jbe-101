package Module02.Session13;

public class Classwork {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("0907", 255.50);
        System.out.println(withdraw(account, 50));
    }

    public static double withdraw(BankAccount account, double amount) {
        try {
            if (amount < account.getBalance()) {
                throw new WithDrawException("Not enough balance");
            }
        } catch (WithDrawException e) {
            System.out.println(e.getMessage());
        }
        return account.getBalance() - amount;
    }

    public static int stringToInteger(String str) {
        int n;
        try {
            n = Integer.parseInt(str);
        } catch (Exception e) {
            throw new StringToIntegerException(e, "Not a number");
        }
        return n;
    }

    public static double divide(int n1, int n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        double result;
        result = (double) n1 / n2;
        return result;
    }
}
