class M18
{
	public static void main(String[] args) 
	{
		String s1 = null;
		String s2 = s1 + 10;
		String s3 = null + s1;//here s1 is also null and it is valid as s1 is string
		String s4 = null + null;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
//null is a common reference to any variable
//null + null is not a string type


