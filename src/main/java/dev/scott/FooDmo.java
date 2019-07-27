package dev.scott;

import dev.scott.api.DMO;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="root")
@XmlAccessorType(XmlAccessType.FIELD)
public class FooDmo extends DMO {

    private String fooField1;
    private String fooField2;
    private String fooField3;
    private String fooField4;
    private String fooField5;
    private FooDmo(){
        super();
        //Needed for Jaxb
    }

    public FooDmo(final String filename, final String fooField1, final String fooField2, final String fooField3, final String fooField4, final String fooField5) {
        super(filename);
        this.fooField1 = fooField1;
        this.fooField2 = fooField2;
        this.fooField3 = fooField3;
        this.fooField4 = fooField4;
        this.fooField5 = fooField5;
    }

    public String getFooField3() {
        return fooField3;
    }

    public String getFooField4() {
        return fooField4;
    }

    public String getFooField5() {
        return fooField5;
    }

    public String getFooField2() {
        return fooField2;
    }

    public String getFooField1() {
        return fooField1;
    }
}
