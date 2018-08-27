class A
{
	static
	{
		System.out.println("A.SIB");

	}
}
class M3
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("main begin");
		Class c1 = Class.forName("A");//here it checks whether A is already loaded or not .if so it returns Class object of A to c1
										//class A is loading as it is not loaded previously.java.lang.Class object is creating
										//explicitly class A is loading to the memory
										//we are not using members of A
										//here the A class is loading so SIB is executing
		System.out.println("------");
		System.out.println(c1);
		System.out.println("main end");
		Class c2 = Class.forName("A");//here SIB is not executing because static members are loaded only one tiem for execution
		System.out.println(c2);
	}
}
//