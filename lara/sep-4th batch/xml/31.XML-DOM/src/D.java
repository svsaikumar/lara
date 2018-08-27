import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;
class D
{
	public static void main(String[] args) throws Exception
	{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse("books1.xml");

		Element root  =  doc.getDocumentElement();
		NodeList list = root.getElementsByTagName("book");
		if(list != null && list.getLength() > 0)
		{
			Element element = null;
			for(int i = 0; i < list.getLength(); i++)
			{
				element = (Element) list.item(i);
				System.out.println(element.getFirstChild().getNodeValue());
			}
		}
		System.out.println("done");
	}
}

	