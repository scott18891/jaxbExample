package dev.scott.api;

import javax.xml.bind.annotation.XmlTransient;

/**
 * Logical representation of object
 */
public abstract class DMO {

    private String filename;

    protected DMO() {
        //for jaxb
    }
    public DMO(final String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return this.filename;
    }

}
