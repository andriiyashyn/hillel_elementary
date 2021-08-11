package lesson17.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        Function<String, Integer> function = (str) -> Integer.parseInt(str);
//        Function<String, Integer> functionMR = Integer::parseInt;
//
//        Integer integerResult = function.apply("4");
//        Integer integerResultMR = functionMR.apply("4");
//        System.out.println(integerResult);
//        System.out.println(integerResultMR);
//
//        Supplier<String> supplier = () -> integerResult.toString();
//        Supplier<String> supplierMR = integerResult::toString;
//
//        Function<String, String> stringFunction = (str) -> str.toUpperCase();
//        Function<String, String> stringFunctionMR = String::toUpperCase;
//
//        System.out.println(stringFunction.apply("asdasdS"));
//        System.out.println(stringFunctionMR.apply("asdasdS"));


        List<String> collection = Arrays.asList("1", "2", "3", "4");
        System.out.println("Collection: " + collection);

//        List<String> collectionFilterOld = new ArrayList<>();
//        for (String elem: collection) {
//            if (elem.length() == 5) {
//                collectionFilterOld.add(elem);
//            }
//        }
//        System.out.println("Before Java8: " + collectionFilterOld);
//
//        List<String> collectionFilter = collection.stream()
//                .filter((elem) -> elem.length() == 5)
//                .collect(Collectors.toList());
//        System.out.println("After Java8: " + collectionFilter);

//        System.out.println(collection
//                .stream().skip(collection.size() - 1)
//                .findFirst().orElse("1"));

//        List<String> unique = collection.stream().distinct().collect(Collectors.toList());
//        System.out.println(unique);

//        List<Integer> numbers = collection.stream()
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());
//        System.out.println(numbers);


        System.out.println(collection.stream()
                .map(Integer::parseInt)
                .anyMatch((elem) -> elem.equals(3))
        );

        System.out.println(collection.stream()
                .map(Integer::parseInt)
                .noneMatch((elem) -> elem.equals(6))
        );

        System.out.println(collection.stream()
                .map(Integer::parseInt)
                .allMatch((elem) -> elem.equals(6))
        );






    }
}
