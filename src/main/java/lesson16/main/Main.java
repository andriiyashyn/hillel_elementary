package lesson16.main;

import lesson16.intr.MyFunctIntr;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//        TestInterface testInterface = new TestInterfaceImpl();

//        testInterface.run();

//        String result = calculate().orElse("result");
//        System.out.println(result.toCharArray());

//        Optional<String> result2 = calculate();

//        if (result2.isPresent()) {
//            System.out.println(result2.get());
//        }

//        result2.ifPresent(System.out::println);



//        String result1 = calculateWithoutOptional();
//        if (result1 != null)
//            System.out.println(result1.toCharArray());
//        else
//            System.out.println("result".toCharArray());

//        MyFunctIntr myFunctIntr = new MyFunctIntr() {
//            @Override
//            public int run(String first, String second) {
//                System.out.println(first + second);
//                return first.length() + second.length();
//            }
//        };
//
//        MyFunctIntr myFunctIntrWithLambda = (a, b) -> concat(a,b);
//
//        System.out.println(myFunctIntr.run("asdas", "asdasd"));
//        myFunctIntrWithLambda.run("asdas", "asdasd");
//
//        Predicate<List> predicate = (first) -> first.isEmpty();
//
//        predicate.test(new ArrayList());


    }

    private static int concat(String first, String second) {
        System.out.println(first + second);
        return first.length() + second.length();
    }


    public static Optional<String> calculate() {
        return null;
    }

    public static Optional<String> calculate(Optional<String> myString) {
       String result = calculateWithoutOptional();
       return Optional.of(null);
    }

    public static String calculateWithoutOptional() {
        return null;
    }
}
