/**
 * SupportedProperty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.naming;

public class SupportedProperty  extends org.LexGrid.naming.URIMap  implements java.io.Serializable {
    private java.lang.Object propertyType;

    public SupportedProperty() {
    }

    public SupportedProperty(
           java.lang.Object parent,
           java.lang.String content,
           java.lang.String localId,
           java.lang.String uri,
           boolean valid,
           java.lang.Object propertyType) {
        super(
            parent,
            content,
            localId,
            uri,
            valid);
        this.propertyType = propertyType;
    }


    /**
     * Gets the propertyType value for this SupportedProperty.
     * 
     * @return propertyType
     */
    public java.lang.Object getPropertyType() {
        return propertyType;
    }


    /**
     * Sets the propertyType value for this SupportedProperty.
     * 
     * @param propertyType
     */
    public void setPropertyType(java.lang.Object propertyType) {
        this.propertyType = propertyType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupportedProperty)) return false;
        SupportedProperty other = (SupportedProperty) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.propertyType==null && other.getPropertyType()==null) || 
             (this.propertyType!=null &&
              this.propertyType.equals(other.getPropertyType())));
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
        if (getPropertyType() != null) {
            _hashCode += getPropertyType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupportedProperty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:naming.LexGrid.org", "SupportedProperty"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
