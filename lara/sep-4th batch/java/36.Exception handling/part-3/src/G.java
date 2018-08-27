class G 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		try
		{
			Class.forName("");//we are not supplying any class name.so exception
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("ex");
		}
		System.out.println(2);
	}
}
//class.forname requires try-catch with class not found exception or throws with classnot found exception
