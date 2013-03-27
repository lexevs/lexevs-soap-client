/**
 * Properties.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.commonTypes;

public class Properties  extends org.mayo.edu.lgModel.LexGridBase  implements java.io.Serializable {
    private org.LexGrid.commonTypes.Property[] property;

    private java.lang.Object[] propertyAsReference;

    private int propertyCount;

    private boolean valid;

    public Properties() {
    }

    public Properties(
           java.lang.Object parent,
           org.LexGrid.commonTypes.Property[] property,
           java.lang.Object[] propertyAsReference,
           int propertyCount,
           boolean valid) {
        super(
            parent);
        this.property = property;
        this.propertyAsReference = propertyAsReference;
        this.propertyCount = propertyCount;
        this.valid = valid;
    }


    /**
     * Gets the property value for this Properties.
     * 
     * @return property
     */
    public org.LexGrid.commonTypes.Property[] getProperty() {
        return property;
    }


    /**
     * Sets the property value for this Properties.
     * 
     * @param property
     */
    public void setProperty(org.LexGrid.commonTypes.Property[] property) {
        this.property = property;
    }

    public org.LexGrid.commonTypes.Property getProperty(int i) {
        return this.property[i];
    }

    public void setProperty(int i, org.LexGrid.commonTypes.Property _value) {
        this.property[i] = _value;
    }


    /**
     * Gets the propertyAsReference value for this Properties.
     * 
     * @return propertyAsReference
     */
    public java.lang.Object[] getPropertyAsReference() {
        return propertyAsReference;
    }


    /**
     * Sets the propertyAsReference value for this Properties.
     * 
     * @param propertyAsReference
     */
    public void setPropertyAsReference(java.lang.Object[] propertyAsReference) {
        this.propertyAsReference = propertyAsReference;
    }


    /**
     * Gets the propertyCount value for this Properties.
     * 
     * @return propertyCount
     */
    public int getPropertyCount() {
        return propertyCount;
    }


    /**
     * Sets the propertyCount value for this Properties.
     * 
     * @param propertyCount
     */
    public void setPropertyCount(int propertyCount) {
        this.propertyCount = propertyCount;
    }


    /**
     * Gets the valid value for this Properties.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this Properties.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Properties)) return false;
        Properties other = (Properties) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.property==null && other.getProperty()==null) || 
             (this.property!=null &&
              java.util.Arrays.equals(this.property, other.getProperty()))) &&
            ((this.propertyAsReference==null && other.getPropertyAsReference()==null) || 
             (this.propertyAsReference!=null &&
              java.util.Arrays.equals(this.propertyAsReference, other.getPropertyAsReference()))) &&
            this.propertyCount == other.getPropertyCount() &&
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
        if (getProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProperty(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPropertyAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPropertyAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPropertyAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPropertyCount();
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Properties.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:commonTypes.LexGrid.org", "Properties"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("property");
        elemField.setXmlName(new javax.xml.namespace.QName("", "property"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:commonTypes.LexGrid.org", "Property"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
