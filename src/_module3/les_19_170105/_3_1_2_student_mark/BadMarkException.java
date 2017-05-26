package _module3.les_19_170105._3_1_2_student_mark;

public class BadMarkException extends Exception {
    private int mark;
    private String name;

    public BadMarkException(int mark, String name) {
        this.mark = mark;
        this.name = name;
    }

    @Override
    public String getMessage() {
        return
                "Student "+this.name+" take BAD mark! = "+this.mark+ " ... ";
    }
}
