class S
{
	static int i = 20;
	static
	{
		System.out.println("S-SIB");
	}
}
class T
{
	public static void main(String[] args) 
	{
		System.out.println("T-main begin");
		System.out.println("========");
		System.out.println(S.i);
		System.out.println("========");
		S.i = 20;
		System.out.println(S.i);
		System.out.println("========");
		S.i = 30;
		System.out.println(S.i);
		System.out.println("T-main end");
	}
	static
	{
		System.out.println("T-SIB");
	}
}
//here wr can't run S but we can use it in another class
//when it is called from T it  is loading.afterthat  we can use it any number of times