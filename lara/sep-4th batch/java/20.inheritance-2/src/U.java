class S 
{
	static
	{
		System.out.println("S-SIB");
	}


	S()
	{
		System.out.println("S()");
	}
}
class T extends S
{
	T()
	{
		System.out.println("T()");
	}

	static
	{
		System.out.println("T-SIB");
	}
}
class U
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		T t1 = new T();
		System.out.println("===========");
		S s1 = new S();
		System.out.println("main end");
	}
}
//any class loading to the memory only one time
