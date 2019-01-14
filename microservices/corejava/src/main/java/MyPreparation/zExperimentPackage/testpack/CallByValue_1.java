package MyPreparation.zExperimentPackage.testpack;

public class CallByValue_1 {
	int i, j;

	void function1(int i) // Call by value
	{
		System.out.println(i);
		System.out.println("Inside function1");
	}

	void function2(Overal06072006 a1) // Call by reference
	{
		if (a1 != null) // Usually this is the precaution taken,when we pass the
						// object of a class as an argument to a function
		{
			a1.i = 203;
			a1.j = 115;
		}

		System.out.println(a1);
		System.out.println("end of function2");
	}

	public static void main(String[] args) {
		CallByValue_1 d1 = new CallByValue_1();
		Overal06072006 a2=new Overal06072006();
		System.out.println(a2);
		d1.function2(a2);
		//d1.function2(new Overal06072006());
		//d1.function2(null); we can pass null as an argument to a function
		System.out.println(a2.i);
		System.out.println("End main");
		
	}

}
