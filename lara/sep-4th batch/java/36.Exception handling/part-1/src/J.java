class I
{
}
class J
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		I obj = new I();//no class def found exception
		System.out.println("main end");
	}
}
//run by deleting the i class file
//we get no class definition found exception because while running there is no I class file

