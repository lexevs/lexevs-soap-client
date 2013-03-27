/**
 * CodingSchemes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.codingSchemes;

public class CodingSchemes  extends org.mayo.edu.lgModel.LexGridBase  implements java.io.Serializable {
    private org.LexGrid.codingSchemes.CodingScheme[] codingScheme;

    private java.lang.Object[] codingSchemeAsReference;

    private int codingSchemeCount;

    private boolean valid;

    public CodingSchemes() {
    }

    public CodingSchemes(
           java.lang.Object parent,
           org.LexGrid.codingSchemes.CodingScheme[] codingScheme,
           java.lang.Object[] codingSchemeAsReference,
           int codingSchemeCount,
           boolean valid) {
        super(
            parent);
        this.codingScheme = codingScheme;
        this.codingSchemeAsReference = codingSchemeAsReference;
        this.codingSchemeCount = codingSchemeCount;
        this.valid = valid;
    }


    /**
     * Gets the codingScheme value for this CodingSchemes.
     * 
     * @return codingScheme
     */
    public org.LexGrid.codingSchemes.CodingScheme[] getCodingScheme() {
        return codingScheme;
    }


    /**
     * Sets the codingScheme value for this CodingSchemes.
     * 
     * @param codingScheme
     */
    public void setCodingScheme(org.LexGrid.codingSchemes.CodingScheme[] codingScheme) {
        this.codingScheme = codingScheme;
    }

    public org.LexGrid.codingSchemes.CodingScheme getCodingScheme(int i) {
        return this.codingScheme[i];
    }

    public void setCodingScheme(int i, org.LexGrid.codingSchemes.CodingScheme _value) {
        this.codingScheme[i] = _value;
    }


    /**
     * Gets the codingSchemeAsReference value for this CodingSchemes.
     * 
     * @return codingSchemeAsReference
     */
    public java.lang.Object[] getCodingSchemeAsReference() {
        return codingSchemeAsReference;
    }


    /**
     * Sets the codingSchemeAsReference value for this CodingSchemes.
     * 
     * @param codingSchemeAsReference
     */
    public void setCodingSchemeAsReference(java.lang.Object[] codingSchemeAsReference) {
        this.codingSchemeAsReference = codingSchemeAsReference;
    }


    /**
     * Gets the codingSchemeCount value for this CodingSchemes.
     * 
     * @return codingSchemeCount
     */
    public int getCodingSchemeCount() {
        return codingSchemeCount;
    }


    /**
     * Sets the codingSchemeCount value for this CodingSchemes.
     * 
     * @param codingSchemeCount
     */
    public void setCodingSchemeCount(int codingSchemeCount) {
        this.codingSchemeCount = codingSchemeCount;
    }


    /**
     * Gets the valid value for this CodingSchemes.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this CodingSchemes.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodingSchemes)) return false;
        CodingSchemes other = (CodingSchemes) obj;
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
              java.util.Arrays.equals(this.codingScheme, other.getCodingScheme()))) &&
            ((this.codingSchemeAsReference==null && other.getCodingSchemeAsReference()==null) || 
             (this.codingSchemeAsReference!=null &&
              java.util.Arrays.equals(this.codingSchemeAsReference, other.getCodingSchemeAsReference()))) &&
            this.codingSchemeCount == other.getCodingSchemeCount() &&
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCodingScheme());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCodingScheme(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCodingSchemeAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCodingSchemeAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCodingSchemeAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getCodingSchemeCount();
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodingSchemes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:codingSchemes.LexGrid.org", "CodingSchemes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codingScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codingScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:codingSchemes.LexGrid.org", "CodingScheme"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codingSchemeAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codingSchemeAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codingSchemeCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codingSchemeCount"));
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
