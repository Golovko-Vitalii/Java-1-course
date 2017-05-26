package _module3.les_19_170105._3_1_2_student_mark;

public class Student extends Person {
    private int mark;

    public Student(String name) {
        super(name);
    }

    public void setMark(int mark)  throws BadMarkException {
        this.mark = mark;
        if (this.mark == 2) throw new BadMarkException(this.mark,super.toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "mark=" + this.mark +
                "} " + super.toString();
    }
}
