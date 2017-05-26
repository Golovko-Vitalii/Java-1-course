package _module3.les_20_170106._generic_intro;

import java.util.Arrays;

public class Box {
    private Object [] values;

    public Box(Object[] input) {
        //this.values = values; // это плохо, в массив зайдут ссылки, а не значения массива
        // можно так или через копиаррей
        /*for (int i = 0; i < values.length; i++) {
            this.values[i]=values[i];
        }*/
        this.values= new Object[input.length];
        //values = Arrays.copyOfRange(input,0,input.length); // сделает типизацию нашего бокса в заходящий тип
        System.arraycopy(input,0,values,0,input.length);
    }

    public Object getN(int i) {
        return values[i];
    }

    public void setN(Object obj, int i) {
        values[i] = obj;
    }

    @Override
    public String toString() {
        return "Box{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
