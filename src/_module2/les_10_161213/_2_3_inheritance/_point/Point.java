package _module2.les_10_161213._2_3_inheritance._point;

public class Point {

    class Point1D{
        double x;
        public Point1D(){}

        protected Point1D(double x) {
            this.x = x;
        }

        @Override
        public String toString() {
            return "Point1D{" +
                    "x=" + x +
                    '}';
        }
        protected void sout () {
            System.out.println("PROTECTED!");
        }
    }
    class Point2D extends Point1D{
        double x;

        public Point2D(double x) {
            super();// можно не писать, пропишется по умолчанию при отсутствии super(x)
            this.x = super.x;//super.x is a root class field x
        }

        @Override
        public String toString() {
            return "Point2D{" +
                    "x=" + x +
                    "} " + super.toString();
        }

        @Override
        public void sout() {//extend access modifier from protected to public
            super.sout(); // call method sout from root class throu super.method()
        }
    }




}
