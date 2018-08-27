class T 
{
	static int i = 10;
	static int j = test();// this  is also a intilizer.test method is calling
	static int test()
	{
		return 20;
	}
	static int k = test();
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
//we can call a method from a initializer
//test method can be decalred before calling that or after calling that
//if method return type is void then that can't be called as it is not returning any value