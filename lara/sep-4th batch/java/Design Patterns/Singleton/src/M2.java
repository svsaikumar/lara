class M2 
{
	public static void main(String[] args) 
	{
		A a1 = A.getObject();
		A a2 = A.getObject();
		A a3 = A.getObject();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}
}
//here we will get same output for a1 , a2 and a3
//getObject() returning referece of same object