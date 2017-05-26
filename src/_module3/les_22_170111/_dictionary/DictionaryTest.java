package _module3.les_22_170111._dictionary;

public class DictionaryTest {
    public static void main(String[] args) {
        //using not inner classes
        Dictionary dict = new Dictionary();
        dict.addEngUkrWord("fish", "риба");
        System.out.println("dict.translateToUkr(\"fish\") = "+dict.translateToUkr("fish"));
        dict.addUkrEngWord("пес", "dog");
        System.out.println("dict.translateToEng(\"пес\") = "+dict.translateToEng("пес"));
        //using inner class
        Dictionary dictMy = new Dictionary();
        dictMy.engUkrMy.add("cat", "кіт");
        System.out.println("dictMy.engUkrMy.translate(\"cat\") = "+dictMy.engUkrMy.translate("cat"));
        dictMy.ukrEngMy.add("гаманець", "wallet");
        System.out.println("dictMy.ukrEngMy.translate(\"гаманець\") = "+dictMy.ukrEngMy.translate("гаманець"));
    }
}
