class R
{
	int i ;
	public static void main(String[] args) 
	{
		R r1 = new R();
		R r2 = new R();
		System.out.println(r1.i);
		System.out.println(r2.i);
		r1.i = 10;
		r2.i = 20;
		System.out.println(r1.i);
		System.out.println(r2.i);
		
	}
}
//any number of objects can be craeated to one class