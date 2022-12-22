package checkpoint.student;

import java.util.*;

public class Student2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n>= 3
        List<Integer> ranks = new ArrayList<>();
        int sizeRank = ranks.size();
        List<Integer> key = new ArrayList<>();
        List<Integer> value = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ranks.add(sc.nextInt()) ;
        }
        System.out.println(ranks.toString());

        for (int i = 0; i < n ; i++) {
            int ranki = ranks.get(i);
            if(!key.contains(ranki)){
                key.add(ranki);
                value.add(1);
            }else {
                int indexOfKey = key.indexOf(ranki);
                int valueOf = value.get(indexOfKey);
                valueOf++;
                value.set(indexOfKey,valueOf);
            }
        }
        System.out.println("Key: " + key);
        System.out.println("Value: " + value);
        // Xuất hiện n lần -> có n(n-1)/ 2 cặp trùng nhau
            int sum = 0;
        for (int i = 0; i < value.size() ; i++) {
            int valuei = value.get(i) ;
            sum = sum + (valuei * (valuei - 1))/2;
        }
            sum ++;
        for (Integer rank : ranks) {
            for (int j = 0; j < value.size(); j++) {
                if (rank == key.get(j)) {
                    System.out.println(sum - value.get(j));
                }
            }
        }

    }
}
