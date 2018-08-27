




class M38
{
	public static void main(String[] args) 
	{
		String s1 = "java";
		String s2 = "ja";
		String s3 = s2 + "va";
		System.out.println(s1 == s3);//== checks pointing to same object or not
		System.out.println(s1.equals(s3));//equals method checks content
	}
}

//+ operator creating Stirng object in non-constant pool as right side one is reference variable
//s3 creating new object in non constant pool
//if + operator is taking any reference varaible then it creates in non constant pool