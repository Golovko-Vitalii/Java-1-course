package _module2.les_17_170103._stack_model;

import java.util.Scanner;

public class StackTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("maxSize = ");
        int maxSize = scanner.nextInt();
        Stack stack = new Stack(maxSize);
        for (int i = 0; i < maxSize+2 ; i++) {// +2 Failed to push item
            stack.push(i+1);
        }
        while(!stack.isEmpty()) System.out.println(stack.pop());

    }
}
