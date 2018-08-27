class F
{
	F()
	{
		System.out.println("F()");
	}
	
	F(int i)
	{
		System.out.println("F(int)");
	}

	{
		System.out.println("F-IIB");
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println("=========");
		F f2 = new F(30);
		System.out.println("=========");
	}
}
//IIB - instance initialization block(without a name and without keyword)
//for every object creation iib will execute(like constructer)
//IIB is prefered than constructer
//IIB will  execute for every object creation irrespective of object argument