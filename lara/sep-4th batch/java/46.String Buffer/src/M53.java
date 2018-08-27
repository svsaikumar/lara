class M53 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("JavaMadeEasy");
		
		System.out.println(sb);
		sb.delete(2, 5);//5 is exclusive
		System.out.println(sb);
	}
	
}