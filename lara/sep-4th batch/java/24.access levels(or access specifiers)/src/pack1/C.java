package pack1;

class C extends A
{
	public static void main(String[] args) 
	{

		C c1 = new C();
		System.out.println(c1.i);
	}
}
//inside C class i is available as i access scope is default and class C extends with A