package pack2;
class F
{
	public static void main(String[] args) 
	{
		pack1.A a1 = new pack1.A();
		System.out.println(a1.i);
	}
}
//if A is public, then only we can use it here(as this is another package)