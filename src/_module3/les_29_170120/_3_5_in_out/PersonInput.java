package _module3.les_29_170120._3_5_in_out;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PersonInput {
    public static void main(String[] args) {
        Person p1 = null;
        try ( // try с ресурсами
              ObjectInputStream ois = new ObjectInputStream(
                      new FileInputStream("les_29_Person.dat"))) {
            p1 = (Person) ois.readObject(); // "считать" объект из файла
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(p1);
    }
}
