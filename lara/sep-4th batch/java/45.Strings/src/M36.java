




class M36 
{
	public static void main(String[] args) 
	{
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);//== checks pointing to same object or not
		System.out.println(s1.equals(s2));//equals method checks content
	}
}
//here s1 and s2 are 2 different objects having same content
//totally 3 String objects are creating
//("abc") creates in one object and reference of that is supplying to construcstse of String classas an argument to crete an 
		//new in non-constant pool object by using that referenceString constant pool with that one a new object is crating in non-constant pool
//if some thif is there in double quotes that has to crate in String constant