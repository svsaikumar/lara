class  B
{
	public static void main(String[] args) 
	{
		int x[] = {10,20,30,40,50,60,70};
		for(int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
		}
		System.out.println();
		for(int i : x)
		{
			System.out.println(i);
		}
		System.out.println();
	}
}
