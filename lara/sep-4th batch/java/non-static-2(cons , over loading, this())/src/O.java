class O 
{
	int i ;
	O(int x)
	{
		i = x;
	}
	public static void main(String[] args) 
	{
		O ref = new O();
		System.out.println(ref.i);
	}
}
//whenever an object is creating then we have to use one of the available constructer.
