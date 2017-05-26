package _module3.les_25_170116._dictionary.test;

import _module3.les_25_170116._dictionary.gui.DictionaryFrame;
import _module3.les_25_170116._dictionary.logic.Dictionary;

public class Test {
    public static void main(String[] args) {
        Dictionary dict = Dictionary.getInstance();

        dict.loadFromFile("EngUkr.txt");
        dict.loadFromFile("UkrEng.txt");

        DictionaryFrame dFrame = new DictionaryFrame("Slovnyk))");
        dFrame.setVisible(true);

    }
}
