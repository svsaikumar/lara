import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
class A
{
	int i;
	double j;
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		System.out.println("A(int)");
	}
	static void test1()
	{
		System.out.println("test1:");
	}
/*	void test2(double i, String s1)
	{
		System.out.println("test2:" +i+ "," +s1);
	}*/
}
class M10
{
	public static void main(String[] args) throws Exception
	{
		Class c1 =Class.forName("A");
		Method  m1 = c1.getDeclaredMethod("test1");
	//	Method  m2 = c1.getDeclaredMethod("test2", double.class, String.class);
		Object obj = c1.newInstance();
		m1.invoke(null, null);
		m1.invoke(obj, null);
		m1.invoke(null);
		m1.invoke(obj);
		//m2.invoke(obj, 4.5, "xyz");
		System.out.println("done");
		System.out.println(m1);
	}
}
//obj is refering to object of class A which containing test1 and test2 methods
//overloaded methods can be invoked with method name and list of arguments