class A
{
	int i;
	A ref;
	A(int i)
	{
		this.i = i;
	}

	A(int i, A root)
	{
		this.i = i;
		A current = root;
		while(root.ref != null)
		{
			root = root.ref;
		}
		current.ref = this;
	}
}
class  M6
{
	public static void main(String[] args) 
	{
		A a1 = new A(10);//for first obj ref is null
		new A(20, a1);//supplying a1 as root
		new A(30, a1);//supplying a1 as root
		new A(40, a1);//supplying a1 as root
		new A(50, a1);//supplying a1 as root

		 
		System.out.println(a1.i);
		System.out.println(a1.ref.i);
		System.out.println(a1.ref.ref.i);
		System.out.println(a1.ref.ref.ref.i);
		System.out.println(a1.ref.ref.ref.ref.i);
	}
}
//constructer overloding
//last object ref, assigning to current object