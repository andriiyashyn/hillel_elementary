package lesson6;

import lesson5.Client;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final String USER_STATUS_INFO = "User with id=%s has status %s";

    public static void main(String[] args) {
//        Client client1 = new Client("name", "surname");
//        Client client2 = new Client("name", "surname");
//
//        Map<Client, String> map = new HashMap<>();
//
//        map.put(client1, "test");
//        System.out.println(map);
//        System.out.println(map.get(client2));
//
//        client1.setName("name1");
//        System.out.println(map.get(client2));
//
//        String test = "test";
//        System.out.println(test.replace('t', 'm'));
//        System.out.println(test);

//        System.out.printf(USER_STATUS_INFO, fdwfssf(), "active");
//        System.out.printf(USER_STATUS_INFO, 1231, "active");

        Pattern pattern = Pattern.compile("\\d\\w\\d\\w]");
        Matcher matcher = pattern.matcher("1w2W");

        System.out.println(matcher.find());

//        System.out.println(matcher.find());
//        System.out.println(matcher.find());
//        System.out.println(matcher.find());
//        System.out.println(matcher.find());
//        System.out.println(matcher.find());

        System.out.println("test");
        System.out.println("test");
    }

//    public static Number fdwfssf() {
//        return 1;
//    }
}
