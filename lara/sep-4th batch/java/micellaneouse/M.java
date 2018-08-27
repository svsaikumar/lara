class M
{
	public static void main(String[] args) 
	{
		int x = 10;
		int y = 20;
		int z = x > 15 ? (y > 10 ? 5:6) : ( y > 10 ? 40:20);
		System.out.println(z);
	}
}