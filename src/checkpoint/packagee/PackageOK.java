package checkpoint.packagee;


import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class PackageOK {

    public static void main(String[] args) {
        Map<Long, Long> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // n <= 10^5
        for (int i = 1; i <= n ; i++) {
            long ai = sc.nextLong();  // ai, bi <= 10^9
            long bi = sc.nextLong();
            if(!map.containsKey(ai)){
                map.put(ai,bi);     // Put  key=ai & value=bi  into map
            } else{
                long biOLD = map.get(ai); // Get bi of ai from map
                map.put(ai,bi+biOLD); // if ai exists in map, update value of ai:  bi = bi + old-bi
            }
        }

        long m = sc.nextLong(); // m < tổng các bi cộng lại
        Set<Long> aiSet = map.keySet(); // Set of ai'values
        long run = 0;
        for (long ai : aiSet) {
            long bi = map.get(ai);
            if (m <= (run + bi)) {
                System.out.println(ai);
                return;
            }
            run = run + bi;

        }
    }
}
