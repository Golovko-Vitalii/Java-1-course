package _module3.les_25_170116._3_3_2_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstForm {
    private JPanel panel1;
    private JButton Button;
    private JTextField TextField;
    private JLabel jLabel3;

    public FirstForm() {
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = TextField.getText();
                jLabel3.setText(str);


            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}
