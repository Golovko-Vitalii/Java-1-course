package _module3.les_29_170120.SingleTonPattern;

public class BankTest {
    public static void main(String[] args) {

        Bank.initBank("OSHCHAD");
        Bank bank = Bank.getInstance();

        Bank.initBank("hello!");
        Bank bank2 = Bank.getInstance();

        System.out.println(bank);
        System.out.println(bank2);
    }
}
