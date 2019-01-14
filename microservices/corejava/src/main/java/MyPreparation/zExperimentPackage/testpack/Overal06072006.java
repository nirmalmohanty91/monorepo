package MyPreparation.zExperimentPackage.testpack;

public class Overal06072006 {

	int i, j; // instance variable & non-static

	void functionA() // non-static function
	{
		System.out.println(i + 10);
		System.out.println(j + 20);
	}

	public static void main(String[] args) {                          //Execution start from here
		Overal06072006 o = new Overal06072006();          //All non-static elements will be loaded and JVM initializes all instance variable
		int x=10;
		System.out.println(x);
		System.out.println(o);               //Address of the object will be displayed
		

	}

}
