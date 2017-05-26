package _module3.les_22_170111._dictionary;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.List;

public class Dictionary {
    private Map<String, String> engUkr;
    private Map<String, String> ukrEng;
    public EngUkr engUkrMy;
    public UkrEng ukrEngMy;

    public Dictionary() {//constructor
        engUkr = new HashMap<>();
        engUkrMy = new EngUkr();
        ukrEng = new HashMap<>();
        ukrEngMy = new UkrEng();
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "engUkr=" + engUkr +
                '}';
    }

    public void loadFromFile(String filename) {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(filename));
        } catch (IOException e) {
            System.out.println("error read file");
        }
        for (String line : lines) {
            String[] words = line.split(";");//{sun,сонце}
            engUkr.put(words[0], words[1]);
        }
    }

    public void addEngUkrWord(String engWord, String ukrWord) {
        engUkr.put(engWord, ukrWord);
    }

    public void addUkrEngWord(String ukrWord, String engWord) {
        ukrEng.put(ukrWord, engWord);
    }

    public String translateToUkr(String word) {
        String result = "No such word in _dictionary";
        for (Map.Entry<String, String> entry : engUkr.entrySet()) {
            if (entry.getKey().equals(word)) result = entry.getValue();
        }
        return result;
    }

    public String translateToEng(String word) {
        String result = "No such word in _dictionary";
        for (Map.Entry<String, String> entry : ukrEng.entrySet()) {
            if (entry.getKey().equals(word)) result = entry.getValue();
        }
        return result;
    }

    // using inner class
    class EngUkr {
        void add(String engWord, String ukrWord) {
            engUkr.put(engWord, ukrWord);
        }

        public String translate(String word) {
            String result = "No such word in _dictionary";
            for (Map.Entry<String, String> entry : engUkr.entrySet()) {
                if (entry.getKey().equals(word)) result = entry.getValue();
            }
            return result;
        }
    }

    class UkrEng {
        void add(String ukrWord, String engWord) {
            ukrEng.put(ukrWord, engWord);
        }

        public String translate(String word) {
            String result = "No such word in _dictionary";
            for (Map.Entry<String, String> entry : ukrEng.entrySet()) {
                if (entry.getKey().equals(word)) result = entry.getValue();
            }
            return result;
        }
    }
}
