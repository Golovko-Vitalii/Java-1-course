package _module3.les_19_170105._home_work._calculator;

public class MyException extends Exception {
    private String name;

    public MyException(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "My exception, to string: "+this.name;
    }
    @Override
    public String getMessage() {
        return "My exception, get message: "+this.name;
    }
}
