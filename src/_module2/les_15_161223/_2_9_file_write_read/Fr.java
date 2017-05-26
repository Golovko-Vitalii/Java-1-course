package _module2.les_15_161223._2_9_file_write_read;

import java.io.*;

public class Fr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("les_15.txt");
        BufferedReader fin = null;
        // ctlr+alt+T = surround
        try {
            fin = new BufferedReader(new FileReader(f));
            String name;
            String line;
            System.out.println("Print file"+f.getName()+"? y/n");
            name = br.readLine();
            if (name.equals("y"))
                while ((line = fin.readLine())!=null) System.out.println(line);
        } catch (FileNotFoundException e) {
            System.out.println("no file "+ f.getName());
        }
    }
}
