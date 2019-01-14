package MyPreparation.zExperimentPackage.testpack;

public class DemoC {
	int i=0;
	void functionC()
	{
		System.out.println("Inside funC of DemoC");
	}
	
	public static void main(String args[])
	{
		
		DemoA da=new DemoA();
		DemoB db=new DemoB();
		da.functionA();
		db.functionB();
	}

}
