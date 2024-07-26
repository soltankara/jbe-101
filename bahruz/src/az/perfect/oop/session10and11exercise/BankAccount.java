package az.perfect.oop.session10and11exercise;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    //Exercise 8
    private static List<Account> accountList = new ArrayList<>();

    /*
    7. "Bank" adlı bir sinif yaratmaq üçün hesablar və hesabların əlavə edilməsi və silinməsi,
    pulun qoyulması və çıxarılması üsulları toplusu ilə Java proqramı yazın.
     Müəyyən bir müştərinin hesab təfərrüatlarını saxlamaq üçün "Hesab" adlı bir sinif də təyin edin.
     */

    public static void addAccount(Account account) {
        accountList.add(account);
    }

    public static void removeAccount(Account account) {
        accountList.remove(account);
    }

    public static List<Account> getAccountList() {
        return accountList;
    }

    public static void setAccountList(List<Account> accountList) {
        BankAccount.accountList = accountList;
    }
}
