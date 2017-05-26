package _module3.les_29_170120.SingleTonPattern;

public class Bank {
    private static Bank instance = null;

    static void initBank(String name) {
        if (instance == null) instance = new Bank("OSHCHAD");
    }

    /*static  {//stati4eskij blok
    }*/
    public static Bank getInstance() {
        return instance;
    }

    private String name;

    private Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                '}';
    }
}
