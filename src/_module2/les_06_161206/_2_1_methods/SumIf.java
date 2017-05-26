package _module2.les_06_161206._2_1_methods;

    public class SumIf {
        public static void main(String[] args) {
            double [] a = {10,-10,20,-20,30,-30};
            System.out.println(sumIf(a, "<0"));
            System.out.println(sumIf(a, ">0"));
            System.out.println(sumIf(a, ">10"));
        }
        static double sumIf(double [] a, String str){
            int index;
            if (Character.isDigit(str.charAt(1))) index=1;
            else index=2;
            String sign = str.substring(0, index); //"<"
            double value =
                    Double.parseDouble(str.substring(index)); //"100"
            double sum = 0;
            switch (sign) {
                case ">":
                    for (double number : a) {
                        if (number > value) sum += number;
                    }
                    break;
                case "<":
                    for (double number : a) {
                        if (number < value) sum += number;
                    }
                    break;
            }
            return sum;




        }
    }

