import dev.scott.FooDmo;
import dev.scott.api.DMO;
import dev.scott.api.Translator;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

/**
 * Main
 */
public class Main {


    public static void main(String[] args) throws TransformerException, JAXBException, IOException {
        DMO object = new FooDmo("FooTranslation.xsl", "1", "2", "3",
                "4", "5");
        Translator translator = new Translator();
        byte[] bytes = translator.translate(object, object.getFilename(), object.getClass());
        String str = new String(bytes);
        System.out.println(str);

//        System.out.println(object.getFilename());

    }
}
