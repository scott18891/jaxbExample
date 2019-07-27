package dev.scott;

import dev.scott.api.DMO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="root")
@XmlAccessorType(XmlAccessType.FIELD)
public class FumDmo extends DMO {

    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;
    private FumDmo(){
        super();
        //Needed for Jaxb
    }

    public FumDmo(final String filename, final String field1, final String field2, final String field3, final String field4, final String field5) {
        super(filename);
        this.field1 = field1;
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

    public String getField1() {
        return field1;
    }
}
