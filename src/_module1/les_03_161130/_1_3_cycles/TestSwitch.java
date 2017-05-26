package _module1.les_03_161130._1_3_cycles;

import java.util.Scanner;

public class TestSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Month = ");
        int month = scanner.nextInt();
        String season;
        switch (month){
            case 12: case 1: case 2:
                season = "Winter"; break;
            case 3: case 4: case 5:
                season = "Spring"; break;
            case 6: case 7: case 8:
                season = "Summer"; break;
            case 9: case 10: case 11:
                season = "Autumn"; break;
            default: season = "No such season";
        }
        System.out.println("season = " + season);
    }
}
