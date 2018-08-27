//package pack1;
enum B
{




	CON1,CON2,CON3;
	// by default static and final 
	// enum is coming under deriveg data type
}
class M1
{
	public static void main(String[] args)
	{
		B b1=B.CON1;
		B b2=B.CON2;
		B b3=B.CON3;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}
// compling : javac -d ../classes pack1/M1.java
// run : java pack1.M1

// output : CON1
//          CON2
//			CON3
