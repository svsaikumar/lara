package pack1;
class F 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		int i = 10;
		assert i == 10: ; //error is here as it is 2nd type there should be something(but it is empty here) after colon
		System.out.println(2);
	}
}
//after colon there should be something, it should not be empty