package pack1;
class E
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		int i=10;
		assert i=10;//false
		System.out.println(2);
	}
}
/*pack1\D.java:8: error: incompatible types: int cannot be converted to boolean
                assert i=10;
                        ^
1 error
*/
//is not a boolen results 
//assert stmt always receving boolean results not in int type