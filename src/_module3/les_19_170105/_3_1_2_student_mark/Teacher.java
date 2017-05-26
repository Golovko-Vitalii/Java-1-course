package _module3.les_19_170105._3_1_2_student_mark;

public class Teacher extends Person{

    public Teacher(String name) {
        super(name);
    }
    public void setMark (Student s, int m){
        try {
            s.setMark(m);
        } catch (BadMarkException badMarkException) {
            System.out.println(badMarkException.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Teacher{} " + super.toString();
    }
}
