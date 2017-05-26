package _module2.les_11_161214._2_3_hiding_fields;

public class B extends A {
    int a=5; //hides field a from class OuterPack!!!

    @Override
    public int getA() {
        return  a; // == this.a!!!
        //return super.getA()+this.a;
    }
    public int getAA(){
        return super.a+this.a;
    }
}
