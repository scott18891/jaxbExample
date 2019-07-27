package dev.scott;

import dev.scott.api.DMO;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="root")
@XmlAccessorType(XmlAccessType.FIELD)
public class FooDmo extends DMO {

    private String fooField1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;
    private FooDmo(){
        super();
        //Needed for Jaxb
    }

    public FooDmo(final String filename, final String fooField1, final String field2, final String field3, final String field4, final String field5) {
        super(filename);
        this.fooField1 = fooField1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
        this.field5 = field5;
    }

    public String getField3() {
        return field3;
    }

    public String getField4() {
        return field4;
    }

    public String getField5() {
        return field5;
    }

    public String getField2() {
        return field2;
    }

    public String getFooField1() {
        return fooField1;
    }
}
