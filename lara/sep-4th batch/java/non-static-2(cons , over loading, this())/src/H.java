class H
{
	H()//constructer
	{
		System.out.println("H()");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		H h1 = new H();
		System.out.println("main end");
	}
}
//constructers are used to initialize the non-static members
//constructer should have a same name as class name
//constructer should not have a return type
//constructer should not be static(as it is used for non -static)
//constructer executes automatically  while object is creating
//constructer executes for each object