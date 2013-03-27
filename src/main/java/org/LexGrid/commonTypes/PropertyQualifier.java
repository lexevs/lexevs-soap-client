/**
 * PropertyQualifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.commonTypes;

public class PropertyQualifier  extends org.mayo.edu.lgModel.LexGridBase  implements java.io.Serializable {
    private java.lang.String propertyQualifierName;

    private java.lang.String propertyQualifierType;

    private boolean valid;

    private org.LexGrid.commonTypes.Text value;

    public PropertyQualifier() {
    }

    public PropertyQualifier(
           java.lang.Object parent,
           java.lang.String propertyQualifierName,
           java.lang.String propertyQualifierType,
           boolean valid,
           org.LexGrid.commonTypes.Text value) {
        super(
            parent);
        this.propertyQualifierName = propertyQualifierName;
        this.propertyQualifierType = propertyQualifierType;
        this.valid = valid;
        this.value = value;
    }


    /**
     * Gets the propertyQualifierName value for this PropertyQualifier.
     * 
     * @return propertyQualifierName
     */
    public java.lang.String getPropertyQualifierName() {
        return propertyQualifierName;
    }


    /**
     * Sets the propertyQualifierName value for this PropertyQualifier.
     * 
     * @param propertyQualifierName
     */
    public void setPropertyQualifierName(java.lang.String propertyQualifierName) {
        this.propertyQualifierName = propertyQualifierName;
    }


    /**
     * Gets the propertyQualifierType value for this PropertyQualifier.
     * 
     * @return propertyQualifierType
     */
    public java.lang.String getPropertyQualifierType() {
        return propertyQualifierType;
    }


    /**
     * Sets the propertyQualifierType value for this PropertyQualifier.
     * 
     * @param propertyQualifierType
     */
    public void setPropertyQualifierType(java.lang.String propertyQualifierType) {
        this.propertyQualifierType = propertyQualifierType;
    }


    /**
     * Gets the valid value for this PropertyQualifier.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this PropertyQualifier.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }


    /**
     * Gets the value value for this PropertyQualifier.
     * 
     * @return value
     */
    public org.LexGrid.commonTypes.Text getValue() {
        return value;
    }


    /**
     * Sets the value value for this PropertyQualifier.
     * 
     * @param value
     */
    public void setValue(org.LexGrid.commonTypes.Text value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PropertyQualifier)) return false;
        PropertyQualifier other = (PropertyQualifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.propertyQualifierName==null && other.getPropertyQualifierName()==null) || 
             (this.propertyQualifierName!=null &&
              this.propertyQualifierName.equals(other.getPropertyQualifierName()))) &&
            ((this.propertyQualifierType==null && other.getPropertyQualifierType()==null) || 
             (this.propertyQualifierType!=null &&
              this.propertyQualifierType.equals(other.getPropertyQualifierType()))) &&
            this.valid == other.isValid() &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getPropertyQualifierName() != null) {
            _hashCode += getPropertyQualifierName().hashCode();
        }
        if (getPropertyQualifierType() != null) {
            _hashCode += getPropertyQualifierType().hashCode();
        }
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PropertyQualifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:commonTypes.LexGrid.org", "PropertyQualifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyQualifierName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyQualifierName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyQualifierType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyQualifierType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:commonTypes.LexGrid.org", "Text"));
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
