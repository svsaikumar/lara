class N
{
	int i;//here i is global.so we can use it anywhere
	N(int x)
	{
		i = x;
	}

	public static void main(String[] args) 
	{
		N obj1 = new N(500);
		N obj2 = new N(600);
		N obj3 = new N(700);
		System.out.println(obj1.i + ","+ obj2.i + "," + obj3.i);
		
	}
}
//constructer can take any number of arguments like methods