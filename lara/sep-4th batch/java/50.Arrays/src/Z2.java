class A implements Comparable
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
	public int compareTo(Object obj)//in this method we have to mention based on which attribute comparision should be done
	{
		return j - ((A) obj).j;//comparing 2 object of A  based on j values(current object(this.j) and arg object)
	}							// based on j value sorting is happening
}
class Z2
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
		java.util.Arrays.sort(x);
		System.out.println(java.util.Arrays.toString(x));
	}
}
//there is built in comparable interface in java.lang.package
//comparable interface contains only one method i.e compareTo method(it is functionl interface)
//comparable inteface is mainly introduced for single attricute class (comparing)only one value , not for multiple attributes
//if multiple attributes are there, then it is not recommended to use comparable interface