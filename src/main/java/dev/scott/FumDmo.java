package dev.scott;

import dev.scott.api.DMO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="root")
@XmlAccessorType(XmlAccessType.FIELD)
public class FumDmo extends DMO {

    private String fumField1;
    private String fumField2;
    private String fumField3;
    private String fumField4;
    private String fumField5;
    private FumDmo(){
        super();
        //Needed for Jaxb
    }

    public FumDmo(final String filename, final String fumField1, final String fumField2, final String fumField3, final String fumField4, final String fumField5) {
        super(filename);
        this.fumField1 = fumField1;
        this.fumField2 = fumField2;
        this.fumField3 = fumField3;
        this.fumField4 = fumField4;
        this.fumField5 = fumField5;
    }

    public String getFumField3() {
        return fumField3;
    }

    public String getFumField4() {
        return fumField4;
    }

    public String getFumField5() {
        return fumField5;
    }

    public String getFumField2() {
        return fumField2;
    }

    public String getFumField1() {
        return fumField1;
    }
}
