package dev.scott;

import dev.scott.api.DMO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class FeDmo extends DMO {

    private String feField1;
    private String feField2;
    private String feField3;
    private String feField4;
    private String feField5;

    private FeDmo() {
        super();
        //Needed for Jaxb
    }

    public FeDmo(final String filename, final String feField1, final String feField2, final String feField3, final String feField4, final String feField5) {
        super(filename);
        this.feField1 = feField1;
        this.feField2 = feField2;
        this.feField3 = feField3;
        this.feField4 = feField4;
        this.feField5 = feField5;
    }

    public String getFeField3() {
        return feField3;
    }

    public String getFeField4() {
        return feField4;
    }

    public String getFeField5() {
        return feField5;
    }

    public String getFeField2() {
        return feField2;
    }

    public String getFeField1() {
        return feField1;
    }
}
