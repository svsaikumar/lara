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
class M9
{
	public static void main(String[] args)
		throws Exception
	{
		Class c1 =Class.forName("A");
		Method  m1 = c1.getDeclaredMethod("test1");
		Method  m2 = c1.getDeclaredMethod("test2");
		Object obj = c1.newInstance();//obj is ref variable to test1()//on obj m2 is exiguting//
		m1.invoke(obj);//it is internally obj.test1 on A object test1
		m2.invoke(obj);//obj is internally obj.test2.on A object test2
		System.out.println("done");
	}
}
//invoking test1 and test2 on java.lang.Class Object 
//created an object to A by newInstance() on the java.lang.Class object
//test1 of Class-A is refered by m1
//test2 of Class -A  refered by m2
//m1 is pointing to test1 of class A
//m2 is pointing to test2 of class A
//obj refering it A object,insed that A object, test1 and test2 are available
//obj pointing to Class A object which contaidn test1 and test2
