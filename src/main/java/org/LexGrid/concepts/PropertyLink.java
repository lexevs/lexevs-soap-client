/**
 * PropertyLink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.concepts;

public class PropertyLink  extends org.mayo.edu.lgModel.LexGridBase  implements java.io.Serializable {
    private java.lang.String propertyLink;

    private java.lang.String sourceProperty;

    private java.lang.String targetProperty;

    private boolean valid;

    public PropertyLink() {
    }

    public PropertyLink(
           java.lang.Object parent,
           java.lang.String propertyLink,
           java.lang.String sourceProperty,
           java.lang.String targetProperty,
           boolean valid) {
        super(
            parent);
        this.propertyLink = propertyLink;
        this.sourceProperty = sourceProperty;
        this.targetProperty = targetProperty;
        this.valid = valid;
    }


    /**
     * Gets the propertyLink value for this PropertyLink.
     * 
     * @return propertyLink
     */
    public java.lang.String getPropertyLink() {
        return propertyLink;
    }


    /**
     * Sets the propertyLink value for this PropertyLink.
     * 
     * @param propertyLink
     */
    public void setPropertyLink(java.lang.String propertyLink) {
        this.propertyLink = propertyLink;
    }


    /**
     * Gets the sourceProperty value for this PropertyLink.
     * 
     * @return sourceProperty
     */
    public java.lang.String getSourceProperty() {
        return sourceProperty;
    }


    /**
     * Sets the sourceProperty value for this PropertyLink.
     * 
     * @param sourceProperty
     */
    public void setSourceProperty(java.lang.String sourceProperty) {
        this.sourceProperty = sourceProperty;
    }


    /**
     * Gets the targetProperty value for this PropertyLink.
     * 
     * @return targetProperty
     */
    public java.lang.String getTargetProperty() {
        return targetProperty;
    }


    /**
     * Sets the targetProperty value for this PropertyLink.
     * 
     * @param targetProperty
     */
    public void setTargetProperty(java.lang.String targetProperty) {
        this.targetProperty = targetProperty;
    }


    /**
     * Gets the valid value for this PropertyLink.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this PropertyLink.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PropertyLink)) return false;
        PropertyLink other = (PropertyLink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.propertyLink==null && other.getPropertyLink()==null) || 
             (this.propertyLink!=null &&
              this.propertyLink.equals(other.getPropertyLink()))) &&
            ((this.sourceProperty==null && other.getSourceProperty()==null) || 
             (this.sourceProperty!=null &&
              this.sourceProperty.equals(other.getSourceProperty()))) &&
            ((this.targetProperty==null && other.getTargetProperty()==null) || 
             (this.targetProperty!=null &&
              this.targetProperty.equals(other.getTargetProperty()))) &&
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
        if (getPropertyLink() != null) {
            _hashCode += getPropertyLink().hashCode();
        }
        if (getSourceProperty() != null) {
            _hashCode += getSourceProperty().hashCode();
        }
        if (getTargetProperty() != null) {
            _hashCode += getTargetProperty().hashCode();
        }
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PropertyLink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:concepts.LexGrid.org", "PropertyLink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyLink");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetProperty"));
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
