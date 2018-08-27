class Q
{
	public static void test() 
	{
		System.out.println("Q-test");
	}
	static
	{
		System.out.println("Q-SIB");
	}
}
class R 
{
	public static void main(String[] args) 
	{
		System.out.println("R-main begin");
		Q.test();
		System.out.println("========");
		Q.test();
		System.out.println("========");
		Q.test();
		System.out.println("R-main end");
	}
	static
	{
		System.out.println("R-SIB");
		//System.out.println(P2.i);
	}
}
//we can use static members of one class in another class
//while one method in another class then we have to use it along with the class name
//here we are running R, so R is loaded.while executing R it requires Q.then it loads Q
//here we are running R but not Q.we are using Q.so there is no need to present main method in Q
//while using Q first time it loads into the memory,after that we can use it any number of times