package _module2.les_13_161219._2_7_varargs;

import java.util.Arrays;

public class Route {
    private String [] points;

    public Route(String ... p) {
        //this.points = points; // заменит данные в массиве. неправильн!!! нарушает инкапсуляцию!
        this.points = new String[p.length];
        for (int i = 0; i < p.length; i++) {
            this.points[i]=p[i];
        }
    }

    public static void main(String[] args) {
        Route route =  new Route("Kyiv", "Vinnytsya", "Lviv");
        Route route1 =  new Route("Kyiv", "Vinnytsya", "Lviv","Uzhorod");
        System.out.println(route);
        System.out.println(route1);
    }

    @Override
    public String toString() {
        return "Route{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
}
