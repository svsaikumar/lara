public class M 
{
	static int x;

	public static void main(String[] args) 
	{
		System.out.println("a:" + M.x);
		int x = 10;
		System.out.println("b:" + x);
		System.out.println("c:" + M.x);//here we are accessing global variable X
		x = 20;//modifying local variable
		M.x = 30;//modifying global varable
		System.out.println("d:" + x);
		System.out.println("e:" + M.x);
	}
}
//it is recommended to use global variables with class name

