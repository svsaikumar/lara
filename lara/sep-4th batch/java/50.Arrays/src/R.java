class R
{
	public static void main(String[] args) 
	{
		int[] x = new int[4];
		Object y = x;

		Object z = y;
		int[] p = (int[]) y;//explicit downcasting as int[]  is subclass to Object classs
		System.out.println(x[1]);
		System.out.println(p[2]);
	}
}
//here elements from the array scan be accessed through only x  and p
//y and z are ordinary reference varaible not array type so we can't use them for indexes purposes
// p is array type
//y can't be assingned to p straight array as y is object type and p is array type