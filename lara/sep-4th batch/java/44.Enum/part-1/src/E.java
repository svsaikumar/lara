enum E
{
	C1, C2, C3, C4;
}
class  F
{

	public static void main(String[] args) 
	{
		System.out.println(E.C1);
		System.out.println(E.C3);
	}
}
//both are non-public we can save it with any name
//inside enum fixed number of ordered unique constants(which means static and final are perfect constants)
//as constansts are static we can use them with the class names