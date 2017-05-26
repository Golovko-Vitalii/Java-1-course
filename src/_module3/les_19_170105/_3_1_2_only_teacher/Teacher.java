package _module3.les_19_170105._3_1_2_only_teacher;

public class Teacher extends Person {

    public Teacher(String name) {
        super(name);
    }
    public void setMark (Student s, int m){
            s.setMark(m);
    }

    @Override
    public String toString() {
        return "Teacher{} " + super.toString();
    }
}
