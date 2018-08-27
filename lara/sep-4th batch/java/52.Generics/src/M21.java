class A < X extends Number>
{
	X obj;
}
class M21
{
	public static void main(String[] args) 
	{
		
		A<String> a6 = new A<String>();
		A<Thread> a7 = new A<Thread>();
		System.out.println("done");
	}
}
//String and Thread are not subclasses to Number, so we get error