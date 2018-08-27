class M43
{
	public static void main(String[] args) 
	{
		A a1 = new C();
		C c1 = new C();

		System.out.println(a1.i);
		if(a1 instanceof C)
		{
			C obj = (C) a1;
			System.out.println(obj.j);
			System.out.println(obj.k);
		}
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c1.k);
	}
}
//before downcasting get a suggestion from instanceof
//while upcasting we can achieve polymorphism.by using this we can't use every variable
//for using every varaible we use downcasting