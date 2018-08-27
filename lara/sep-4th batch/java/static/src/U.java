class U 
{
	static int i = 10;
	static int j = k;//initializer
	static int k = i + j;//initializer. k data type is same as i and j
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
//the order is first declaration and then initialization