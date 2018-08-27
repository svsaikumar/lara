enum K
{
	t1, t2, t3, t4//(if enum contains only constants then ";" is optional
}
class L
{
	public static void main(String[] args) 
	{
		K k1 = K.t3;
		System.out.println(k1);
		k1 = K.t1;
		System.out.println(k1);
		k1 = K.t5;//we can assign a unavailable constant (here t5 is not availale in enum_)
		System.out.println(k1);
	}
}
//both are non-public we can save it with any name(but we have to run with J class)
//inside enum fixed number of ordered unique constants(which means static and final are perfect constants)
//we can re assingn a value to enum