class L 
{
	int i;
	L()
	{
		i = 20;
	}

	public static void main(String[] args) 
	{
		L obj1 = new L();
		L obj2 = new L();
		System.out.println(obj1.i + ","+ obj2.i);
	}
}
//i is non static member , for every object it is loading
//for every object creation constructer is executing.
//for every object i value is 20.
