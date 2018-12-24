package MyPreparation.collectionprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListWithComparator {

	public static void main(String[] args) {
		ArrayList<Student2> arraylist = new ArrayList<Student2>();
		arraylist.add(new Student2(101, "Zues", 26));
		arraylist.add(new Student2(505, "Abey", 24));
		arraylist.add(new Student2(809, "Vignesh", 32));

		/* Sorting based on Student Name */
		System.out.println("Student Name Sorting:");
		Collections.sort(arraylist, Student2.StuNameComparator);

		for (Student2 str : arraylist) {
			System.out.println(str);
		}

		/* Sorting on Rollno property */
		System.out.println("RollNum Sorting:");
		Collections.sort(arraylist, Student2.StuRollno);
		for (Student2 str : arraylist) {
			System.out.println(str);
		}
	}
}

class Student2 {
	private String studentname;
	private int rollno;
	private int studentage;

	public Student2(int rollno, String studentname, int studentage) {
		this.rollno = rollno;
		this.studentname = studentname;
		this.studentage = studentage;
	}

	// Getter and setter methods same as the above examples

	public int getRollno() {
		return rollno;
	}

	public String getStudentname() {
		return studentname;
	}

	/* Comparator for sorting the list by Student Name */
	public static Comparator<Student2> StuNameComparator = new Comparator<Student2>() {
		@Override
		public int compare(Student2 s1, Student2 s2) {
			String StudentName1 = s1.getStudentname().toUpperCase();
			String StudentName2 = s2.getStudentname().toUpperCase();

			// ascending order
			return StudentName1.compareTo(StudentName2);

			// descending order
			// return StudentName2.compareTo(StudentName1);
		}
	};

	/* Comparator for sorting the list by roll no */
	public static Comparator<Student2> StuRollno = new Comparator<Student2>() {

		public int compare(Student2 s1, Student2 s2) {

			int rollno1 = s1.getRollno();
			int rollno2 = s2.getRollno();

			/* For ascending order */
			return rollno1 - rollno2;

			/* For descending order */
			// rollno2-rollno1;
		}
	};

	@Override
	public String toString() {
		return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
	}

}
