class A < X >
{
	X obj;
}
class M34
{

	public static void main(String[] args) 
	{
		A < ? > a1 = null;//here a1 is wild card type
		a1 = new A<Integer>();//compiler will not check right side
		a1 = new A<Double>();//compiler will not check right side
		a1 = new A<String>();//compiler will not check right side
		a1.obj = 30;//a1 is A type wild card.a1 is allowed to A type..but we are assing it with obj.
		System.out.println("done");
	}
}
//a1 is wild card type
//compiler checkes type of a1
//a1 is not allowed 
//obj type is not fixed
//by using a1 we can't assign any value to obj
//compiler not worry where a1 is pointing
//we can't assign any value to obj by using a1 because a1 is wild card referece type
//a1 can assinfg to A object to anything
