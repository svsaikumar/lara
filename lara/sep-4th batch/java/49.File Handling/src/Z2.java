import java.io.*;
class Z2 
{
	public static void main(String[] args) throws IOException
	{


		FileReader fin = new FileReader("data4.txt");
		BufferedReader bin = new BufferedReader(fin);
		String s1 = bin.readLine();
		while(s1 != null)
		{
			System.out.println(s1);
			s1 = bin.readLine();
		}
		bin.close();
		fin.close();
	}
}