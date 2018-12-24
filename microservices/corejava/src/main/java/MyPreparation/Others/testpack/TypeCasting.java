package com.cts.testpack;

/*Integers----A)byte-------------->8 bits
              B)short------------->16 bits
              C)int--------------->32 bits
              D)long-------------->64 bits
            
Real Numbers----A)float--------->32 bits
                B)double-------->64 bits
              
Characters------char------------>16 bits

Boolean---------boolean--------->1 bit         */


public class TypeCasting {

	public static void main(String[] args) {
		
        int i=6;
        float j=7;
        System.out.println(j);
        //float k=7.0;
        float k=(float) 7.0;
        System.out.println(k);
        long l=8;//implicit type casting
        System.out.println(l);
        int x=(int) l;
        byte b=6;
        //b=x;
		b = (byte) x; // Explicit type casting
		float c=7.8f; //This is another method of type casting 
		char ch= (char) x; //this is possible
		System.out.println(ch);
		char ch1='&';
		System.out.println(ch1);
		int y=ch; //This is also possible
		System.out.println(y);
	}
}


/*We can type cast certain primitive data types into some certain primitive data types only
 * Type casting any primitive data type into any other primitive data type is not possible (Same concept in case of objects and classes)
 *  */





