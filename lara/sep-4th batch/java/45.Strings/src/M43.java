class M43
{
	public static void main(String[] args) 
	{
		String s1 = "java";
		String s2 = "ja".concat("va");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
//concat is using + operator
//s2 pointing to non constant pool
//s1 pointing to 
//by using 'ja' we are calling concat, inside concat, 'ja' is 'this'

class String
{
	public String concat(String str)//str = va
	{
		return (this + str);//this = ja
		//		ja   +  va//using + on reference of ja and va i.e is this and str
	}
}
//using + on reference of ja and va i.e is this and str
//when concat is using object is creating in non constant as it used + 'new' internally