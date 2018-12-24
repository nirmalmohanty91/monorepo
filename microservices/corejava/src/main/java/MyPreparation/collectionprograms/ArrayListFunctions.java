package MyPreparation.collectionprograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListFunctions {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list.isEmpty());
		System.out.println(list.contains(3));
		System.out.println(list.size());
		Object[] array1 = list.toArray();
		Integer[] array = list.toArray(new Integer[list.size()]);
		for (int i : array)
			System.out.print(i + " ");
		for (Object o : array1)
			System.out.print(o + " ");
		System.out.println();
		System.out.println(Collections.binarySearch(list, 3));
		list.remove(2);
		System.out.println(list);
		list.add(2, 10);
		System.out.println(list);
		list.set(2, 3);
		System.out.println(list);
		// list.remove(10); //java.lang.IndexOutOfBoundsException: Index: 10,
		// Size: 3
		ArrayList<String> listString = new ArrayList<>();
		listString.add("Nirmal");
		listString.add("Jason");
		listString.add("Brody");
		System.out.println(listString);
		listString.remove("Brody");
		System.out.println(listString);
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(50);
		list2.add(60);
		list2.add(70);
		list.addAll(1, list2);
		System.out.println(list);
		list.retainAll(list2);
		System.out.println(list);
		ArrayList<Integer> list3 = (ArrayList<Integer>) list.clone();
		list.clear();
		System.out.println(list);
		System.out.println(list3);
		System.out.println(Collections.max(list3));
	}
}
