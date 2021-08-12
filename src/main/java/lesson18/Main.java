package lesson18;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Date date = new Date(121, 2, 0);


        LocalDateTime time = LocalDateTime.of(2021, Month.APRIL, 1, 12, 32);

        LocalDateTime transformed = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        transformed.toInstant(ZoneOffset.UTC);
        System.out.println(date.toInstant());
        System.out.println(transformed);
        System.out.println(time);


        List<String> test = new ArrayList<>(Arrays.asList("one"));
        System.out.println(test);
    }
}
