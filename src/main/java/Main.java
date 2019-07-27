import dev.scott.FeDmo;
import dev.scott.FooDmo;
import dev.scott.api.DMO;
import dev.scott.api.Translator;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class Main {


    public static void main(String[] args) throws TransformerException, JAXBException, IOException {
        final DMO object = new FooDmo("FooTranslation.xsl", "1", "2", "3",
                "4", "5");
        final DMO object2 = new FeDmo("FeTranslation.xsl", "fe", "fy", "fo", "fum",
                "uhh");

        final List<DMO> list = new ArrayList<>();
        list.add(object);
        list.add(object2);

        for (DMO dmo : list) {
            Translator translator = new Translator();
            byte[] bytes = translator.translate(dmo, dmo.getFilename(), dmo.getClass());
            String str = new String(bytes);
            System.out.println(str);
        }
    }
}
