enum E
{
	C1, C2, C3, C4;
}
class F
{

	public static void main(String[] args) 
	{
		System.out.println(E.C1);
		System.out.println(E.C3);
	}
}
//both are non-public we can save it with any name(but we have to run with F class)
//inside enum fixed number of ordered unique constants(which means static and final are perfect constants)