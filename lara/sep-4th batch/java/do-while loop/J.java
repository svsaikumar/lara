class  J
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i =1;
		xyz:
		do
		{
			System.out.println("do while-1-begin:" + i);
			int j = 10;
			do
			{
				System.out.println("do while-2:" + j);
				j--;
				if(j >=8)
				{
					break xyz;//here it breaks all the loop after xyz:
				}
				System.out.println("do while-2-end:" + i);
			}
			while (j > 5);
			System.out.println("do while-1-end:" + i);
			i++;
		}
		while(i < 4);
		System.out.println("main end");
	}
}
//java allows a label(valid identifier with a colon) on the top of any loop