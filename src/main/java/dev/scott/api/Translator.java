package dev.scott.api;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.util.JAXBSource;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Translator {


    /**
     *
     * @param object
     * @param fileName
     * @param clazz
     *
     * @return
     *
     * @throws TransformerException
     * @throws JAXBException
     * @throws IOException
     */
    public byte[] translate(final DMO object, final String fileName, final Class clazz) throws TransformerException, JAXBException, IOException {
        //translate

        TransformerFactory factory = TransformerFactory.newInstance();
        InputStream resourceAsStream = Translator.class.getClassLoader().getResourceAsStream(fileName);
        StreamSource xslt = new StreamSource(resourceAsStream);
        Transformer transformer = factory.newTransformer(xslt);

        JAXBContext context = JAXBContext.newInstance(clazz);
        JAXBSource source = new JAXBSource(context, object);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        StreamResult result = new StreamResult(bos);
        transformer.transform(source, result);
        bos.close();
        byte[] bytes = bos.toByteArray();
        String str = new String(bytes);
        return bytes;
    }
}
