class A
{
	int  i, j ;
	A(int i,int j)//for args of a constructor, data type should be specified separately
	{
		this.i = i;
		this.j = j;
	}
	public String toString()//over riding  toString() method of object class
	{
		return "(i= " + i + "," + "j= " + j + ")";
	}
}
class Y
{
	public static void main(String[] args) 
	{
		A[] x = {
					new A(9, 10), 
					new A(19, 20), 
					new A(91, 90), 
					new A(92, 93)
				};
		System.out.println(java.util.Arrays.toString(x));
	}
}
