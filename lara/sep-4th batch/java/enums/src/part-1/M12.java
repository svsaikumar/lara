package pack1;
class  M12
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Education e1=Education.ME;
		System.out.println(e1);
		System.out.println(e1.years);
		// years is a atribute
		System.out.println(e1.getYears());
		// getyears is a method.
		System.out.println("main end");
	}
}
// education is a enum 
// BSC,MSC,MCA,ME are the constants
// for every constant one copy of the years
// for every constant is loading into the non static mumbers 
// inside a enum java.lang,Enum is a bulding function
// while education is a enum complier keeps extends enum
// we should not use extends compiler only keeps extends 
// enums we cannot develop a inheritance --- we shold not keep extends


// output : main begin
//			BSC:3
//			MSC:2
//			MCA:3
//			ME:2
//			ME
//			2
//			2
//			main end
