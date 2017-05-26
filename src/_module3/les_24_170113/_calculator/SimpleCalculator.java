package _module3.les_24_170113._calculator;

import javax.swing.*;
import java.awt.*;

public class SimpleCalculator extends JFrame {
    public static final String BUTTON_PLUS = "Plus";
    public static final String BUTTON_MINUS = "Minus";
    public static final String BUTTON_MULT = "Mult";
    public static final String BUTTON_DIV = "Div";
    private JTextField field1 = new JTextField(10);
    private JTextField field2 = new JTextField(10);
    private JTextField result = new JTextField(10);


    public SimpleCalculator(String title) {//construktor
        super(title);
        //1.Create a panel
        JPanel panel = new JPanel();
        //2.Set a layout for this panel
        FlowLayout layout = new FlowLayout();// all components in order in line
        panel.setLayout(layout);
        //3.Create controls in memory
        JLabel label1 = new JLabel("Number 1: ");
        JLabel label2 = new JLabel("Number 2: ");
        JLabel label3 = new JLabel("Result: ");
        JButton plus = new JButton("+");
        plus.setName(BUTTON_PLUS);
        JButton minus = new JButton("-");
        minus.setName(BUTTON_MINUS);
        JButton mult = new JButton("*");
        mult.setName(BUTTON_MULT);
        JButton div = new JButton("/");
        div.setName(BUTTON_DIV);
        //engine + listeners
        Engine engine = new Engine(field1, field2, result);
        plus.addActionListener(engine);
        minus.addActionListener(engine);
        mult.addActionListener(engine);
        div.addActionListener(engine);
        field1.addKeyListener(engine);
        field2.addKeyListener(engine);
        //4.Add controls to the panel
        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(label3);
        panel.add(result);
        JTextArea textArea1 = new JTextArea("operations:");
        panel.add(textArea1);
        panel.add(plus);
        panel.add(minus);
        panel.add(mult);
        panel.add(div);
        // 6. Add the panel to top-level container
        this.setContentPane(panel);
        // 7. set the size and make the window visible
        this.setSize(500, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SimpleCalculator("My First Calculator").setVisible(true);
    }
}
