package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("A", true, 18, 5, Arrays.asList("Toan", "Ly", "Hoa")),
                new Student("A", true, 18, 5, Arrays.asList("Van", "Su", "Hoa")),
                new Student("A", false, 15, 8, Arrays.asList("Toan", "Van", "Anh", "Su")),
                new Student("C", false, 12, 9, Arrays.asList("Cong nghe", "Dia ly")),
                new Student("D", true, 10, 3, Arrays.asList("Anh van", "Hoa", "Sinh")),
                new Student("E", true, 10, 2, Arrays.asList("My Thuat", "Am nhac")),
                new Student("F", false, 18, 10, Arrays.asList()));

        // Học sinh giới tính nữ : dùng filter
        Stream<Student> sts = students.stream().filter(s -> !s.isMale());

        List<Student> list = students.stream().filter(s -> !s.isMale()).collect(Collectors.toList());

        System.out.println("----Các học sinh nữ ----");

        sts.forEach(s -> System.out.println(s));

        // sắp xếp tăng/giảm dần theo số tuổi : dùng filter -> sort
        System.out.println("-----------Cách 1 : giảm dần-----------");
        students.stream().filter(s -> !s.isMale()).sorted((s1, s2) -> {
            return -(s1.getAge() - s2.getAge());
        }).forEach(System.out::println);

        System.out.println("-----------Cách 2 : tăng dần-----------");
        students.stream().filter(s -> !s.isMale()).sorted(Comparator.comparingInt(Student::getAge))
                .forEach(s -> System.out.println(s));

        // Số học sinh điểm trung bình trên 7 :x
        System.out.print("----Số học sinh điểm trung bình trên 7 : ");
        long count = students.stream().filter(s -> s.getScore() > 7).count();
        System.out.println(count + " học sinh ");

        // Điểm số cao nhất trong lớp
        // List các điểm số trong lớp : dùng map , trả về một List<Float>
        System.out.println("List các điểm số trong lớp ");
        List<Float> listScore = students.stream().map(s -> s.getScore()).collect(Collectors.toList());
        System.out.println(listScore.toString());

        System.out.print("Điểm số cao nhất trong lớp : ");
        System.out.println(Collections.max(listScore));
        // List các môn học : phải dùng flatmap , vì nếu dùng map sẽ trả về một List <String[]>

        Set<String> setSubjects = students.stream().flatMap(s -> s.getSubjects().stream()).collect(Collectors.toSet());
        // Lấy ra sinh viên điểm cao nhất
        System.out.println("Lấy ra sinh viên điểm cao nhất trong lớp : ");
        // Sắp xếp danh sách sinh viên theo điểm giảm dần và lấy ra sv đầu tiên trong đó
        Student st = students.stream().sorted((s1,s2) -> {
            return (int) -(s1.getScore() - s2.getScore());
        }).collect(Collectors.toList()).get(0);

        System.out.println(st);
        System.out.println("-------------");

        // Lấy ra sinh viên đầu bảng chữ cái

        Student stt = students.stream().min((s1,s2) -> {
            return s1.getName().compareTo(s2.getName());
        }).get();
        System.out.println(stt);
        System.out.println("-------------");
        // Đếm số học sinh tên A
        System.out.println("Số học sinh tên A");
        System.out.println( students.stream().filter(s -> s.getName().equals("A")).count()
        );
        // Đếm số học sinh trên 7d
        System.out.println("Số học sinh trên 7d");
        long c = students.stream().filter(s -> s.getScore() > 7).count();
        System.out.println(c);



    }
}
