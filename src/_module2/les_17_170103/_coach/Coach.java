package _module2.les_17_170103._coach;

import java.util.Arrays;

public class Coach {
    private CoachType type;
    private int number;
    private boolean[] freePlaces;

    public Coach(CoachType type, int number, boolean[] freePlaces) {
        this.type = type;
        this.number = number;
        this.freePlaces = new boolean[type.getPlacesCount()];
        Arrays.fill(freePlaces,true);
    }



    public Coach(CoachType l, int i) {
    }

    public static void main(String[] args) {
        Coach coach = new Coach(CoachType.K,8);
        Coach coach2 = new Coach(CoachType.K,9);

    }
}
