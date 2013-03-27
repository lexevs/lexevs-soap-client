/**
 * CodingSchemeVersion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.versions;

public class CodingSchemeVersion  extends org.LexGrid.versions.EntityVersion  implements java.io.Serializable {
    public CodingSchemeVersion() {
    }

    public CodingSchemeVersion(
           java.lang.Object parent,
           org.LexGrid.commonTypes.EntityDescription entityDescription,
           boolean valid,
           org.LexGrid.commonTypes.Text changeDocumentation,
           org.LexGrid.commonTypes.Text changeInstructions,
           java.util.Calendar effectiveDate,
           java.lang.Boolean isComplete,
           java.lang.String releaseURN,
           java.lang.String version,
           java.util.Calendar versionDate,
           java.lang.Long versionOrder) {
        super(
            parent,
            entityDescription,
            valid,
            changeDocumentation,
            changeInstructions,
            effectiveDate,
            isComplete,
            releaseURN,
            version,
            versionDate,
            versionOrder);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodingSchemeVersion)) return false;
        CodingSchemeVersion other = (CodingSchemeVersion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodingSchemeVersion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:versions.LexGrid.org", "CodingSchemeVersion"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
