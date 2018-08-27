class G 
{
	int i ;
	static int j;
	void test()
	{

		System.out.println(i + "," + j);
	}
	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println(g1.i + "," + j);
		g1.test();
		System.out.println(i + "," + j);
	}
}
//here i and j can be used in test method as there is default reference variable 'this' in non-static block
//we can't use 'i' in main method as 'i'  is non-static and there is no defalut reference variable this in static main method
//inside non-static member we can use every  member of the current class
//static members can be used any where in the current class
//but we can't use non-static member in static block straight away(here we can't use 'i' in main method directly)