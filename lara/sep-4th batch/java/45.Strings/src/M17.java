class M17
{
	public static void main(String[] args) 
	{
		String s1 = "java";
		String s2 = s1 + 10;

		String s3 = s1 + (10  + 10);//here bracket content is executing first.bracket has more priority in java
		String s4 = 10 + 10 + s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}


