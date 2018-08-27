import java.io.*;
class Z1 
{
	public static void main(String[] args)
	{
		
		try(FileWriter out = new FileWriter("data4.txt", true);
			BufferedWriter bout = new BufferedWriter(out))
		{
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
		System.out.println("done");
	}
}
//autoresource closing
//any number of resources can be opened in try parantheisi by using semicolon(;) as a separator
//Mainly BufferedWrirter is used to read the content line by line(new line)