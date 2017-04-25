package xmltoword;
import java.io.File;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
/**
 * Toma un XML y lo transforma en un documento Word
 * @author Francisco Fierro
 */
public class XSLTransformerWord{
    /**
     * Metodo que toma el archivo y lo transforma en un documento Word
     * @param args 
     */
   public static void main(String[] args) {
     try {
       File stylesheet = new File("student_word.xsl");
       File xmlfile = new File("student.xml");
       StreamSource stylesource = new StreamSource(stylesheet);
       StreamSource xmlsource = new StreamSource(xmlfile);
       Transformer transformer = TransformerFactory.newInstance().newTransformer(stylesource);              
       transformer.transform(xmlsource, new StreamResult(new File("word.doc")));
       StreamResult consoleOut = new StreamResult(System.out);
       transformer.transform(xmlsource, consoleOut);
     } catch (TransformerException e) {
              e.printStackTrace();
     }
   }
}