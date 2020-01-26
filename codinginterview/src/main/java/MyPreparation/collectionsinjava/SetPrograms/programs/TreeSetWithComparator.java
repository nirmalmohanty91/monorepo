package MyPreparation.collectionsinjava.SetPrograms.programs;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetWithComparator {

	public static void main(String[] args) {
		// Instantiating MyComparator
		IdComparator comparator = new IdComparator();
		NameComparator nameComparator = new NameComparator();
		// Creating TreeSet with 'MyComparator' as Comparator.
		TreeSet<Student1> set = new TreeSet<Student1>(nameComparator);
		set.add(new Student1(121, "Santosh", 85));

		set.add(new Student1(231, "Cherry", 71));

		set.add(new Student1(417, "David", 82));

		set.add(new Student1(562, "Praveen", 91));

		set.add(new Student1(231, "Raj", 61)); // Duplicate element

		set.add(new Student1(458, "John", 76));

		set.add(new Student1(874, "Peter", 83));

		set.add(new Student1(231, "Hari", 52)); // Duplicate element

		set.add(new Student1(568, "Daniel", 89));
		Iterator<Student1> it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

class Student1 {
	private int id;

	public int getId() {
		return id;
	}

	String name;

	public String getName() {
		return name;
	}

	int perc_of_mark_obtained;

	public Student1(int id, String name, int perc_of_mark_obtained) {
		this.id = id;
		this.name = name;
		this.perc_of_mark_obtained = perc_of_mark_obtained;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + perc_of_mark_obtained;
	}

}

class IdComparator implements Comparator<Student1> {

	@Override
	public int compare(Student1 s1, Student1 s2) {
		int studentId1 = s1.getId();
		int studentId2 = s2.getId();

		// negative integer : first argument is less than second
		// Zero : first argument is equal to second
		// positive integer : first argument is greater that second
		// ascending order
		// return studentId1 - studentId2;
		// descending order
		return studentId2 - studentId1;

	}

}

class NameComparator implements Comparator<Student1> {

	@Override
	public int compare(Student1 s1, Student1 s2) {
		String studentId1 = s1.getName();
		String studentId2 = s2.getName();

		// negative integer : first argument is less than second
		// Zero : first argument is equal to second
		// positive integer : first argument is greater that second
		// ascending order
		return studentId1.compareTo(studentId2);
		// descending order
		// return studentId2.compareTo(studentId1);
	}

}
