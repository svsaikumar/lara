class G 
{
	public static void main(String[] args) 
	{
		final int[] x = new int[3];//x is declared as final
		x  = new int[4];//trying to modify final-x which is illegal
		System.out.println("done");
	}
}