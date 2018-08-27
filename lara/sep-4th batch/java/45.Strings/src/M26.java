


class M26 
{
	public static void main(String[] args) 
	{
		String s1 = new String("HelloHello");
							  //0123456789
		System.out.println(s1);
		int i = s1.lastIndexOf('e',3);//searching for 'e' from last index
		System.out.println(i);
		i = s1.lastIndexOf('l');//searching for 'l' from last index
		System.out.println(i);
		i = s1.lastIndexOf('H');//searching for 'H' from last index
		System.out.println(i);

	}
}
