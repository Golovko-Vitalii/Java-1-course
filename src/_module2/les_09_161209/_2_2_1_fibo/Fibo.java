package _module2.les_09_161209._2_2_1_fibo;

public class Fibo {
    private int n1;
    int n2;

    public Fibo() {        //this.n1 = -1;        //this.n2 = 1;
        init();
    }

    public int next() {// метод що генерує числа Фібоначчі
        int n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        return n3;
    }

    // public void reset(){this.n1 = -1;this.n2 = 1;} заменяем на   {init(); }
    public void reset() {// метод що анулює генерацію чисел Фібоначчі
        init();
    }

    private void init() {
        this.n1 = -1;
        this.n2 = 1;
    }
}
