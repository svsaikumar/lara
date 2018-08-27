class H 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		System.out.println(1);
		Class.forName("");
		System.out.println(2);
	}
}
//instead of try catach we can for throws(incase of checked exceptions only)