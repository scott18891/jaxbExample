<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:xs="http://www.w3.org/1999/XSL/Transform" xmlns:xls="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml" indent="yes"/>
    <xsl:template match="/">
        <root>
            <element>
                <xls:attribute name="field1">
                    <xsl:value-of select='root/fooField1'/>
                </xls:attribute>
                <xls:attribute name="field2">
                    <xsl:value-of select='root/field2'/>
                </xls:attribute>
                <xls:attribute name="field3">
                    <xsl:value-of select='root/field3'/>
                </xls:attribute>
                <xls:attribute name="field4">
                    <xsl:value-of select='root/field4'/>
                </xls:attribute>
                <xls:attribute name="field5">
                    <xsl:value-of select='root/field5'/>
                </xls:attribute>
            </element>
        </root>
    </xsl:template>
</xsl:stylesheet>
