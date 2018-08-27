class K 
{
	int p,q,r;//these are loaded into the memory with default values when an object is created
	K()//constructer is also an initializer
	{


		System.out.println("K():" + p + "," + q + "," + r);
		p = q = r = 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		K obj = new K();
		System.out.println("main:" + obj.p + "," + obj.q + "," + obj.r);
		System.out.println("main end");
	}
}
//while using  constructer we can initialize non-static members as per our requirement
//while object is creating, every non staic members is loading into the  memory with default value
//here when object is creating p, q, r are loaded into the memory with default values
//only global variables have default values.
