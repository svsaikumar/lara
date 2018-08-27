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
	boolean test1(int i)
	{
		System.out.println("test1:"+i);
		return false;
	}
	char test2(double i,String s1)
	{
		System.out.println("test2:" +i+ "," +s1);
		return 's';
	}//test 1 and test2 not taking any arguments//

}
class M11
{
	public static void main(String[] args)
		throws Exception
	{
		Class c1 =Class.forName("A");
		Method  m1 = c1.getDeclaredMethod("test1",int.class);
		Method  m2 = c1.getDeclaredMethod("test2",double.class,String.class);
		 Object obj=c1.newInstance();//obj is ref variable to test1()//on obj m2 is exiguting//
		Object obj1=m1.invoke(obj,30);
		Object obj2 =m2.invoke(obj,4.5,"xyz");
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
