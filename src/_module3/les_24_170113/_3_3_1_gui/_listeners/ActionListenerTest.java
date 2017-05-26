package _module3.les_24_170113._3_3_1_gui._listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionListenerTest extends JFrame implements ActionListener {

    private JLabel label = new JLabel();

    public ActionListenerTest(String title) {
        super(title);
        this.setSize(200, 200);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flowLayout = new FlowLayout();
        JPanel jPanel = new JPanel();
        jPanel.setLayout(flowLayout);
        this.setContentPane(jPanel);
        JButton button = new JButton("CLICK ME");
        button.addActionListener(this);
        jPanel.add(button);

        jPanel.add(label);//label.setText("");
    }
     public void setLabelText (String text){
        this.label.setText(text);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!((JButton) e.getSource()).getText().equals("CLEAR")) {
            JOptionPane.showConfirmDialog(null,"YOU'VE CLICKED "
                    +  ((JButton) e.getSource()).getClass().getSimpleName(),"Test message",JOptionPane.PLAIN_MESSAGE);
            //label.setText("YOU'VE CLICKED ME!!!");//wrong
            this.setLabelText("YOU'VE CLICKED ME!!!");// ok!
            ((JButton) e.getSource()).setText("CLEAR");
        } else {
            this.setLabelText("");
            ((JButton) e.getSource()).setText("CLICK ME");
        }
    }

    public static void main(String[] args) {
        ActionListenerTest actionListenerTest = new ActionListenerTest("Listener test");
    }
}
