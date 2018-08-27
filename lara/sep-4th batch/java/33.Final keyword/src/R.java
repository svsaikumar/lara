class R 
{
	final int i = 10;
	
	public static void main(String[] args) 
	{
		R r1 = new R();
		r1.i = 20;//error-attempting to modify final value
		System.out.println("done");
	}
}
