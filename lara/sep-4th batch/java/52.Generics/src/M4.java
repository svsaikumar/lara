class A
{
	String obj1;
	Integer obj2;
	Double obj3;
}
class M4
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.obj1 = "hello";
		a1.obj2 = 20;
		a1.obj3 = 4.5;

		A a2 = new A();
		a2.obj1 = "abc";
		a2.obj2 = 30;
		a2.obj3 = 5.4;
		System.out.println("done");
	}
}
//here data types of obj1, obj2 and obj3 are not chaning from one object to another object
//Attribute data type is not changing from object to another