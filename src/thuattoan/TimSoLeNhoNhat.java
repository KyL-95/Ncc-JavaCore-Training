package thuattoan;

import java.util.Arrays;
import java.util.List;

public class TimSoLeNhoNhat {
    static Integer arr[] = { 2, 2, 5, 6, 3, 4, 2, 5, 9, 4, 8 };
    static Integer arr2[] = { 2, 4, 6, 8};
    static List<Integer> list = Arrays.asList(arr);
    static int min ;

        public static boolean checkSoLe(List<Integer> list){
            boolean check = false;
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i) % 2 != 0){
                    check = true;
                    break;
                }
            }
            return check;
        }
        public static void findMin(List<Integer> list) {
            if (!checkSoLe(list)) {
                System.out.println("List ko có số lẻ");
            }
            for (int i = 0; i < list.size(); i++ ) {
                // Duyệt mảng nếu là số chẵn thì tiếp tục duyệt
                if(list.get(i) % 2 == 0){
                    continue;
                }
               // Nếu là số lẻ thì min = số đó
                    min = list.get(i);
                // Duyệt mảng từ phần tử tiếp theo của min và so sánh
                for(int j = i + 1; j < list.size(); j++) {
                    if(list.get(j) % 2 != 0 && list.get(j) < min ) {
                        min = list.get(j);
                    }
                }
                // Không cần duyệt thêm vòng for(i) vì đã duyệt qua toàn bộ phần tử của líst rồi
                break;
            }
            System.out.println("Số lẻ nhỏ nhất là " + min);
        }

    public static void main(String[] args) {
        findMin(list);
    }


}
