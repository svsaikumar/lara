enum I
{
	test1, test2, test3, test4//(if enum contains only constants then ";" is optional
}
class J
{
	public static void main(String[] args) 
	{
		I ref1 = I.test3;
		System.out.println(ref1);
		ref1 = I.test1;//(ref1 can be assingned with any available constant of I)
		System.out.println(ref1);
	}
}
//both are non-public we can save it with any name(but we have to run with J class)
//inside enum fixed number of ordered unique constants(which means static and final are perfect constants)
//we can re assingn a value to enum