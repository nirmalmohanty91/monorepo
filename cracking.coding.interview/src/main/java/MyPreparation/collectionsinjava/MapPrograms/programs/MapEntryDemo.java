package MyPreparation.collectionsinjava.MapPrograms.programs;

import java.util.HashMap;

public class MapEntryDemo {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 2);
		map.put(3, 4);
		map.put(3, 5);
		System.out.println(map);

	}

}
