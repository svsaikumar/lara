class P 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("");
			Class.forName("");
			Class.forName("");
			Class.forName("");
			Class.forName("");
			Class.forName("");
			Class.forName("");
			Class.forName("");
			System.out.println("done");
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("ex");
		}
		
	}
}
//we don't require multiple try for multiple class not found exception
//any no.of "Class.forName" can be developed in one try
