package _module3.les_25_170116._dictionary.logic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    // like singleton
    private static Dictionary instance; // 1 static reference

    public static Dictionary getInstance() {
        return instance;
    }

    static {
        instance = new Dictionary(); // 2 init static reference
    }

    private Map<String, String> engUkr;
    private Map<String, String> ukrEng;


    private Dictionary() {  //constructor // 3 private consruktor

        engUkr = new HashMap<>();
        ukrEng = new HashMap<>();
    }


    /*@Override
    public String toString() {
        return "Dictionary{" +
                "engUkr=" + engUkr +
                //", ukrEng=" + ukrEng +
                '}';
    }*/

    public void loadFromFile(String filename) {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String line : lines) {
            String[] words = line.split(";");//{sun;сонце}
            if (filename.substring(0,6).equals("EngUkr"))
            engUkr.put(words[0], words[1]);
            else ukrEng.put(words[0], words[1]);
        }
    }


    public String translateTo(String word, String toTransl) {
        if (toTransl.equals("eng")){
            if (engUkr.containsKey(word)); else return "NO SUCH WORD IN VOCABULARY!";
        return engUkr.get(word);}
        else {
            if (ukrEng.containsKey(word)); else return "НЕМАЄ СЛОВА В СЛОВНИКУ!";
            return ukrEng.get(word);}

    }

}
