package _module3.les_21_170110._3_2_2_set_map;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    static Map<String, String> dict = new HashMap<>();

    public static void main(String[] args) {
        addWord("cat", "кіт");
        System.out.println(translate("cat"));
        System.out.println(translate("cap"));
    }

    static Map<String, String> addWord(String eng, String ukr) {
        dict.put(eng, ukr);
        return dict;
    }

    static String translate(String eng) {
        for (Map.Entry<String, String> entry : dict.entrySet()) {
            if (entry.getKey().equals(eng)) return eng + " = " + entry.getValue();
        }
        return "NO SUCH WORD \"" + eng + "\" IN DICTIONARY";
    }
}
