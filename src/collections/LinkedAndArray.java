package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedAndArray {
    static List<Double> array = new ArrayList<>();
    static List<Double> linked = new LinkedList<>();

    static List<Double> arr = new ArrayList<>();


    public static void main(String[] args) {
        for (int i = 0; i < 100000 ; i++) {
            arr.add( (Math.random() * 5000));
        }

        System.out.println("----- Add All -------");
        long startTime = System.nanoTime();
            array.addAll( arr);
        long endTime = System.nanoTime();
        System.out.println("ArrayList : " + (endTime - startTime));

        startTime = System.nanoTime();
            linked.addAll(arr);
        endTime = System.nanoTime();
        System.out.println("LinkedList : " + (endTime - startTime));

        System.out.println("----- Get -------");
        startTime = System.nanoTime();
        array.get(50000);
        endTime = System.nanoTime();
        System.out.println("ArrayList : " + (endTime - startTime));

        startTime = System.nanoTime();
        linked.get(50000);
        endTime = System.nanoTime();
        System.out.println("LinkedList : " + (endTime - startTime));

        System.out.println("----- REMOVE -------");

        startTime = System.nanoTime();
        array.remove(array.get(40000));
//        array.remove(40000);
        endTime = System.nanoTime();
        System.out.println("ArrayList : " + (endTime - startTime));

        startTime = System.nanoTime();
        linked.remove(array.get(40000));
//        linked.remove(40000);
        endTime = System.nanoTime();
        System.out.println("LinkedList : " + (endTime - startTime));


        System.out.println("----- ADD ElEMENT -------");
        startTime = System.nanoTime();
        array.add(10000,9d);
        endTime = System.nanoTime();
        System.out.println("ArrayList : " + (endTime - startTime));

        startTime = System.nanoTime();
        linked.add(10000,9d);
        endTime = System.nanoTime();
        System.out.println("LinkedList : " + (endTime - startTime));
    }


}
