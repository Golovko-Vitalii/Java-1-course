package _module3.les_21_170110._bank;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // конструктор копирования
    public Account(Account a) {
        this.name = a.name;//kopija
        this.balance = a.balance;//kopija
        System.out.println("constuctor of copy accaunt");
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Acc{" +
                "" + name + '\'' +
                ", " + balance +
                '}';
    }
}
