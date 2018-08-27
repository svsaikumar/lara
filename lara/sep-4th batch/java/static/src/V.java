class V 
{
	static int i = j;//initializing with out declaring j. this is not valid
	static int j = 10;//here the order is not following so we get error here as illegal forward reference
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);	
	}
}
//the order is first declaration and then initialization