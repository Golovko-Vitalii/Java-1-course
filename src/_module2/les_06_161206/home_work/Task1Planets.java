package _module2.les_06_161206.home_work;

import java.util.Scanner;

/*Написать метод который принимает строку с названием планеты.
 Возвращает: сколько длится год на этой планете
 (в единицах измерения – земные сутки).*/

public class Task1Planets {
    public static void main(String[] args) {
        println("Write name of one planet from" + "\n" +
                "Mercury, Venus, Earth, Mars, Jupiter," + "\n" +
                " Saturn, Uranus, Neptune, Pluto");
        String s = inputStr();
        int days = daysEarthOrbitPlanets(s);
        println("One orbit years on the " + s + " = " + days + " Earth days");
    }

    static String inputStr() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    static void println(String s) {
        System.out.println(s);
    }

    static int daysEarthOrbitPlanets(String s) {
        switch (s) {
            case "Mercury":
                return 88;
            case "Venus":
                return 225;
            case "Earth":
                return 365;
            case "Mars":
                return 687;
            case "Jupiter":
                return 4343;
            case "Saturn":
                return 10768;
            case "Uranus":
                return 30660;
            case "Neptune":
                return 60225;
            case "Pluto":
                return 90520;
            default: {
                println("Wrong name of planet!");
                return Integer.MIN_VALUE;
            }

        }
    }
}