class V 
{
	V(int i, int j)
	{
		System.out.println("V(int, int)");
	}
  	V(int i, double j)//over loading
	{
		System.out.println("V(int, double)");
	}
	public static void main(String[] args) 
	{
		V v1 = new V(10, 20);
		System.out.println("=============");
		V v2 = new V(20, 3.4);
	}
}
//if no.of args change or change in data type then it is over loading