class A < T,U >//class can take any number fo generics by using , as a separator
{
	T obj1;//T is for one data type purpose, Q is for another data type purpose
	U obj2;
	void test1(T t1)
	{
	}

	U test2()
	{
		return null;
	}
}
class M14
{
	public static void main(String[] args) 
	{
		A<Integer, String> a1 = new A<Integer, String>();//for a1, first data type is Integer, and second data type is String
		A<String, String> a2 = new A<String, String>();
		A<Integer, Integer> a3 = new A<Integer, Integer>();
		A<String, Integer> a4 = new A<String, Integer>();
		a1.obj1 = 10;
		a1.obj2 = "abc";

		a2.obj1 = "hello";
		a2.obj2 = "test";

		a3.obj1 = 44;
		a3.obj2 = 55;

		a4.obj1 = "xyz";
		a4.obj2 = 59;
		a1.test1(30);

		String s1 = a1.test2();

		System.out.println("done");
	}
}
//while creating the object, we have to specify both the generics
