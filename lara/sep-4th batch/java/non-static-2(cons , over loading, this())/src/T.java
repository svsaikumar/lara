class T
{
	int i ;
	T()
	{
		System.out.println("T()");
	}
	T(int i)
	{
		System.out.println("T(int)");
	}
	T(int i, int j)
	{
		System.out.println("T(int, int)");
	}
	public static void main(String[] args) 
	{
		T t1 = new T();
		System.out.println("==========");
		T t2 = new T();
		System.out.println("==========");
		T t3 = new T(30,40);
		System.out.println("==========");
	}
}