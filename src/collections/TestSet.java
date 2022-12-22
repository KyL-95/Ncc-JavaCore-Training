package collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TestSet {

   static Set<Integer> set = new HashSet<>();

   List<Integer> list = new LinkedList<>();


    public static void main(String[] args) {
        set.add(2);
        System.out.println("Size : "+ set.size());
        set.add(2);
        System.out.println("Size : "+ set.size());
    }
}
