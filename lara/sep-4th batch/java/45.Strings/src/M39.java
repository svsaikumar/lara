






class M39
{
	public static void main(String[] args) 
	{
		String s1 = "java";
		String s2 = "ja";
		String s3 = "va";
		String s4 = s2 + s3;//due to + operator s4 used new operator
		System.out.println(s1 == s4);//== checks pointing to same object or not
		System.out.println(s1.equals(s4));//equals method checks content
	}
}
//+ operator uses 'new' to create object so it creates in non constant pool