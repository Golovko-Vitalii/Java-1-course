package _module2.les_14_161222._2_8_interfaces_with_generic;

public class Complex implements Addable <Complex>, Multipliable<Complex> {
    private double x, y;



    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }
// ctrl+i
    @Override
    public Complex plus(Complex that) {
        return new Complex(this.x + that.x,this.y + that.y);
    }

    @Override
    public Complex minus(Complex that) {
        return new Complex(this.x-that.x,this.y - that.y);
    }

    @Override
    public Complex divide(Complex that) {
        return new Complex((this.x*that.x+this.y*that.y)/(this.x*that.x+that.y*that.y),
                           (that.x*this.y-this.x*that.y)/(this.x*that.x+that.y*that.y));
    }

    @Override
    public Complex mult(Complex that) {
        return new Complex(this.x*that.x-this.y*that.y,this.x*that.y-this.y*that.x);
    }

    @Override
    public String toString() {
        return "Complex{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    /*
    //plus ---- (x1+x2, y1+y2)
    public Complex plus (Object that){
        return new Complex(this.x + ((Complex)that).x,this.y + ((Complex)that).y);
    }
    public Complex minus (Object that){
        return new Complex(this.x - ((Complex)that).x,this.y - ((Complex)that).y);
    }
    */
}
