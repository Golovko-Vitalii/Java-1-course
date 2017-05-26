package _module3.les_19_170105._home_work._calculator;

public class Operations {
    public int sum (int a, int b)throws MyException{
        try {
            return a+b;
        } catch (Exception e) {
            throw new MyException("sum");
        }
    }
    public int minus (int a, int b)throws MyException{
        try {
        return a-b;
        } catch (Exception e) {
            throw new MyException("minus");
        }
    }
    public int mult (int a, int b)throws MyException{
        try {
        return a*b;
        } catch (Exception e) {
            throw new MyException("mult");
        }
    }
    public double div (int a, int b)throws MyException{
        try {
        return a/(double)b;
        } catch (Exception e) {
            throw new MyException("div");
        }
    }
    public double sqrt (int a)throws MyException{
        try {
            if (Double.toString(Math.sqrt(a)).equals("NaN"))throw new MyException("sqrt");else return Math.sqrt(a);
        } catch (Exception e) {
            throw new MyException("sqrt");
        }
    }
}
