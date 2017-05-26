package _module2.les_13_161219._2_6_1_interfaces_start._inner_interface;

public class PrB implements TopClass.isNum {
    private String n;

    public PrB(String n) {
        this.n = n;
    }

    public boolean isNumber (){
        boolean flag = false;
        try {
            Double.valueOf(this.n);
            flag=true;
        }
        catch (Exception e){

        }
        return flag;
    }
}
