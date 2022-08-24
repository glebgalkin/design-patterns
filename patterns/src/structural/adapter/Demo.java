package structural.adapter;

import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {

        System.out.println(XmlToJsonAdapter.convertToJSON());
    }
}
