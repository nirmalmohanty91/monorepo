package com.cts.filedemo;

class A {
	{
		System.out.println("THIRD");
	}

	public A() {
		System.out.println("Thhis is default constructor A");
	}

	static {
		System.out.println("THIRD");
	}
}

class B extends A {
	{
		System.out.println("SECOND");
	}
}

class C extends B {
	{
		System.out.println("FIRST");
	}
}

public class MainClass {
	public static void main(String[] args) {
		C c = new C();
		System.out.println("--------------------");
		C c1 = new C();
	}
}
