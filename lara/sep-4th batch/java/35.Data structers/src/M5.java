class A
{
	int i;
	A ref;
	A(int i)
	{
		this.i = i;
	}

	A(int i, A parent)
	{
		this.i = i;
		parent.ref = this;
	}
}
class  M5
{
	public static void main(String[] args) 
	{
		A a1 = new A(10);
		A a2 = new A(20, a1);//here this is a2-a1 is parent
		A a3 = new A(30, a2);//here this is a3-a2 as parent
		A a4 = new A(40, a3);//here this is a4-a3 is parent
		A a5 = new A(50, a4);//here this is a5-a4 is parent

		 
		System.out.println(a1.i);
		System.out.println(a1.ref.i);
		System.out.println(a1.ref.ref.i);
		System.out.println(a1.ref.ref.ref.i);
		System.out.println(a1.ref.ref.ref.ref.i);
	}
}
//constructer overloding