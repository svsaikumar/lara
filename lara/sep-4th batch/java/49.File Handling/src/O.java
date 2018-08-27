import java.io.*;
class O 
{
	public static void main(String[] args) throws IOException 
	{


		File f1 = new File("data.txt");
		FileWriter out = new FileWriter(f1);
		out.write("Hello to all ");
		out.write("Hello to all ");
		out.write("Hello to all");
		out.flush();
		out.close();
		System.out.println("done");
	}
}
/*in genral there are 2 type of files 

	-character data(text file)
	- binary data
 
	*/
//trying to write the every character in to the file system
//we have to use filewrite to write the character file
//fileReader() is used to read the character file
//Filewriter() and Filereader() are used for character files
// flush() is forcebly writing every character into the filesystem before closing
//while writing the java progaram in characters flush() and close() are mandatory
//once writing is completely got over then flush it and close it
//if we want to write the text in next line we have mention \n explicitly