class A 
{
	void test()
	{
		System.out.println("from A.test()");
	}
}
class B extends A
{
	void test()//over riding
	{
		System.out.println("from B.test()");
	}	
}
class M1
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new B();//autoupcasting
		A[] elements = {a1, a2};
		for(A element : elements)//element is assigning to a1 and a2 in two iterations
		{
			element.test();//this line shows polymorphism
							//a1.test();-test method of class A
		}					//a2.test();-test method of class B
	}
}
//inside B, test method is overriding
//B object containing test mesthod of class B
//inside A array we can store A type elements
//a2 pointing to B object
//a1 pointing to A object
//but both has same reference variable type A
//one statement giving multiple outputs(called as polymorphism)
//overriding and upcasting, is mandatory to achieve polymorphism
//this process requires inheritance