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
	}

}
class M8
{
	public static void main(String[] args) throws Exception
	{
		Class c1 =Class.forName("A");
		Field f1 = c1.getDeclaredField("i");
		Field f2 = c1.getDeclaredField("j");
	    Object obj=c1.newInstance();
		f1.setInt(obj,20);//setting i value 20 on obj
		f2.setDouble(obj,5.5);//setting j value 5.5 on obj
		System.out.println(f1.getInt(obj));
		System.out.println(f2.getDouble(obj));
	}
}
//f1 is refring to i
//f2 is refring to j