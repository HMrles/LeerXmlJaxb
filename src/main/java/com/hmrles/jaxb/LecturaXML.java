package com.hmrles.jaxb;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author HMrles
 */
public class LecturaXML {
    
    public static void main(String...args) throws JAXBException{
        
        JAXBContext context = JAXBContext.newInstance(Libreria.class);
        //xml a Java
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Libreria libreria =(Libreria) unmarshaller.unmarshal(new File("libreria.xml"));
        
        System.out.println(libreria);
    }

}
