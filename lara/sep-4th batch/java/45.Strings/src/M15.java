class M15
{
	public static void main(String[] args) 
	{
		String s1 = null;


		String s2 = s1 + s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.length());
		System.out.println(s1.length());
	}
}
//we can't find the length of a null String object
//null is a physical object type
//s1 is refering to one physical object which contains content as null
