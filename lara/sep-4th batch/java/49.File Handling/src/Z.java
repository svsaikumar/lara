import java.io.*;
class Z 
{
	public static void main(String[] args)
	{
		FileWriter out = null;
		BufferedWriter bout = null;
		try
		{
			out = new FileWriter("data4.txt", true);
			bout = new BufferedWriter(out);
			bout.write("Hello to all");
			bout.newLine();
			bout.write("Hello to all");
			bout.write("Hello to all");
			bout.newLine();
			bout.write("Hello to all");	
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(bout != null)
				{
					bout.flush();
					bout.close();
					bout = null;//now bout is eligible for garbage collection
				}
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
			try
			{
				if(out != null)
				{
					out.close();
					out = null;//now out is eligible for garbage collection
				}
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("done");
	}
}
//avoiding throws here and using try catch
//the resuurces which are opened in try should be closed explicitly and separately(in each try)