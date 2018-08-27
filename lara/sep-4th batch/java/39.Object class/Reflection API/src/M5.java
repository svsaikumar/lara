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
class M5
{
	public static void main(String[] args) throws Exception
	{
		Class c1 =Class.forName("A");//A is explicitly loading to the memory...while it is loading in class.forName...
									 //by using c1 we can find out what are the constructers are avilable

		Field[] fields = c1.getDeclaredFields();//it returns the fields details of java.lang.Class object of A
		for(Field field:fields)
		{
			System.out.println(field + ":");
			System.out.println(field.getType());
		}
		System.out.println("============");




		Method[] methods = c1.getDeclaredMethods();//it returns method details of java.lang.Class object of A
		for(Method method:methods)
		{
			System.out.println(method + ":");
			System.out.println(method.getReturnType());
		}
		System.out.println("============");




		Constructor[] constructors = c1.getDeclaredConstructors();//it returns constructors details of java.lang.Class object of A
		for(Constructor constructor:constructors)
		{
			System.out.println(constructor+ ":") ;
		}
		System.out.println("============");
	}
}
//A class containng 2 fields, 2 constructers, 2 methods

//getFields( ) returns an array of Field objects representing all of a class’s public variables, including those it inherits.
/*
	getDeclaredFields( ) returns an array representing all the variables declared in the class, regardless of their access modifiers 
	(not including variables the security manager won’t let you see), but not including inherited variables.
*/
