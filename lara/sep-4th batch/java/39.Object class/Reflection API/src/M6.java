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
class M6
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("A");
		Field field = c1.getDeclaredField("i");//specifyinh a particular field in the form of String.i one of the field in A
	    Object obj = c1.newInstance();//here newInstance() method is creating an object to A by using Class object of A(i.e c1)//new A();
		field.setInt(obj,20);			//that object is returning to obj.newInstance() return type is Object type.
		A a1 = (A) obj;					//obj can be downcasted to A
										//field is refering to i(i is referred by field)
										//inside A, i is available, that i is setting to 20



	/*	Field field1 = c1.getDeclaredField("j");
	    Object obj1 = c1.newInstance();
		field1.setDouble(obj,20);
		A a1 = (A) obj1;
		*/


		System.out.println(a1.i);
		System.out.println(a1.j);
		System.out.println(obj);
		System.out.println(c1);
		System.out.println(field);
	}
}
//Class object of A is assigning to c1
//newInstance() return type is Object type
//field.setInt(obj,20);= obj.i = 20
//on obj i value is set to 20
//A a1 = (A) obj;	=same obj is setting to a1(obj and a1 are pointing to same object) inside obj i value modified to 20
//after getting a Class object we can do so many things
//newInstance() always use no-arg constructer.if no arg constructor is not there we get an exception


/*field.setInt(Object obj, int  value);
		obj - the object whose field should be modified.
		value - the new value for the field of obj being modified.
*/