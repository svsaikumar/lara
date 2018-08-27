class Y 
{
	Y()
	{
		this(90);
		System.out.println("Y()");
	}
	Y(int i)
	{
		
		System.out.println("Y(int)");
	}
	public static void main(String[] args) 
	{
		Y y1 = new Y();
		System.out.println("=============");
		Y y2 = new Y(90);
		
	}
}
