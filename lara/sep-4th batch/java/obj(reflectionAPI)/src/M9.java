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
	void test1()
	{
		System.out.println("test1");
	}
	void test2()
	{
		System.out.println("test2");
	}//test 1 and test2 not taking any arguments//

}
class M9
{
	public static void main(String[] args)
		throws Exception
	{
		Class c1 =Class.forName("A");
		Method  m1 = c1.getDeclaredMethod("test1");
		Method  m2 = c1.getDeclaredMethod("test2");
		 Object obj=c1.newInstance();//obj is ref variable to test1()//on obj m2 is exiguting//
		m1.invoke(obj);
		m2.invoke(obj);
		System.out.println("done");
	}
}
