package _module3.les_24_170113._3_3_1_gui._awt;

import javax.swing.*;
import java.awt.*;

public class LayoutManagerFrame extends JFrame{
    public LayoutManagerFrame(String nameFrame){
        super (nameFrame);
        this.setSize(700,300);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();
        JPanel jPanel4 = new JPanel();
        JPanel jPanelMain = new JPanel();
        GridLayout gridLayout1 = new GridLayout(0,3);
        jPanel1.setLayout(gridLayout1);//assign layout to panel
        GridLayout gridLayout2 = new GridLayout(3,0);
        jPanel2.setLayout(gridLayout2);//assign layout to panel
        JButton button1 = new JButton("button1");
        JButton button2 = new JButton("button2");
        JButton button3 = new JButton("button3");
        JButton button4 = new JButton("button4");
        JButton button5 = new JButton("button5");
        jPanel1.add(button1);
        jPanel1.add(button2);
        jPanel1.add(button3);// faded
        jPanel2.add(button3);
        jPanel2.add(button4);
        jPanel2.add(button5);
        LayoutManagerFrame layoutManagerFrame = new LayoutManagerFrame("Test LayoutManagerFrame");
        layoutManagerFrame.setContentPane(jPanelMain);//add panel to top level frame
        jPanelMain.setLayout(new GridLayout(2,2));
        jPanelMain.add(jPanel1);
        jPanelMain.add(jPanel2);
        jPanelMain.add(jPanel3);
        jPanelMain.add(jPanel4);
        jPanel3.setLayout(new BorderLayout(5,5));
        jPanel3.add(new JButton("LEFT"),BorderLayout.EAST);
        jPanel3.add(new JButton("RIGHT"),BorderLayout.WEST);
        jPanel3.add(new JButton("TOP"),BorderLayout.NORTH);
        jPanel3.add(new JButton("BUTTOM"),BorderLayout.SOUTH);
        jPanel3.add(new JButton("CENTER"),BorderLayout.CENTER);
        GridBagLayout gbl = new GridBagLayout();
        jPanel4.setLayout(gbl);
        GridBagConstraints constr = new GridBagConstraints();
        constr.gridx = 0;
        constr.gridy = 0;
        constr.gridheight = 1;
        constr.gridwidth = 1;
        constr.fill = constr.BOTH;
        constr.weightx = 1.0;
        constr.weighty = 1.0;
        constr.anchor = constr.CENTER;
        gbl.setConstraints(jPanel4.add(new JButton("x0,y0")),constr);
        constr.gridx = 1;
        constr.gridy = 1;
        constr.gridheight = 1;
        constr.gridwidth = 1;
        gbl.setConstraints(jPanel4.add(new JButton("x1,y1")),constr);
        constr.gridx = 0;
        constr.gridy = 2;
        constr.gridheight = 1;
        constr.gridwidth = 2;
        gbl.setConstraints(jPanel4.add(new JButton("x0,y2 2w")),constr);
        constr.gridx = 2;
        constr.gridy = 3;
        constr.gridheight = 1;
        constr.gridwidth = 1;
        gbl.setConstraints(jPanel4.add(new JButton("x2,y3")),constr);
        constr.gridx = 2;
        constr.gridy = 0;
        constr.gridheight = 3;
        constr.gridwidth = 1;
        gbl.setConstraints(jPanel4.add(new JButton("x2,y0 3h")),constr);
    }
}
