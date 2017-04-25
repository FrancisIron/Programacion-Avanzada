package com.datos;

import java.io.File;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class ExportarDatos {

    /**public void exportarExcel(,int t) throws TransformerException {
        String tipo= new String();
        if(){}
        File stylesheet = new File("student_excel.xsl");
        File xmlfile = new File("student.xml");
        StreamSource stylesource = new StreamSource(stylesheet);
        StreamSource xmlsource = new StreamSource(xmlfile);
        Transformer transformer = TransformerFactory.newInstance().newTransformer(stylesource);
        transformer.transform(xmlsource, new StreamResult(new File("excel.xls")));
        StreamResult consoleOut = new StreamResult(System.out);
        transformer.transform(xmlsource, consoleOut);
    }*/
}
