interface A
{
	void test1();
}
class  K implements A//K  class implementing interface A
{
	public void test1()
	{
		System.out.println("from test1()");
	}
	public static void main(String[] args) 
	{
		//A a1 = new A();
		A a2 = null;
		K k1 = new K();
		k1.test1();
		System.out.println("done");
	}
}
//we can't create object to interface as it is 100% abstract(objects can't be created to abstract)
//we can use interface as a reference variable
//we can use interface for data type purpose also(we can use abstract also for data type purpose)
//while using interface we have to use implements keyword for inheriting purpose
//implements should be represented  with dotted line
//eventhough test1() is not mentioned as public explicity it is public by default.we have to implement it in subclass with public only
//here we can't object to A,but we can create refernce to A
