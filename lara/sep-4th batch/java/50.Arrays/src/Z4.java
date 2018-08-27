import java.util.Comparator;
class A 
{
	int  i, j ;
	A(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
	public String toString()//over riding  toString method of object class
	{
		return "(i= " + i + "," + "j= " + j + ")";
	}
}
class Z4
{
	public static void main(String[] args) 
	{
		A[] x = {
					new A(90, 90), 
					new A(19, 10), 
					new A(91, 5), 
					new A(22, 15)
				};
		System.out.println(java.util.Arrays.toString(x));
		java.util.Arrays.sort(x,

		new Comparator()
		{
			public int compare(Object obj1, Object obj2)
			{
				return ((A) obj1).i - ((A) obj2).i;
			}

		});
		System.out.println(java.util.Arrays.toString(x));
		java.util.Arrays.sort(x, 
		new Comparator()
		{
			public int compare(Object obj1, Object obj2)
			{
				return ((A) obj1).j - ((A) obj2).j;
			}
		});
		System.out.println(java.util.Arrays.toString(x));
	}
}
//incase of functionla interface, lambda exp.is recomemnded rather than anonymous innerclass