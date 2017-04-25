package com.datos;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.json.XML;

public class GuardarDatos {

    public void parserXMLtoJSON(Object target) throws IOException, TransformerException {
        XStream parsel = new XStream(new StaxDriver());
        String xml = parsel.toXML(target);
        Path archivo = Paths.get("test/archivo.json");
        Files.write(archivo, XML.toJSONObject(xml).toString().getBytes());
        //System.out.println("XML transformado");
        

    }

    public void parserXML(Object target) throws IOException {
        XStream parsel = new XStream(new StaxDriver());
        String xml = parsel.toXML(target);
        Path archivo = Paths.get("test/archivo.xml");
        Files.write(archivo, xml.getBytes());
        //System.out.println(xml);
    }
}
