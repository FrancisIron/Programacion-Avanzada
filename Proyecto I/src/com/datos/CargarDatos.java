package com.datos;

import com.modelo.Colegio;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.File;

public class CargarDatos {

    public Colegio cargarXML()   {
        XStream stream= new XStream(new StaxDriver());
        Colegio colegio =(Colegio) stream.fromXML(new File ("test/archivo.xml"));
        return colegio;
    }
}
