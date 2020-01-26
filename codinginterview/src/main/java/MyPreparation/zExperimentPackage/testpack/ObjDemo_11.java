package MyPreparation.zExperimentPackage.testpack;

/* Q.With what values uninitialized reference variables will be initialized?
 * Ans:Default initialization of all uninitialized reference variables is null  
 * We can't initialize this kind of variables with zero
 * */

public class ObjDemo_11 {

	Overal06072006 a1 = new Overal06072006();
	int i;
	ObjDemo_11 d1;

	public static void main(String[] args) {
		ObjDemo_11 d1 = new ObjDemo_11();
		d1.i=25;
		System.out.println(d1.d1); //it prints null
		d1.d1=new ObjDemo_11();
		d1.d1.a1.i=10;
		d1.a1.i=20;
		System.out.println(d1);
		System.out.println(d1.d1);
		System.out.println(d1.d1.d1); //here null
	}

}
