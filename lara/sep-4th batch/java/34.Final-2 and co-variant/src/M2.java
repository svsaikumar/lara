abstract class A
{
	abstract final void test1();
}
class M2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//abstract methods can't be final as they should be implemented in the further subclasses
//final methods can't be declared as final
