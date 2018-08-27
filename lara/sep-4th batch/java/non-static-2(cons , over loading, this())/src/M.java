class M 
{
	int i;//here i is global.so we can use it anywhere
	M()
	{
		i = 200;
	}

	public static void main(String[] args) 
	{
		M obj1 = new M();
		M obj2 = new M();
		M obj3 = new M();
		System.out.println(obj1.i + ","+ obj2.i + "," + obj3.i);
		obj1.i = 500;
		obj2.i = 600;
		obj3.i = 700;
		System.out.println(obj1.i + ","+ obj2.i + "," + obj3.i);
	}
}
//here for every object intially i value is 200.Later it is modified