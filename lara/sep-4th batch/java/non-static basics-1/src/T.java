class T 
{
	int i = 200;
	public static void main(String[] args) 
	{
		T t1 = new T();
		T t2 = new T();
		System.out.println(t1.i);
		System.out.println(t2.i);
		t1.i = 10;
		t2.i = 20;
		System.out.println(t1.i);
		System.out.println(t2.i);
	}
}
