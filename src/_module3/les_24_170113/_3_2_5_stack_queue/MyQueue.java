package _module3.les_24_170113._3_2_5_stack_queue;

import java.util.LinkedList;

/*
push offer
pop  poll
 */
public class MyQueue<T> { //FIFO
    //12345 -> 54321 LIFO стек
    //12345 -> 12345 FIFO очередь
    private LinkedList<T> items;

    //constructor
    public MyQueue() {
        items = new LinkedList<T>();
    }

    //можно создать конструкторы разные
    public void offer(T item) { // like push
        items.offer(item);
    }

    public T poll() { // like pop
        return items.poll();
    }

    //public T poll(){return items.remove();}// to ze samoe
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "items=" + items +
                '}';
    }
}
