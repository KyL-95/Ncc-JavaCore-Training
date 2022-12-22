package checkpoint.packagee;

import java.util.*;

public class PackageClone2 {
    public static int inputInt(Scanner sc){
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            int ai = inputInt(sc);
            int bi = inputInt(sc);
            if(!map.containsKey(ai)){
                map.put(ai,bi);
            } else{
                int count = map.get(ai);
                map.put(ai,bi+count);
            }
        }

        int m = inputInt(sc);
//        System.out.println(map.toString());

        Set<Integer> aiSet = map.keySet();
        List<Integer> aiList = new ArrayList<>(aiSet);

//        System.out.println(aiList.toString());
//        System.out.println("--------");
        int run = 0;
        for (int i = 0; i < aiList.size(); i++) {
            int ai = aiList.get(i);
            int bi =  map.get(ai);
            if( m <=(run + bi))   {
                System.out.println(ai);
                return;
            } run = run + bi;

        }

    }
}
