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
		while(current.ref != null)
		{
			current = current.ref;
		}
		current.ref = this;
	}
}
class M7
{
	public static void main(String[] args) 
	{
		A a1 = new A(10); 
		new A(20, a1);   
		new A(30, a1);    
		new A(40, a1);	 
		new A(50, a1);
		A current = a1;
		while(current != null)
		{
			System.out.println(current.i);
			current = current.ref;
		}
	}
}
