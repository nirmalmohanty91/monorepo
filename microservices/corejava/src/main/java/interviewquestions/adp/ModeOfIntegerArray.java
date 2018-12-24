package interviewquestions.adp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ModeOfIntegerArray {

	public static void main(String[] args) {
		int[] integer = new int[] { 1, 2, 4, 4, 55, 6, 77, 6, 4, 3, 22, 7, 8, 3, 3, 3, 3, 3, 4, 4, 4, 5 };
		Map<Integer, Integer> m = new HashMap<>();
		/*
		 * for (int i = 0; i < integer.length; i++) { int count = 0; for (int j
		 * = 0; j < integer.length; j++) { if (integer[i] == integer[j]) {
		 * count++; } if (count > 1) { m.put(integer[i], count); }
		 * 
		 * }
		 * 
		 * }
		 */

		for (int i : integer) {
			if (m.containsKey(i)) {
				m.put(i, m.get(i) + 1);
			} else {
				m.put(i, 1);
			}
		}

		Set<Integer> keys = m.keySet();
		System.out.println("Keys of map:" + keys);
		Collection<Integer> values = m.values();
		System.out.println("Map values" + values);
		System.out.println(Collections.max(values));

		Integer[] array = keys.toArray((new Integer[keys.size()]));
		Iterator<Integer> itr = keys.iterator();
		ArrayList<Integer> list = new ArrayList<>();
		while (itr.hasNext()) {
			int key = itr.next();
			System.out.println("Max value: " + Collections.max(values) + " Map value: " + key);
			if (Collections.max(values) == m.get(key)) {
				list.add(key);
			}
		}
		System.out.println(m);
		System.out.println(list);
		System.out.println(Collections.min(list));
	}
}
