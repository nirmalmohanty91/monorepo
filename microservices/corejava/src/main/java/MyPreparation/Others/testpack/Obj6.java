package com.cts.testpack;

public class Obj6 {

	int i = 5;

	void function1() {
		i = i + 1;
		System.out.println(i);
		System.out.println("End of funtion()");
	}

	public static void main(String[] args) {
		Obj6 o1 = new Obj6();
		o1.i = 25;
		o1 = new Obj6();
		System.out.println(o1.i);
		o1.i = 16;
		Obj6 o2 = o1;
		System.out.println(o2.i);

	}

}
