/**
 * TsAnyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.builtins;

public class TsAnyType  extends org.mayo.edu.lgModel.LexGridBase  implements java.io.Serializable {
    private java.lang.Object[] anyObject;

    private java.lang.Object[] anyObjectAsReference;

    private int anyObjectCount;

    private java.lang.String content;

    private boolean valid;

    public TsAnyType() {
    }

    public TsAnyType(
           java.lang.Object parent,
           java.lang.Object[] anyObject,
           java.lang.Object[] anyObjectAsReference,
           int anyObjectCount,
           java.lang.String content,
           boolean valid) {
        super(
            parent);
        this.anyObject = anyObject;
        this.anyObjectAsReference = anyObjectAsReference;
        this.anyObjectCount = anyObjectCount;
        this.content = content;
        this.valid = valid;
    }


    /**
     * Gets the anyObject value for this TsAnyType.
     * 
     * @return anyObject
     */
    public java.lang.Object[] getAnyObject() {
        return anyObject;
    }


    /**
     * Sets the anyObject value for this TsAnyType.
     * 
     * @param anyObject
     */
    public void setAnyObject(java.lang.Object[] anyObject) {
        this.anyObject = anyObject;
    }

    public java.lang.Object getAnyObject(int i) {
        return this.anyObject[i];
    }

    public void setAnyObject(int i, java.lang.Object _value) {
        this.anyObject[i] = _value;
    }


    /**
     * Gets the anyObjectAsReference value for this TsAnyType.
     * 
     * @return anyObjectAsReference
     */
    public java.lang.Object[] getAnyObjectAsReference() {
        return anyObjectAsReference;
    }


    /**
     * Sets the anyObjectAsReference value for this TsAnyType.
     * 
     * @param anyObjectAsReference
     */
    public void setAnyObjectAsReference(java.lang.Object[] anyObjectAsReference) {
        this.anyObjectAsReference = anyObjectAsReference;
    }


    /**
     * Gets the anyObjectCount value for this TsAnyType.
     * 
     * @return anyObjectCount
     */
    public int getAnyObjectCount() {
        return anyObjectCount;
    }


    /**
     * Sets the anyObjectCount value for this TsAnyType.
     * 
     * @param anyObjectCount
     */
    public void setAnyObjectCount(int anyObjectCount) {
        this.anyObjectCount = anyObjectCount;
    }


    /**
     * Gets the content value for this TsAnyType.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this TsAnyType.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the valid value for this TsAnyType.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this TsAnyType.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TsAnyType)) return false;
        TsAnyType other = (TsAnyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.anyObject==null && other.getAnyObject()==null) || 
             (this.anyObject!=null &&
              java.util.Arrays.equals(this.anyObject, other.getAnyObject()))) &&
            ((this.anyObjectAsReference==null && other.getAnyObjectAsReference()==null) || 
             (this.anyObjectAsReference!=null &&
              java.util.Arrays.equals(this.anyObjectAsReference, other.getAnyObjectAsReference()))) &&
            this.anyObjectCount == other.getAnyObjectCount() &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
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
        if (getAnyObject() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnyObject());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnyObject(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAnyObjectAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnyObjectAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnyObjectAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getAnyObjectCount();
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TsAnyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:builtins.LexGrid.org", "TsAnyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anyObject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anyObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anyObjectAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anyObjectAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anyObjectCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anyObjectCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
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
