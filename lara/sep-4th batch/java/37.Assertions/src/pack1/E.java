//package pack1;
class E 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		int i = 10;
		assert i == 10;//error 
		System.out.println(2);
	}
}
//here we get error because assert is not a data type
//assert statement always should receive a boolean. here it is receiving int value.so we get error