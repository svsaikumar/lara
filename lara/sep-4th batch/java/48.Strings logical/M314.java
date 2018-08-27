class M314 //finding number of words in a given String
{
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		String s1 = "Hello test java world lara 651";
		int count = 1;

		int i = s1.indexOf(' ');//i = 5.10//15
		
		while(i != -1)
		{
			count ++;//2//3//4
			i = s1.indexOf(' ', i+1);//searching for another space from previous space
		}
		System.out.println(s1);
		System.out.println(count);
	}
}