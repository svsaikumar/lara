class G 
{
	G()
	{
		System.out.println("G()");
	}

	{
		System.out.println("G-IIB");
	}

	G(int i)
	{
		System.out.println("G(int)");
	}
	G(int i, int j)
	{
		System.out.println("G(int, int)");
	}
	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println("============");
		G g2 = new G(20);
		System.out.println("============");
		G g3 = new G(20,30);
		System.out.println("============");
	}
}
