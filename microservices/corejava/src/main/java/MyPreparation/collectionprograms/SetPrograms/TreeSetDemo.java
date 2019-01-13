package MyPreparation.collectionprograms.SetPrograms;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(80);
		set1.add(70);
		set1.add(60);
		set1.add(50);
		System.out.println(set1);
		HashSet<Integer> set = new HashSet<>();
		set.add(80);
		set.add(70);
		set.add(60);
		set.add(50);
		System.out.println(set);
		TreeSet<Integer> set2 = new TreeSet<>();
		set2.add(80);
		set2.add(70);
		set2.add(60);
		set2.add(50);
		System.out.println(set2);
		Set<Integer> set3 = new TreeSet<>();
		set3.add(80);
		set3.add(70);
		set3.add(60);
		set3.add(50);
		set3.add(50);
		System.out.println(set3);

	}

}
