class A
{
	Double test()
	{
		return null;
	}
}
class M9
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		Double s1 = a1.test();
		Double s2 = a2.test();
		System.out.println("done");
	}
}
//for both the objects, test() method return type is null