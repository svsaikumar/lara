




class M34 
{
	public static void main(String[] args) 
	{
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
//inside String class equals method is overrided which is a member of Object class
//equals method always checking content of the String objects
//==  checks whether both are pointing to same object or not

//heap memory = string constant pool and non-constant pool
//inside string constant pool all will be unique objects
//if we create a object with new operator for any class, it creates in non-constant pool
//if we create a object to String class without a new operator it creates in constant pool
//in constant pool duplicats are not allowed