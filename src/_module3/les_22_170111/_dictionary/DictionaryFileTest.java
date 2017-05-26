package _module3.les_22_170111._dictionary;

public class DictionaryFileTest {
    public static void main(String[] args) {
        Dictionary dict = new Dictionary();

        dict.loadFromFile("EngUkr.txt");
        System.out.println(dict.translateToUkr("cat"));
        System.out.println(dict.translateToUkr("sun"));
    }
}
