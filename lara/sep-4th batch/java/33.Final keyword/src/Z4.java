interface A
{
	int i = 10;
}
class  Z4
{
	public static void main(String[] args) 
	{
		System.out.println(A.i);
	}
}
//every member of interface is public(static and final also)
//we have to use interface members along with interface name if the class in which we are using that is not a subclass for interface