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
class M7
{
	public static void main(String[] args)
		throws Exception
	{
		Class c1 =Class.forName("A");//c1 is class obj to A..inside A i is field to A..
		Field field = c1.getDeclaredField("i");
	    Object obj=c1.newInstance();//new (A)
		field.setInt(obj,20);///i value is obj.i...that obj.i is modifing in to 20..
		System.out.println(field.getInt(obj));//on obj whatevr i value is there thet i value will be creating
	}
}
//obj is creaing class a by using no arg con()//
//obj is refering to an obj of A//
//field is refering by i....
//without downcasting it will be exiguting