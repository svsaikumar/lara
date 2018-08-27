class A
{
	int i;
	A ref;
	A(int i)
	{
		this.i = i;
	}

	void add(int i)//in add this is a1
	{
		A element = new A(i);
		A current = this;
		while(current.ref != null)
		{
			current = current.ref;
		}
		current.ref = element;
	}

	void iterate()
	{
		A current = this;
		while(current != null)
		{
			System.out.println(current.i);
			current = current.ref;
		}

}
}
class  M9
{
	public static void main(String[] args) 
	{
		A a1 = new A(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);

		a1.iterate();
	}
}
//when there are more elements add method is not recommended
//read and itrerate method reads the data from top to bottom