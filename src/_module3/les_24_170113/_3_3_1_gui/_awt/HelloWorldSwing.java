package _module3.les_24_170113._3_3_1_gui._awt;

import javax.swing.*;

public class HelloWorldSwing extends JFrame{
    public HelloWorldSwing(){
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        HelloWorldSwing helloWorldSwing = new HelloWorldSwing();
        helloWorldSwing.setTitle("HelloWorldSwing");
        JButton button = new JButton("JButton");
        button.setSize(5,5);
        helloWorldSwing.add(button);
    }
}
