package _module3.les_24_170113._3_2_5_stack_queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();
        for (int i = 65; i < 76; i++) {
            queue.offer((char) i + "");
            System.out.println(queue);
        }
        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.println("queue.poll() = "+queue.poll());
            //String tmp=queue.poll();
            //System.out.println(tmp);
            //queue.poll();
            System.out.println(queue);
        }
    }
}
