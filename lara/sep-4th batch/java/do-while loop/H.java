class  H
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i =1;
		do
		{
			System.out.println(" do while-1-begin:" + i);
			int j = 5;
								do
								{
									System.out.println(" do while-2:" + j);
									j--;
									if(j >=2)
									{
										continue;
									}
									System.out.println(" do while-2-end:" + i);
								}
								while (j > 2);//2
			System.out.println(" do while-1-end:" + i);
			i++;
		}
		while(i < 2);
		System.out.println("main end");
	}
}
