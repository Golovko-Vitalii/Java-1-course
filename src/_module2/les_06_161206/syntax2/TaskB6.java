package _module2.les_06_161206.syntax2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Дано n различных натуральных чисел.
 * Напечатать все перестановки этихчисел.
 */
public class TaskB6 {
    public static void main(String[] args) throws Exception {

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,2,3};

        System.out.println("for: " + Arrays.toString(arr1));
        System.out.println("simple: " + ordersAsStrings(arr1));
        System.out.println("filter: " + filteredOrders(arr1));

        System.out.println();

        System.out.println("for: " + Arrays.toString(arr2));
        System.out.println("simple: " + ordersAsStrings(arr2));
        System.out.println("filter: " + filteredOrders(arr2));
    }

    public static Set<String> filteredOrders(int[] arr) {

        Set<String> s = new HashSet<String>();
        for (StringBuilder sb : orders(arr)) {

            s.add(sb.toString());
        }
        return s;
    }

    public static List<String> ordersAsStrings(int[] arr) {

        List<String> l = new ArrayList<String>();
        for (StringBuilder sb : orders(arr)) {

            l.add(sb.toString());
        }
        return l;
    }

    public static List<StringBuilder> orders(int[] arr) {

        if (arr.length == 2) {

            StringBuilder sb1 = new StringBuilder();
            sb1.append(arr[0]);
            sb1.append(arr[1]);

            StringBuilder sb2 = new StringBuilder();
            sb2.append(arr[1]);
            sb2.append(arr[0]);

            return Arrays.asList(sb1, sb2);
        }
        else {

            List<StringBuilder> l = new ArrayList<StringBuilder>();
            for (int i = 0; i < arr.length; i++) {

                for (StringBuilder sb : orders(excludingCopy(arr, i))) {

                    l.add(sb.insert(0, arr[i]));
                }
            }
            return l;
        }
    }

    private static int[] excludingCopy(int[] arr, int idx) {

        int[] result = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != idx) {
                result[j++] = arr[i];
            }
        }
        return result;
    }


}