package _module3.les_19_170105._3_1_2_my_exceptions;

import java.util.Date;

public class MyException extends Exception {
    private String name;

    public MyException(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return
                "MyException "+name+ " at time "+new Date();
    }
}
