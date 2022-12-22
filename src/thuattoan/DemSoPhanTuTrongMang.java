package thuattoan;

import java.util.*;

public class DemSoPhanTuTrongMang {
	static Integer arr[] = { 5, 3, 5, 6, 3, 4, 2, 5, 9, 9, 8 };
	static List<Integer> list = Arrays.asList(arr);
	public static Map<Integer, Integer> count(List<Integer> list) {
		// Khai báo 1 map để lưu phần tử của list(key) và số lần xuất hiện (value
		Map<Integer, Integer> mapCount = new HashMap<>();

		int size = list.size();
		int count = 1;
		// Dùng 2 vòng for duyệt để so sánh từng phần tử với các phần tử khác
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if(i == j){
					// Nếu phần tử so sánh với chính nó thì quay lại vòng lặp
					continue;
				}
				if (list.get(i) == list.get(j)) {
					count++;
				}
				mapCount.put(list.get(i), count);
			}
			count = 1;
		}
		return mapCount;
	}

	public static Map<Integer, Integer> count2(List<Integer> list){
		Map<Integer, Integer> resultMap = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			int element = list.get(i);
			if(!resultMap.containsKey(element)){
				resultMap.put(element,1);
			}else{
				int count = resultMap.get(element);
				count ++;
				resultMap.put(element,count);
			}
		}
		return resultMap;
	}



	public static void main(String[] args) {
		Map<Integer, Integer> mapCount = count2(list);
		System.out.println(mapCount);

		Set<Map.Entry<Integer, Integer>> entry = mapCount.entrySet();
		for (Map.Entry<Integer, Integer> ent : entry) {
			System.out.println("Số lần xuất hiện " + ent.getKey() +": " + ent.getValue());
		}

	}

}
