package pack1;
class A 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert false;
		System.out.println(2);
	}
}
/*
E:\yamini\assert-ded\src>java -cp ../classes pack1.A
1
2
by default no assertion is excuttinig
*/