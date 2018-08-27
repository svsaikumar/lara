class A
{
	int  i ;
	A(int i)
	{
		this.i = i; //instance var i = arg i for current object
	}
	/*public String toString()
	{
		return "i:"+this.i;
	}
	*/
}
class W
{
	public static void main(String[] args) 
	{
		A[] x = {
					new A(9), //x[0].toString
					new A(19), //x[1]
					new A(91), //x[2]
					new A(92) //x[3]
				};
		System.out.println(1);
		System.out.println(java.util.Arrays.toString(x));
	}
}
//just printing the content of the array but not sorting 
//internally calling toString method on every element
//toString() method is not overrided so simply memory address is printing with hexadicimal form
//Arrays class toString() internally calling every element's object clas toString() method
//class A containing object class toString() method