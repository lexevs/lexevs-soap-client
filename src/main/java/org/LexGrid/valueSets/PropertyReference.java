/**
 * PropertyReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.valueSets;

public class PropertyReference  extends org.mayo.edu.lgModel.LexGridBase  implements java.io.Serializable {
    private java.lang.String codingScheme;

    private org.LexGrid.valueSets.PropertyMatchValue propertyMatchValue;

    private java.lang.String propertyName;

    private boolean valid;

    public PropertyReference() {
    }

    public PropertyReference(
           java.lang.Object parent,
           java.lang.String codingScheme,
           org.LexGrid.valueSets.PropertyMatchValue propertyMatchValue,
           java.lang.String propertyName,
           boolean valid) {
        super(
            parent);
        this.codingScheme = codingScheme;
        this.propertyMatchValue = propertyMatchValue;
        this.propertyName = propertyName;
        this.valid = valid;
    }


    /**
     * Gets the codingScheme value for this PropertyReference.
     * 
     * @return codingScheme
     */
    public java.lang.String getCodingScheme() {
        return codingScheme;
    }


    /**
     * Sets the codingScheme value for this PropertyReference.
     * 
     * @param codingScheme
     */
    public void setCodingScheme(java.lang.String codingScheme) {
        this.codingScheme = codingScheme;
    }


    /**
     * Gets the propertyMatchValue value for this PropertyReference.
     * 
     * @return propertyMatchValue
     */
    public org.LexGrid.valueSets.PropertyMatchValue getPropertyMatchValue() {
        return propertyMatchValue;
    }


    /**
     * Sets the propertyMatchValue value for this PropertyReference.
     * 
     * @param propertyMatchValue
     */
    public void setPropertyMatchValue(org.LexGrid.valueSets.PropertyMatchValue propertyMatchValue) {
        this.propertyMatchValue = propertyMatchValue;
    }


    /**
     * Gets the propertyName value for this PropertyReference.
     * 
     * @return propertyName
     */
    public java.lang.String getPropertyName() {
        return propertyName;
    }


    /**
     * Sets the propertyName value for this PropertyReference.
     * 
     * @param propertyName
     */
    public void setPropertyName(java.lang.String propertyName) {
        this.propertyName = propertyName;
    }


    /**
     * Gets the valid value for this PropertyReference.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this PropertyReference.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PropertyReference)) return false;
        PropertyReference other = (PropertyReference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codingScheme==null && other.getCodingScheme()==null) || 
             (this.codingScheme!=null &&
              this.codingScheme.equals(other.getCodingScheme()))) &&
            ((this.propertyMatchValue==null && other.getPropertyMatchValue()==null) || 
             (this.propertyMatchValue!=null &&
              this.propertyMatchValue.equals(other.getPropertyMatchValue()))) &&
            ((this.propertyName==null && other.getPropertyName()==null) || 
             (this.propertyName!=null &&
              this.propertyName.equals(other.getPropertyName()))) &&
            this.valid == other.isValid();
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
        if (getCodingScheme() != null) {
            _hashCode += getCodingScheme().hashCode();
        }
        if (getPropertyMatchValue() != null) {
            _hashCode += getPropertyMatchValue().hashCode();
        }
        if (getPropertyName() != null) {
            _hashCode += getPropertyName().hashCode();
        }
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PropertyReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "PropertyReference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codingScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codingScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyMatchValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyMatchValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "PropertyMatchValue"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
