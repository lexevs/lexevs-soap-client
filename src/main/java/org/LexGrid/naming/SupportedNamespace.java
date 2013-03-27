/**
 * SupportedNamespace.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.naming;

public class SupportedNamespace  extends org.LexGrid.naming.URIMap  implements java.io.Serializable {
    private java.lang.String equivalentCodingScheme;

    public SupportedNamespace() {
    }

    public SupportedNamespace(
           java.lang.Object parent,
           java.lang.String content,
           java.lang.String localId,
           java.lang.String uri,
           boolean valid,
           java.lang.String equivalentCodingScheme) {
        super(
            parent,
            content,
            localId,
            uri,
            valid);
        this.equivalentCodingScheme = equivalentCodingScheme;
    }


    /**
     * Gets the equivalentCodingScheme value for this SupportedNamespace.
     * 
     * @return equivalentCodingScheme
     */
    public java.lang.String getEquivalentCodingScheme() {
        return equivalentCodingScheme;
    }


    /**
     * Sets the equivalentCodingScheme value for this SupportedNamespace.
     * 
     * @param equivalentCodingScheme
     */
    public void setEquivalentCodingScheme(java.lang.String equivalentCodingScheme) {
        this.equivalentCodingScheme = equivalentCodingScheme;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupportedNamespace)) return false;
        SupportedNamespace other = (SupportedNamespace) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.equivalentCodingScheme==null && other.getEquivalentCodingScheme()==null) || 
             (this.equivalentCodingScheme!=null &&
              this.equivalentCodingScheme.equals(other.getEquivalentCodingScheme())));
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
        if (getEquivalentCodingScheme() != null) {
            _hashCode += getEquivalentCodingScheme().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupportedNamespace.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:naming.LexGrid.org", "SupportedNamespace"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equivalentCodingScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("", "equivalentCodingScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
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
