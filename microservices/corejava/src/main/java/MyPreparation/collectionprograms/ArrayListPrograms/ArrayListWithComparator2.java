package MyPreparation.collectionprograms.ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListWithComparator2 {

	public static void main(String[] args) {
		MarkComparator comparator = new MarkComparator();
		ArrayList<Student3> arraylist = new ArrayList<Student3>();
		arraylist.add(new Student3(101, "Zues", 26));
		arraylist.add(new Student3(505, "Abey", 24));
		arraylist.add(new Student3(809, "Vignesh", 32));

		/* Sorting based on Student Name */
		System.out.println("Student Name Sorting:");
		Collections.sort(arraylist, comparator); // In Comaparator sorting
													// sort() should take two
													// parameters

		for (Student3 str : arraylist) {
			System.out.println(str);
		}
	}
}

class Student3 {
	private String studentname;
	private int rollno;
	private int studentage;

	public Student3(int rollno, String studentname, int studentage) {
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

	@Override
	public String toString() {
		return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
	}

}

class MarkComparator implements Comparator<Student3> {

	@Override
	public int compare(Student3 o1, Student3 o2) {
		// TODO Auto-generated method stub
		return o1.getStudentname().compareTo(o2.getStudentname());
	}

}
