package _module2.les_13_161219.tasks_oop.task1_v3;

import java.util.Arrays;

public class Abiturient {
    private int id, phone; int [] mark;
    private String surname, firstname, patronymic, addres;

    public Abiturient(int id, int phone, int [] mark, String surname, String firstname, String patronymic, String addres) {
        this.id = id;
        this.phone = phone;
        this.mark = new int[mark.length];
        System.arraycopy(mark,0,this.mark,0,mark.length);
        this.surname = surname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.addres = addres;
    }

    public Abiturient(Abiturient that) {
        this.id = that.id;
        this.phone = that.phone;
        this.mark = new int[that.mark.length];
        System.arraycopy(that.mark,0,this.mark,0,that.mark.length);
        this.surname = that.surname;
        this.firstname = that.firstname;
        this.patronymic = that.patronymic;
        this.addres = that.addres;
    }

    public int [] getMark() {
        int [] newMark = new int[this.mark.length];
        System.arraycopy(this.mark,0,newMark,0,this.mark.length);
        return newMark;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public float getAverageMark (){
        float averMark=0;
        for (int i : this.getMark()) {
            averMark+=i;
        }
        return averMark/this.getMark().length;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", phone=" + phone +
                ", Средний балл=" + String.format("%1$.1f",this.getAverageMark()) +
                ", mark=" + Arrays.toString(mark) +
                ", surname='" + surname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", addres='" + addres + '\'' +
                '}';
    }
}
