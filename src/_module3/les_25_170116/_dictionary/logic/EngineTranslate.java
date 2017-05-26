package _module3.les_25_170116._dictionary.logic;

import _module3.les_25_170116._dictionary.gui.DictionaryFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EngineTranslate implements ActionListener {
    private DictionaryFrame dFrame;
    private Dictionary dict = Dictionary.getInstance();

    public EngineTranslate(DictionaryFrame dFrame) {
        this.dFrame = dFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String word;
        if (dFrame.getEngText().equals("")) {
            word = dFrame.getUkrText();
            dFrame.setEngText(dict.translateTo(word,"ukr"));
        } else {
            word = dFrame.getEngText();
            dFrame.setUkrText(dict.translateTo(word,"eng"));
        }


    }
}
