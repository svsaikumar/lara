interface A
{
	void test1();
}


abstract class T implements A
{
	public void test1(int i)
	{
		System.out.println("from test-1(int)");
	}
	
	
	
}
//in T there are 2 methods i.e.,test1(int i) and abstract method test1()
//here we didn;t get any error eventhough there is abstract method in T without any implementation and it is declared as abstract
//which indicates that there are abstract methods inside the T class without implementation