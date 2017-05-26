package _module2.les_13_161219.tasks_oop.task1_v3;

import java.util.Comparator;

public class ByMark implements Comparator<Abiturient> {

    @Override
    public int compare(Abiturient a1, Abiturient a2) {
        if ((a1.getAverageMark() - a2.getAverageMark()) != 0) {
            if (a1.getAverageMark() - a2.getAverageMark() < 0) return 1; else return -1;
        } else return 0;
    }
}
