package pack1;
class C
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert false:"something went wrong";
		System.out.println(2);
	}
}
/*
1
2
*/