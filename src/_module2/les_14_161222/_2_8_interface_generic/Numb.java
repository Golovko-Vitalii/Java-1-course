package _module2.les_14_161222._2_8_interface_generic;

public class Numb {
    private double x;

    public Numb(double x) {
        this.x = x;
    }

    public Numb plus (Numb that){
        return new Numb(this.x + that.x);
    }

    public Numb minus (Numb that){
        return new Numb(this.x - that.x);
    }

    public Numb mult (Numb that){
        return new Numb(this.x * that.x);
    }

    @Override
    public String toString() {
        return "Numb{" +"x=" + x +'}';
    }
}
