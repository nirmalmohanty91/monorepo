package com.cts.filedemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class FileYo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(new File("C://Users//Prophet//Desktop//Intro.txt")));
		String line = null;
		HashMap<Character, Integer> map = new HashMap<>();

		while ((line = br.readLine()) != null) {
			System.out.println("---Loop----");
			// char[] c = line.toCharArray();
			Character[] charObjectArray = line.replaceAll("\\s", "").toLowerCase().chars().mapToObj(c -> (char) c).toArray(Character[]::new);
			HashSet<Character> set = new HashSet<>(Arrays.asList(charObjectArray));
			List<Character> list = Arrays.asList(charObjectArray);
			for (char l : Arrays.asList(charObjectArray)) {
				System.out.print(l + " ");
			}
			System.out.println();
			System.out.println(set);
			Iterator<Character> itr = set.iterator();
			while (itr.hasNext()) {
				char c = itr.next();
				int i = Collections.frequency(list, c);
				if (!map.containsKey(c))
					map.put(c, i);
				else
					map.replace(c, map.get(c), i + map.get(c));
			}

		}
		System.out.println("--OUTPUT--");
		System.out.println(map);

	}
}
