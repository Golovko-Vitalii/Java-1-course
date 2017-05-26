package _module3.les_31_170124.lambda_intro;

import java.util.function.BiFunction;
import java.util.function.Function;

public class OtherNegative {
    public static void main(String[] args) {
        // length of String
        Function<String, Integer> lenl = s -> s.length();
        System.out.println(lenl.apply("abcd"));
        Function<String, Integer> lenm = String::length;
        System.out.println(lenm.apply("abcd"));
        //Concatenation of String
        BiFunction<String, String, String> concat = (s1, s2) -> s1 + s2;
        Function<String, String> up = s -> {
            if (lenl.apply(s) > 5) return s.toUpperCase();
            else return s;
            // если сделать тернарным то можно свернуть в лямду
        };
        String s = "afsdva";
        //Stream.of(s).filter(p->s.length()>5).toUpperCase();
       /* ifUp = s.stream()
                .map(p ->p.getAge())
                .reduce((i1, i2) -> i1+i2)
                .get()/persons.size();*/
    }
}
