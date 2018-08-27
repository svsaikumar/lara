





class M40
{
	public static void main(String[] args) 
	{
		String s1 = "abc";
		String s2 = s1 + "hello";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
//here 3 objects are creating
//abc in constant pool
//hello in constant pool
//abchello in non-constant pool