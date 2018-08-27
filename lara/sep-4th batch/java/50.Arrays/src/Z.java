class A
{
	int  i, j ;
	A(int i,int j)//for args of a constructor, data type should be specified separately
	{
		this.i = i;
		this.j = j;
	}
	public String toString()//over riding  toString method of object class
	{
		return "(i= " + i + "," + "j= " + j + ")";
	}
}
class Z
{
	public static void main(String[] args) 
	{
		A[] x = {
					new A(9, 10), 
					new A(19, 20), 
					new A(21, 15), 
					new A(13, 93)
				};
		System.out.println(java.util.Arrays.toString(x));
		java.util.Arrays.sort(x);
		System.out.println(java.util.Arrays.toString(x));
	}
}
//while using sort method for derived data types like class A(here), it requires comparable type of elements inorder to sort 
//class A is not comparable, (then how can we compare one object of class A with another object of class A)
//in every sorting mechanism comparing is done(then only we can sort)
//every wrapper class implementing comparable interface
//every String class implementing comparable interface
//inorder to sort we have to supply comparable type of objects