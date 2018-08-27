import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import com.sun.org.apache.xml.internal.serialize.*;
class A 
{
	public static void main(String[] args) throws Exception
	{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.newDocument();
		Element root = doc.createElement("books");
		Element child1 = doc.createElement("book");
		Text t1 = doc.createTextNode("xml book");
		child1.appendChild(t1);
		root.appendChild(child1);
		Element child2 = doc.createElement("book");
		Text t2 = doc.createTextNode("spring book");
		child2.appendChild(t2);
		root.appendChild(child2);
		doc.appendChild(root);


		OutputFormat format = new OutputFormat(doc);
		format.setIndenting(true);
		File f1 = new File("books1.xml");
		FileOutputStream fout = new FileOutputStream(f1);
		XMLSerializer serializer = new	XMLSerializer(fout, format);
		serializer.serialize(doc);
		System.out.println("done");
	}
}
