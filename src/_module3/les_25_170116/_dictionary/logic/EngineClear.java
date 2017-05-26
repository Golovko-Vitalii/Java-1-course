package _module3.les_25_170116._dictionary.logic;

import _module3.les_25_170116._dictionary.gui.DictionaryFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EngineClear implements ActionListener {
    private DictionaryFrame dFrame;

    public EngineClear(DictionaryFrame dFrame) {
        this.dFrame = dFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dFrame.setUkrText("");
        dFrame.setEngText("");

    }
}
