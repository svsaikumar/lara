class I 
{
	public static void main(final String[] args) 
	{
		args = null;//here we are modifying args which is final which is illegal.so we get error here
		System.out.println("done");
	}
}
