package _module3.les_19_170105._3_1_2_only_teacher;
import java.io.*;
import java.util.Random;

public class OnlyTeacherTest {
    public static void main(String[] args)  throws IOException {
        Person [] people = new Person[new Random().nextInt(5) + 5];
        for (int i = 0; i < people.length-1; i++) {
            people[i]= new Student(chr()+chr()+chr()+chr()+chr());}
        people[people.length-1] = new Teacher("Alex");
        for (Person person : people) {
            if (person instanceof Student){
                ((Teacher)people[people.length-1]).setMark((Student)person,new Random().nextInt(4) + 2);
                System.out.println(person);
            } else System.out.println(person);
        }
        ((Student)people[0]).setMark(5);
        System.out.println(people[0]);

        //------------
        DataOutputStream dsout =
                new DataOutputStream(new FileOutputStream(new File("les_19.txt")));
        dsout.writeInt(Integer.MAX_VALUE);


        DataInputStream ds =
                new DataInputStream(new FileInputStream(new File("les_19.txt")));

        int a  = ds.readInt();

        System.out.println(a);
    }
    static String chr (){
        return Character.toString((char)(new Random().nextInt(24) + 65));
    }
}
