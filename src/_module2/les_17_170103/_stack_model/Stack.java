package _module2.les_17_170103._stack_model;

public class Stack { //implements Iterable<Integer>
    //FIFO - queue
    //LIFO - stack int
    private int [] items;
    private int maxSize;
    private int index;
    //void push(int item);
    //int pop();
    //isEmpty();
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.items = new int [maxSize];
        this.index=-1;
    }
    public void push(int item){
        if (index<maxSize-1) {
            index++;
            items[index] = item;
        } else System.out.println("Failed to push item "+item);
    }
    // prosche
//    public boolean push(int item){ if(index<maxSize-1){index++;items[index]=item;return true;} return false;}
    public int pop(){
        return items[index--];
    }
    // prosche  boolean res; i=st.pop(res); if(!res) sout(...) ili case res...
    //public int pop(var errorCode:boolean){return items[index--];};
    //public int pop(var errorCode:Intrger){return items[index--];};
    boolean isEmpty (){
        return (index<0);
    }

    //if(index<...) return Integer.MIN_VALUE

}
