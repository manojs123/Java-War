package javaTasks;

import java.io.File;
import java.io.IOException;

import javax.lang.model.element.Element;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*public class ReadingJsonfile
{
   public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException
   {
      //Get Document Builder
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
       
      //Build Document
      Document document = (Document) builder.parse(new File("/home/manoj/Desktop/ebay.xml"));
       
      //Normalize the XML Structure; It's just too important !!
      ((Node) document.getDefaultRootElement()).normalize();
       
      //Here comes the root node
      Element root = (Element) document.getDefaultRootElement();
      System.out.println(root.getSimpleName());
       
      //Get all employees
      NodeList nList = ((org.w3c.dom.Document) document).getElementsByTagName("root");
      System.out.println("============================");
       
      visitChildNodes(nList);
   }
 
   //This function is called recursively
   private static void visitChildNodes(NodeList nList)
   {
      for (int temp = 0; temp < nList.getLength(); temp++)
      {
         Node node = nList.item(temp);
         if (node.getNodeType() == Node.ELEMENT_NODE)
         {
            System.out.println("Node Name = " + node.getNodeName() + "; Value = " + node.getTextContent());
            //Check all attributes
            if (node.hasAttributes()) {
               // get attributes names and values
               NamedNodeMap nodeMap = node.getAttributes();
               for (int i = 0; i < nodeMap.getLength(); i++)
               {
                   Node tempNode = nodeMap.item(i);
                   System.out.println("Attr name : " + tempNode.getNodeName()+ "; Value = " + tempNode.getNodeValue());
               }
               if (node.hasChildNodes()) {
                  //We got more childs; Let's visit them as well
                  visitChildNodes(node.getChildNodes());
               }
           }
         }
      }
   }
}
*/

public class ReadingxmlFile {

	public static void main(String[] args) {

		// create a new DocumentBuilderFactory
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {
			// use the factory to create a documentbuilder
			DocumentBuilder builder = factory.newDocumentBuilder();

			// create a new document from file
			File file = new File("/home/manoj/Desktop/ebay.xml");
			org.w3c.dom.Document doc = builder.parse(file);

			// get the first element
			org.w3c.dom.Element element = ((org.w3c.dom.Document) doc).getDocumentElement();

			// get all child nodes
			NodeList nodes = ((Node) element).getChildNodes();

			// print the text content of each child
			for (int i = 0; i < nodes.getLength(); i++) {
				System.out.println("" + nodes.item(i).getTextContent());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
