package _module3.les_29_170120._3_5_in_out;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonOutput {
    public static void main(String[] args) {
        // нельзя использовать для не сериализованных классов,
        // все классы должны быть  implements Serializable или trnsient
        Person p1 = new Person("Tom", 30, new Info());
        try ( // try с ресурсами
              ObjectOutputStream oos = new ObjectOutputStream(
                      new FileOutputStream("les_29_Person.dat"))) {
            oos.writeObject(p1); // "записать" объект в файл


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
