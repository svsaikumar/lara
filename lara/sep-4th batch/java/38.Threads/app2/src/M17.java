interface A
{
	int test(int i,int j);
}
class M17
{
	public static void main(String[] args) 
	{
		//A a1 = (int x, int y)
		A a1 = ( x,  y) ->	{
								System.out.println("from test");
								return x + y;
							};
		System.out.println(a1.test(10,20));
		System.out.println("done");
	}
}
//lambda expressiond is for single method interfaces(functional interfaces)
//if there are multiple statements then 'return' is required
//lamda expressions should end with semi colon