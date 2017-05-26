package _module3.les_21_170110._3_2_2_set_map;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Frame("Hello!");
    }
}
