package _module2.les_13_161219.tasks_oop.task1_v3;

import java.util.*;

public class Abiturients {

    private ArrayList<Abiturient> abiturients;

    public Abiturients() {
        abiturients = new ArrayList<>();
    }

    public void add(Abiturient abiturient) {
        abiturients.add(new Abiturient(abiturient));
    }

    public String delete(int id) {
        for (int i = 0; i < abiturients.size(); i++) {
            if (abiturients.get(i).getId()==id){
                abiturients.remove(i);
                return "Abiturient with ID = " + id + " was deleted!!!";
            }
        }
            return "There isn't an abiturient with ID = " + id + " !!!";
    }

    public Abiturients getNegativeMark() {
        Abiturients tmp = new Abiturients();
        for (Abiturient abiturient : abiturients) {
            for (int i = 0; i <abiturient.getMark().length ; i++) {
                if (abiturient.getMark()[i]<3) {
                    tmp.add(new Abiturient(abiturient));
                    break;
                }
            }

        }
        return tmp;
    }

    public Abiturients getWithBiggerThenMark(float m) {
        Abiturients tmp = new Abiturients();
        for (Abiturient abiturient : abiturients) {
                if (abiturient.getAverageMark()>m) tmp.add(new Abiturient(abiturient));
        }
        tmp.abiturients.sort(new ByMark());
        return tmp;
    }
    public Abiturients getWithHalfSummMark() {
        Abiturients tmp = new Abiturients();
        for (Abiturient abiturient : abiturients) {
            if (abiturient.getAverageMark()>=this.getHalfSummMarks()) tmp.add(new Abiturient(abiturient));
        }
        tmp.abiturients.sort(new ByMark());
        return tmp;
    }
    public float getHalfSummMarks (){
        float hsm = 0;
        for (Abiturient abiturient : abiturients) {
            hsm+=abiturient.getAverageMark();
        }
        return hsm/abiturients.size();
    }
    public Abiturient findByName(String s){
        for (Abiturient abiturient : abiturients) {
            if (abiturient.getFirstname().equals(s)||abiturient.getSurname().equals(s)||abiturient.getPatronymic().equals(s))
                return abiturient;
        }
        return null;
    }

    public Abiturient findById(int id){
        for (Abiturient abiturient : abiturients) {
            if (abiturient.getId()==id) return abiturient;
        }
        return null;
    }

    public void sortByAverageMark(){
        abiturients.sort(new ByMark());
    }

    public void print() {
        System.out.println("------INFO-BEGIN-----");
        for (Abiturient abiturient : abiturients) {
            System.out.println(abiturient);
        }
        System.out.println("------INFO-END-----");
    }
    public void print(int n) {
        System.out.println("------INFO-BEGIN-----");
        for (Abiturient abiturient : abiturients) {
            if (n<1)break;n--;
            System.out.println(abiturient);
        }
        System.out.println("------INFO-END-----");
    }
}
