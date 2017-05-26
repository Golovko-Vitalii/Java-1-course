package _module3.les_27_170118._circle_square;

import java.io.FileWriter;

public class WriteToFile {
    static synchronized void writeToFile(String fname, String info) {
        try (FileWriter fw = new FileWriter(fname, true)) { // try with resources, topic 3_5_in_out
            fw.write(info + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Future Task//библиотека конкуренции, лок - оболочки для залочивания и разлочивания объектов для потоков
    }
}
