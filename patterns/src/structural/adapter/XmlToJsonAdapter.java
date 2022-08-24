package structural.adapter;

import com.google.gson.Gson;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

public class XmlToJsonAdapter {

    public static String convertToJSON() throws IOException, SAXException, ParserConfigurationException {

        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse(new File("patterns/src/structural/adapter/example.xml"));
        doc.getDocumentElement().normalize();
        NodeList listNode = doc.getElementsByTagName("tutorial").item(0).getChildNodes();
        Hashtable<String, String> hashMap = new Hashtable<>();
        for(int r=0; r<listNode.getLength(); r++){
            Node node = listNode.item(r);
            if(node.getTextContent() != null){
                hashMap.put(node.getNodeName(), node.getTextContent());
            }
        }
        Gson gson = new Gson();
        return gson.toJson(hashMap);
    }

}
