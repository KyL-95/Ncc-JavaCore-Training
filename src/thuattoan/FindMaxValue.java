package thuattoan;

import java.util.Arrays;
import java.util.List;

public class FindMaxValue {

    static Integer arr[] = { 5, 2, 5, 6, 3, 4, 2, 5, 9, 4, 8 };
    static List<Integer> list = Arrays.asList(arr);

    public static int findMax(List<Integer> list) {
        int size = list.size();
        int max = list.get(0);
        for (int i = 1; i < size ; i++) {
            if(max < list.get(i)){
                max = list.get(i);
            }
        }
        return  max;
    }
    public static void main(String[] args) {
            int max = findMax(list);
        System.out.println(max);
        }
    }


