package dataparsing;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class XMLParsing 
{
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	private static final String FILE_HEADER = "SellerName,SellerRating,PaymentTypes,ShippingInfo,CurrentBid,TimeLeft,BidderName,BidderRating,Description";
 
	public static void writeCsvFile() throws IOException{  
	ArrayList<XMLClass> list = new ArrayList<XMLClass>();
	try {

	File fXmlFile = new File("/home/manoj/Desktop/ebay.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);

	//optional, but recommended
	//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
	doc.getDocumentElement().normalize();

	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

	NodeList nList = doc.getElementsByTagName("listing");

	System.out.println("----------------------------");

	for (int temp = 0; temp < nList.getLength(); temp++) {

		Node nNode = nList.item(temp);

		System.out.println("\nCurrent Element :" + nNode.getNodeName());

		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

			Element eElement = (Element) nNode;
			
			XMLClass xc=new XMLClass(eElement.getElementsByTagName("seller_name").item(0).getTextContent(),eElement.getElementsByTagName("seller_rating").item(0).getTextContent(),eElement.getElementsByTagName("payment_types").item(0).getTextContent(),eElement.getElementsByTagName("shipping_info").item(0).getTextContent(),eElement.getElementsByTagName("current_bid").item(0).getTextContent(),eElement.getElementsByTagName("time_left").item(0).getTextContent(),eElement.getElementsByTagName("bidder_name").item(0).getTextContent(),eElement.getElementsByTagName("bidder_rating").item(0).getTextContent(),eElement.getElementsByTagName("description").item(0).getTextContent());
			list.add(xc);
			
			//System.out.println("Seller Name : " + eElement.getAttribute("id"));
			/*System.out.println("Seller Name : " + eElement.getElementsByTagName("seller_name").item(0).getTextContent());
			System.out.println("Seller Rating : " + eElement.getElementsByTagName("seller_rating").item(0).getTextContent());
			System.out.println("Payment Types : " + eElement.getElementsByTagName("payment_types").item(0).getTextContent());
			System.out.println("Shipping Info : " + eElement.getElementsByTagName("shipping_info").item(0).getTextContent());
			System.out.println("AUCTION INFO " + eElement.getAttribute("auction_info"));
			System.out.println("Current Bid : " + eElement.getElementsByTagName("current_bid").item(0).getTextContent());
			System.out.println("Time Left : " + eElement.getElementsByTagName("time_left").item(0).getTextContent());
			System.out.println("Bidder Name : " + eElement.getElementsByTagName("bidder_name").item(0).getTextContent());
			System.out.println("Bidder Rating : " + eElement.getElementsByTagName("bidder_rating").item(0).getTextContent());
			System.out.println("Description : " + eElement.getElementsByTagName("description").item(0).getTextContent());
*/
			
		}
	}
    } catch (Exception e) {
	e.printStackTrace();
    }
	FileWriter fileWriter = null;
	
	fileWriter = new FileWriter(new File("/home/manoj/Desktop/ebay.csv"));

	fileWriter.append(FILE_HEADER.toString());
	fileWriter.append(NEW_LINE_SEPARATOR);
	
	for (XMLClass s : list) {
		fileWriter.append("\"" + s.getSellerName() + "\"");
		fileWriter.append(COMMA_DELIMITER);
		fileWriter.append("\"" +s.getSellerRating()+"\"");
		fileWriter.append(COMMA_DELIMITER);
		fileWriter.append("\"" +s.getPaymentTypes()+"\"");
		fileWriter.append(COMMA_DELIMITER);
		fileWriter.append("\"" +s.getShippingInfo()+"\"");
		fileWriter.append(COMMA_DELIMITER);
		fileWriter.append("\"" +s.getCurrentBid()+"\"");
		fileWriter.append(COMMA_DELIMITER);
		fileWriter.append("\"" +s.getTimeLeft()+"\"");
		fileWriter.append(COMMA_DELIMITER);
		fileWriter.append("\"" + s.getBidderName() + "\"");
		fileWriter.append(COMMA_DELIMITER);
		fileWriter.append("\"" +s.getBidderRating()+"\"");
		fileWriter.append(COMMA_DELIMITER);
		fileWriter.append("\"" +s.getDescription()+"\"");
		fileWriter.append(NEW_LINE_SEPARATOR);
	}
	fileWriter.close();
	
  }

public static void main(String argv[]) throws IOException 
{
	XMLParsing.writeCsvFile();
}
	
	
}