package MyPreparation.collectionsinjava.SetPrograms.programs;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<>();
		set.add(new Student(12, "Nirmal", 24));
		set.add(new Student(13, "Ramesh", 25));
		set.add(new Student(12, "Renu", 22));
		set.add(new Student(15, "Jason", 21));

		Iterator<Student> itr = set.iterator();
		while (itr.hasNext()) {
			// Student st = itr.next();
			System.out.println(itr.next());
		}

	}
}
@Getter
@Setter
class Student {
	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		return (id == student.id);

	}

	@Override
	public String toString() {
		return id + " " + name + " " + age;
	}

}
