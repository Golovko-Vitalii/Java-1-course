package _module3.les_24_170113._3_2_5_stack_queue;

import java.util.LinkedList;

public class MyStack<T> { //LIFO
    //12345 -> 54321 LIFO стек
    //12345 -> 12345 FIFO очередь
    private LinkedList<T> items;//stack

    public MyStack() {
        items = new LinkedList<>();
    }

    //push, pop, isempty

    public void push(T item) {
        items.push(item);
    }

    public T pop() {
        return items.pop();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public String toString() {
        return "MyStack{" +
                items +
                '}';
    }
}
