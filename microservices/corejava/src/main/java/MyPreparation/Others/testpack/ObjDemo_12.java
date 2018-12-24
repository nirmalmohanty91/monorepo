package com.cts.testpack;


/*CONCLUSION:
 * We can define object of a class as an instance in the same class,but should not be initialized with the address of the object of the same class.
 * */

public class ObjDemo_12 {

	Overal06072006 a1 = new Overal06072006();    
	ObjDemo_12 d1 = new ObjDemo_12();/*--------------->With this statement it goes into an infinite loop creating objects of class ObjDemo_12 as
	                                                   a chain ObjDemo_12*/
	int i;

	public static void main(String[] args) {
		ObjDemo_12 d1=new ObjDemo_12();
		d1.d1=new ObjDemo_12();
		/*Instead of this statement we have to just define but not initialize ObjDemo_12 d1;*/

	}

}

/*Object name should not be same otherwise it goes into infinite loop*/