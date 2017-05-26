package _module3.les_25_170116._dictionary.gui;

import _module3.les_25_170116._dictionary.logic.EngineClear;
import _module3.les_25_170116._dictionary.logic.EngineTranslate;

import javax.swing.*;
import java.awt.*;

public class DictionaryFrame extends JFrame {
    //private String header;
    JTextField jField1;
    JTextField jField2;

    public String getEngText() {
        return jField1.getText();
    }

    public void setEngText(String text) {
        this.jField1.setText(text);
    }

    public String getUkrText() {
        return jField2.getText();
    }

    public void setUkrText(String text) {
        this.jField2.setText(text);
    }


    public DictionaryFrame(String header) throws HeadlessException {
        super(header);
        this.setSize(400, 400);
        int xx = 200, yy = 200;
        this.setBounds(xx+200, yy, xx + 300, yy + 100);
        JPanel panel = new JPanel();
        GridLayout g = new GridLayout(3, 2);
        panel.setLayout(g);
        this.setContentPane(panel);
        //this.add(panel);//already added panel to top level frame
        JLabel label1 = new JLabel("English");
        JLabel label2 = new JLabel("Ukrainian");
        //panel.add(label1, BorderLayout.WEST);//for BorderLayout
        //panel.add(label2, BorderLayout.AFTER_LAST_LINE);//for BorderLayout
        panel.add(label1);
        panel.add(label2);
        jField1 = new JTextField();
        jField2 = new JTextField();
        //panel.add(jField1, BorderLayout.NORTH);//for BorderLayout
        //panel.add(jField2, BorderLayout.AFTER_LAST_LINE);//for BorderLayout
        panel.add(jField1);
        panel.add(jField2);
        JButton button1 = new JButton("Translate");
        panel.add(button1);
        button1.addActionListener(new EngineTranslate(this));
        JButton button2 = new JButton("Clear");
        panel.add(button2);
        button2.addActionListener(new EngineClear(this));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
