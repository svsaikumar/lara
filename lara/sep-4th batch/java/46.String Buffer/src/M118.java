class M118
{
	public static void main(String[] args) 
	{
		System.out.printf(">>>%1$010d<<<", 12345);
	}
}
//here 010 represents 10 total number of characters in the value
//if there are no enough characters it adds 0's before conent(this works only incase of numbers)
//0 is for padding