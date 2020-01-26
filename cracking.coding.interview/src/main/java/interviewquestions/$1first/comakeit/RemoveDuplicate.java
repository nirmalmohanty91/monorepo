package interviewquestions.$1first.comakeit;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList<Integer> wordDuplicate = new ArrayList<>();
		wordDuplicate.add(11);
		wordDuplicate.add(12);
		wordDuplicate.add(11);
		wordDuplicate.add(14);
		wordDuplicate.add(16);
		wordDuplicate.add(11);

		System.out.println(wordDuplicate);
		ArrayList<Integer> nonDupList = new ArrayList<>();
		Iterator<Integer> dupIter = wordDuplicate.iterator();
		while (dupIter.hasNext()) {
			Integer dupWord = dupIter.next();
			if (nonDupList.contains(dupWord)) {
				System.out.println("Removed: " + dupWord);
				dupIter.remove();
				System.out.println(wordDuplicate);

			} else {
				System.out.println("Added: " + dupWord);
				nonDupList.add(dupWord); // 11,12,14,16
				System.out.println(nonDupList);
			}

		}
		System.out.println(nonDupList);
	}
}
