package xmltoexcel;

import java.io.File;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 * Toma un XML y lo transforma en un documento Excel
 * @author Francisco Fierro
 */
public class XSLTransformerExcel {
    /**
     * Metodo que toma el archivo XML y lo transforma en un documento Excel
     * ocupando el .xsl de Bramstein
     * @param args 
     */
    public static void main(String[] args) {
        try {
            File stylesheet = new File("student_excel.xsl");
            File xmlfile = new File("student.xml");
            StreamSource stylesource = new StreamSource(stylesheet);
            StreamSource xmlsource = new StreamSource(xmlfile);
            Transformer transformer = TransformerFactory.newInstance().newTransformer(stylesource);
            transformer.transform(xmlsource, new StreamResult(new File("excel.xls")));
            StreamResult consoleOut = new StreamResult(System.out);
            transformer.transform(xmlsource, consoleOut);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
