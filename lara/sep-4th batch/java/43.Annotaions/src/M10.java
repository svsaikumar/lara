@D(message="abc")
class M10 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//here we get error becsue we have set the target to D annotation as method but we are describing here for class
//D annotation should be only used to methods