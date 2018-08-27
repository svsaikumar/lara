class X 
{
	void test()
	{
	}
}


class E
{
	public static void main(String[] args) 
	{
		X x1 = new X();
		x1.test();
		System.out.println("done");
	}
}
//here test() method is not private(it is default) in X.we can access it from E class
//either members or methods are not access from other class if they are declared as private.