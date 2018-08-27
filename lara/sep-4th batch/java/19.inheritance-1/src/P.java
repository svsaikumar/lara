class M  
{		
		
	M()
	{
		//super(); by default compiler will create super()
		System.out.println("M()");
	}
}
class N extends M
{
	N()
	{
		//super(); by default compiler will create super()
		System.out.println("N()");
	}
}
class O extends N
{
	O()
	{
		//super(); by default compiler will create super()
		System.out.println("O()");
	}
	{
		System.out.println("Q-iib");
	}
}
class P extends O
{
	
	P()//super(); by default compiler will create super()
	{
		System.out.println("P()");
	}
	{
		System.out.println("P-iib");
	}

	public static void main(String[] args) 
	{
		M m1 = new M();
		System.out.println("===========");
		N n1 = new N();
		System.out.println("===========");
		O o1 = new O();
		System.out.println("===========");
		P p1 = new P();
		System.out.println("===========");
	}
}