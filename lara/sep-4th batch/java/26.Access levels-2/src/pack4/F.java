package pack4;
import pack3.A;
class F extends A
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		//System.out.println(a1.i);
		//System.out.println(a1.j);
		System.out.println(a1.k);

		F f1 = new F();
		//System.out.println(f1.i);
		System.out.println(f1.j);
		System.out.println(f1.k);
	}
}
//inside F class j and k are available(as they are protected and public)
//protected and public members are inheriting to every subclass
