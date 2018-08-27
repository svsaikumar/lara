class R
{
	int i ;
	R(int x)
	{
		i = x;
	}
	public static void main(String[] args) 
	{
		R r1 = new R();
		System.out.println(r1.i);
	}
}
//if there is constructer, then by default compiler won't create any constructer.