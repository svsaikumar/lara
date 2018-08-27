import java.io.*;
class W
{
	public static void main(String[] args)
	{
		File f1 = new File("data3.txt");
		char[] chars = new char[(int) f1.length()];
		FileReader fin = null;//initialize in try ,use in try and close in final
		try
		{
			fin = new FileReader(f1);
			fin.read(chars);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(fin != null)
				{
					fin.close();
					fin = null;// here we are making 'fin' eigible for garbage collector by assigninh a null value
				}
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
		String s1 = new String(chars);
		System.out.println(s1);
	}
}
//first 2 lines in main method doesn't require IOException(those lines are for just creating)