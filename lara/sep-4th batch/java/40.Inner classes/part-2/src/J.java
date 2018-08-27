class  I
{
	class B
	{

	}

	static class C
	{
		int i = 10;
	}
}
class J
{
	public static void main(String[] args) 
	{
		I.B b1 = new I().new B();
		I.C c1 = new I.C();
		System.out.println("done");
	}
}
//here inner classes are using in outside of outer class