package _module2.les_17_170103._lototron;

public class Loto {
    private int count;
    private  int index;
    private int [] numbers;

    public Loto(int count) {
        this.count = count; index = -1;
        this.numbers = new int [count];
        // number 1,2,3...count
        for (int i = 0; i < count; i++) {
            this.numbers[i]=i+1;
        }
        shuffle();
        //this.index = -1;
        //numbers=1,2,3,4,...count
        //shuffle();
    }
    public int next(){
        return this.numbers[++index];
    }
    public boolean hasNext (){
        return (index<count-1);
    }
    private void shuffle(){
        int j, tmp;
        for (int i = 0; i < count; i++) {
            j = (int)(Math.random()*count);
            tmp = numbers [i];
            numbers [i] = numbers[j];
            numbers [j] = tmp;
        }
    }
    public void reset (){
        shuffle();
        index = -1;
    }

}
