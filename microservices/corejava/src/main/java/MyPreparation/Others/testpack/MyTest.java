package com.cts.testpack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class MyTest {

	public static void main(String[] args) throws IOException {
		// IdComparator compare = new IdComparator();
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(144, "nirmal", 2322));
		list.add(new Employee(324, "brody", 5343));
		list.add(new Employee(888, "jason", 89898));

		Collections.sort(list);
		for (Employee e : list)
			System.out.println(e);

	}
}

class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int sal;

	public Employee(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + sal;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.getId() - o.getId();
	}
}
