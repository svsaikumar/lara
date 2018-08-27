@FunctionalInterface
interface A
{
	int test(int i, int j);
	int test(int i);
}

class M11
{
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}

//marking our interface as functional interface
//here we get error as functional inteface should not have more than one interface
//we should not mark interface as functional interface if it is having has more than one method