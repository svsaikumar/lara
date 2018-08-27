





class M35 
{
	public static void main(String[] args) 
	{
		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1 == s2);//== checks pointing to same object or not
		System.out.println(s1.equals(s2));//equals method checkcs content
	}
}
//heap memory = string constant pool and non-constant pool
//inside string constant pool all will be unique objects
//if we create a object with new operator for any class, it creates in non-constant pool
//if we create a object to String class without a new operator it creates in constant pool
//in constant pool duplicats are not allowed

//here s1 and s2 are pointing to different objects but content is same
//s1 is created in String constant pool and  s2 is created in non-constant pool
//equals method always checking content of the String objects
//==  checks both are pointing to same object or not