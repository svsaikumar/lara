class M30 
{
	public static void main(String[] args) 
	{
		Object obj = new E();


		System.out.println(obj instanceof Object);
		System.out.println(obj instanceof A);
		System.out.println(obj instanceof B);
		System.out.println(obj instanceof C);
		System.out.println(obj instanceof D);
		System.out.println(obj instanceof E);
	}
}
//eventhough not knowing object
//instanceof returning a boolean literal