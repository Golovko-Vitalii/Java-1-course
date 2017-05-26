package _module3.les_24_170113._3_3_1_gui._layouts;
import java.awt.*;
import java.util.Random;
import javax.swing.*;

class NullLayoutTest extends JFrame
{
    public NullLayoutTest()
    {
        getContentPane().setLayout(null);
        for(int k=0; k<12; k++) {
            JButton tmp = new JButton(""+k);
            tmp.setBounds(k*10+ new Random().nextInt(50), k*30 + new Random().nextInt(50), 50, 25);
            getContentPane().add(tmp);
        }

        setBounds(100,100,400,300);
    }

    public static void main(String[] args)
    {
        NullLayoutTest flt = new NullLayoutTest();
        flt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flt.setVisible(true);
    }
}
