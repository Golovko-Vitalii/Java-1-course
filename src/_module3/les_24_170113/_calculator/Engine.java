package _module3.les_24_170113._calculator;

import javax.swing.*;
import java.awt.event.*;

public class Engine implements ActionListener, KeyListener {
    private JTextField xField;
    private JTextField yField;
    private JTextField zField;

    public Engine(JTextField xField, JTextField yField, JTextField zField) {
        this.xField = xField;
        this.yField = yField;
        this.zField = zField;
    }

    @Override//метод вызовется при нажатии на кнопку
    public void actionPerformed(ActionEvent e) {// на вход подается кнопка button
        //String oper=((JButton)e.getSource()).getText();
        String oper = ((JButton) e.getSource()).getName();
        System.out.println(oper);//выдаст имя кнопки, для отладки
        //double x,y= 0;   //   если внизу  нужно 0 присваивать
        double x, y;          //  внутри try 0 не нужно
        JTextField errorField = null;
        try {
            errorField = xField;
            x = Double.parseDouble(xField.getText());
            errorField = yField;
            y = Double.parseDouble(yField.getText());
            //if("Add".equals(oper)){  //!!!!
            //if("+".equals(oper)){  //!!!!
            if (oper.equals(SimpleCalculator.BUTTON_PLUS))//не будет исключения, т.к. если второй будет null, первый уже не null
                zField.setText(x + y + "");//преобразует в строку, работает для всех примитивов
            //""- преобразовать в строку, только в конце!!! x+""+y даст 22 при х=2, у=2
            if (oper.equals(SimpleCalculator.BUTTON_MINUS)) zField.setText(x - y + "");
            if (oper.equals(SimpleCalculator.BUTTON_MULT)) zField.setText(x * y + "");
            if (oper.equals(SimpleCalculator.BUTTON_DIV)) zField.setText(x / y + "");

        } catch (NumberFormatException e1) {
            //e1.printStackTrace();
            JOptionPane.showConfirmDialog(null,
                    "Error in number typed! " + errorField.getText(), "Error!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            JOptionPane.showConfirmDialog(null,
                    "Illegal button", "!!!", JOptionPane.PLAIN_MESSAGE);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
        /*MyStack stack = new MyStack();
        рецепт универсального слушателя, статья для чтения на дом
        habrahabr.ru/post/120643/
        */
}
