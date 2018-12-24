package com.cts.testpack;

public class VarTest {

	int x = 0;

	void function() {
		x = 10;
		VarTest vT = new VarTest();
		vT.x = 115;
		System.out.println(vT.x);
		System.out.println(x);
		System.out.println("End of functuon()");
	}

	public static void main(String[] args) {

		VarTest vT = new VarTest();
		vT.function();
		System.out.println(vT.x);
	}

}
