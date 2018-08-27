class Z5 
{
	enum X
	{
		A, B, C, D;
	}
	public static void main(String[] args) 
	{
		X x1 = X.C;

		switch( x1 )
		{
			case A:
			{
				System.out.println("in A");
				break;
			}
			case B:
			{
				System.out.println("in B");
				break;
			}
			case C:
			{
				System.out.println("in C");
				break;
			}
			case D:
			{
				System.out.println("in D");
				break;
			}

		}
		System.out.println("done");
	}
}
//enum can also be used as switch argumrnt
//every case should have a constant of enum
//swith arg can be emnum type