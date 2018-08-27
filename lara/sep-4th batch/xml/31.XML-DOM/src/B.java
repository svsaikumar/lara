import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import com.sun.org.apache.xml.internal.serialize.*;
class B 
{
	public static void main(String[] args) throws Exception
	{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.newDocument();//above 3 are predefined steps in DOM

		Element root    =  doc.createElement("books");
		Element child1  =  doc.createElement("book");
		Element child11 =  doc.createElement("title");
		Element child12 =  doc.createElement("author");
		Element child13 =  doc.createElement("price");

		Text t1 = doc.createTextNode("xml made easy");
		Text t2 = doc.createTextNode("prince");
		Text t3 = doc.createTextNode("500");

		child11.appendChild(t1);
		child12.appendChild(t2);
		child13.appendChild(t3);

		child1.appendChild(child11);
		child1.appendChild(child12);
		child1.appendChild(child13);

		root.appendChild(child1);
//================

		Element child2  =  doc.createElement("book");
		Element child21 =  doc.createElement("title");
		Element child22 =  doc.createElement("author");
		Element child23 =  doc.createElement("price");

		Text t4 = doc.createTextNode("spring made easy");
		Text t5 = doc.createTextNode("hero");
		Text t6 = doc.createTextNode("1500");

		child21.appendChild(t4);
		child22.appendChild(t5);
		child23.appendChild(t6);

		child2.appendChild(child21);
		child2.appendChild(child22);
		child2.appendChild(child23);

		root.appendChild(child2);
		doc.appendChild(root);


		OutputFormat format = new OutputFormat(doc);
		format.setIndenting(true);
		File f1 = new File("books2.xml");
		FileOutputStream fout = new FileOutputStream(f1);
		XMLSerializer serializer = new	XMLSerializer(fout, format);
		serializer.serialize(doc);

		System.out.println("done");
	}
}
