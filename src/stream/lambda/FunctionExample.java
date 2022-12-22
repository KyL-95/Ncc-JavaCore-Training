package stream.lambda;

import stream.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FunctionExample {

    static Function<Student,Integer> funStudent = Student::getAge; //  object::instanceMethodName
    static Predicate<Integer> filterAge = i -> i > 10;
    static Predicate<Student> filterSubject = s-> s.getSubjects().size() == 3;
    static List<Student> stList = new ArrayList<>();
    static Integer[] numbers = {1,2,3,4,5};
    static List<Integer> listNum = Arrays.asList(numbers);



    public static void main(String[] args) {
        stList = Arrays.asList(
                new Student("A", true, 18, 5, Arrays.asList("Toan", "Ly", "Hoa")),
                new Student("A", true, 18, 7.5f, Arrays.asList("Van", "Su", "Hoa")),
                new Student("A", false, 15, 8, Arrays.asList("Toan", "Van", "Anh", "Su")),
                new Student("C", false, 12, 9, Arrays.asList("Cong nghe", "Dia ly")),
                new Student("D", true, 10, 3, Arrays.asList("Anh van", "Hoa", "Sinh")),
                new Student("E", true, 10, 2, Arrays.asList("My Thuat", "Am nhac")),
                new Student("F", false, 18, 10, List.of()));
        stList.stream().filter(s-> s.getName().equalsIgnoreCase("a")).forEach(System.out::println);
        System.out.println("----- Student có môn Sinh -----");
        stList.stream().filter(s->s.getSubjects().contains("Sinh")).forEach(System.out::println);
        System.out.println("--------------------");
        stList.stream().filter(filterSubject).forEach(s-> System.out.println(s +": "+ s.getSubjects().toString()));
        int a = listNum.stream().reduce(listNum.get(0),(i1, i2)-> {
            if(i1 < i2 ){
                return i1;
            }
            return i2;
        });
                // {1,2,3,4,5};
//            int a = listNum.stream().reduce((i1,i2) -> i1 * i2).get();

        long b = stList.stream().map(funStudent).filter(age -> age < 18).count();
        long b1 = stList.stream().filter(s -> s.getAge() < 18).count();
        System.out.println("Số học sinh nhỏ hơn 18 tuổi : " + b1);
        System.out.println("Min của lisNum : " + a);
        System.out.println("Max: " + listNum.stream().max(Integer::compareTo).get()); // Type::methodName

        System.out.println("Average: " + (double)a/listNum.size());


    }
    }
