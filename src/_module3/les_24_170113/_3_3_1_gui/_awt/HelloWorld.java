package _module3.les_24_170113._3_3_1_gui._awt;

import javax.swing.*;
import java.awt.*;

public class HelloWorld extends JFrame {
    public HelloWorld(String title) throws HeadlessException {
        //setTitle("HelloWorld");
        super(title);
        this.setSize(400, 400);
        add(myButton);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        HelloWorld myHello = new HelloWorld("HelloWorld");
    }

    JButton myButton = new JButton("Click me");
}