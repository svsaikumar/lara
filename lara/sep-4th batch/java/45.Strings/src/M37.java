







class M37 
{
	public static void main(String[] args) 
	{
		String s1 = "java";
		String s2 = "ja" + "va";
		System.out.println(s1 == s2);//== checks pointing to same object or not
		System.out.println(s1.equals(s2));//equals method checks content
	}
}
//here s1 and s2 are pointing to same object(as duplicates are not allowed inside String constant pool)
//+ operator uses constant pool