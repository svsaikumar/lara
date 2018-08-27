class K 
{
	static int counter;

	K()
	{
		counter ++;
	}
	public static void main(String[] args) 
	{
		K k1 = new K();
		K k2 = new K();
		K k3 = new K();
		System.out.println(K.counter);
		System.out.println(k1.counter);
		System.out.println(k2.counter);
		System.out.println(k3.counter);
	}
}
