package MyPreparation.Others.testpack;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		Map<Integer, String> map1 = new HashMap<>();

		map.put(3, "qwq");
		map.put(1, "eww");
		map.put(2, "ere");
		System.out.println(map);
		Set<Integer> s = map.keySet();
		TreeSet<Integer> s1 = new TreeSet(s);

		System.out.println(s);

		for (Integer i : s1) {
			map1.put(i, map.get(i));
		}

		System.out.println(map1);

	}
}