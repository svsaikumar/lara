class L 
{
	static int counter;




	L()
	{
		counter ++;
	}

	L(int i)
	{
		counter ++;
	}

	L(int i, int j)
	{
		counter ++;
	}
	public static void main(String[] args) 
	{
		L obj1 = new L();
		L obj2 = new L();
		L obj3 = new L(20);
		L obj4 = new L(2, 5);
		L obj5 = new L(40);
		L obj6 = new L(3, 5);
		L obj7 = new L(50);
		System.out.println(L.counter);
	}
}
