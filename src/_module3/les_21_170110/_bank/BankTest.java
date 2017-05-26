package _module3.les_21_170110._bank;

import java.util.List;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.add(new Account("A",1000));
        bank.add(new Account("StringT",-1000));
        bank.add(new Account("C",2000));
        bank.add(new Account("D",-2000));
        bank.add(new Account("E",3000));
        bank.add(new Account("F",-3000));
        System.out.println("Begin bank operations:");
        System.out.println("bank.getAllAccounts() = "+bank.getAllAccounts());
        List<Account> positiveAcc = bank.getPositiveAccounts();
        System.out.println("positiveAcc = "+positiveAcc);
        //1
        positiveAcc.get(1).setBalance(-1000000);
        System.out.println("bank.getAllAccounts() = "+bank.getAllAccounts());
        //2
        bank.getAllAccounts().get(5).setBalance(1000000);
        System.out.println("bank.getAllAccounts() = "+bank.getAllAccounts());
        //
        bank.setBalance(5,1000000);
        System.out.println("bank.getAllAccounts() = "+bank.getAllAccounts());
    }
}
