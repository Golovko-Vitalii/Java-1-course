package _module3.les_21_170110._bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void add(Account account) {
        this.accounts.add(account);
    }

    public void setBalance(int n, double money) {
        accounts.get(n).setBalance(money);
    }//[n] vytjanuli s massiva AL i tyda priswoili money

    public List<Account> getAllAccounts() {
        List<Account> tmp = new ArrayList<>();
        for (Account a : accounts) {
            tmp.add(new Account(a));
        }
        return tmp;
        //return new ArrayList<>(this.accounts);//wernet list is aaccountow
    }

    public List<Account> getPositiveAccounts() {
        List<Account> tmp = new ArrayList<>();
        for (Account a : accounts) {
            if (a.getBalance() > 0) tmp.add(new Account(a));
        }
        return tmp;
    }
}
