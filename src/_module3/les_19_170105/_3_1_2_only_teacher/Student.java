package _module3.les_19_170105._3_1_2_only_teacher;

public class Student extends Person {
    private int mark;

    public Student(String name) {
        super(name);
    }

    public void setMark(int mark) {
        String callerName;
        try {
            throw new Exception();
        } catch (Exception e) {
            StackTraceElement[] elems = e.getStackTrace();
            callerName=elems[1].getClassName();
            System.out.println(callerName);
        }
        if (callerName.substring(callerName.lastIndexOf(".")+1).equals("Teacher"))
        this.mark = mark;
        else {System.out.println("YOU ARE NOT TEACHER!!!");}

    }

    @Override
    public String toString() {
        return "Student{" +
                "mark=" + mark +
                "} " + super.toString();
    }
}
