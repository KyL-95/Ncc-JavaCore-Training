package stream.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateExample {
    static List<String> words = Arrays.asList("Jav","HIHI","Ja","Java khó vl");
    static List<Integer> numbers = new ArrayList<>();

    static Predicate<String> filterString = s -> s.equals("HIHI");
    static Predicate<Integer> filterInt = i -> i > 5;
    static Predicate<Integer> fill = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            return false;
        }
    };
    static Consumer<String> consumerStr = i -> System.out.print("Hello " + i);


    public static void main(String[] args) {
        System.out.println(filterInt.test(4));
        System.out.println(words.toString());
        System.out.println("----------------");
        words.stream().filter(filterString.negate()).forEach(System.out::println);
        System.out.println("----------------");
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.add(9);
        numbers.add(13);
        System.out.println("Numbers : " + numbers.toString());
        numbers.removeIf(filterInt);
        System.out.println("Numbers after remove: " + numbers.toString());
        consumerStr.accept("Khánh");
    }
}
