package pack1;
class H
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert test();
		System.out.println(2);
	}
	static boolean test()
	{
		return 10;
	}

}
/*
E:\yamini\assert-ded\src>javac -d ../classes pack1/H.java
pack1\H.java:12: error: incompatible types: int cannot be converted to boolean
                return 10;
                       ^
1 error
return type is other than boolean
*/