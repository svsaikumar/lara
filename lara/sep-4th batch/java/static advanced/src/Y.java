class Y 
{
	static 
	{
		System.out.println("Y-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("Y.main begin");
		System.out.println(X.i);//only static members only loading
		System.out.println("===========");
		W.test();//only static members loading
		System.out.println("===========");
		W.test();
		System.out.println("===========");
		X.i = 500;
		System.out.println(X.i);
		System.out.println("Y.main end");
	}

}
//in this case the java file of x and w should be saved with their class names only
// this Y can be saved with any name  but we shiould run it with Y only
//static members are loaded nto the memory in to the memory only one time
//while using the static members try to use along with class name
