class A 
{
	public static void test()
	{
		System.out.println("from A.test()");
	}
}
class B extends A
{
	public static void test()//this method is acting as a member of A class only in B
	{
		System.out.println("from B.test()");
	}	
}
class M6
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new B();
		A[] elements = {a1, a2};//here elements are A type
		for(A element : elements)
		{
			element.test();	//a1.test()==A.test();
		}					
	}
}
//static methods can't be modified further
//static members are class members
//A class test method acting as a memebr of A class only
//B class test method acting as a memebr of B class only
//although super class static method is inheriting to subclass, it acts as a member of super class only
//if we are calling a static method with a reference variable then compiler replaces that variable with a class name
//here the elements a1,a2 type is A.so, while calling test methodswith these variables compiler replaces with class name A
//static methods can't be abstract
//B object didn't have a test method
//A object didn't have a test method
//super class static member can't act as a subclass static member