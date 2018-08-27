class A
{
	String obj;
}
class M3 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.obj = "hello";

		A a2 = new A();
		a2.obj = "test";
		System.out.println("done");
	}
}
//for every object of A, 'obj' data type is fixed i.e "String"
//it will be more useful if it is changing from object to object