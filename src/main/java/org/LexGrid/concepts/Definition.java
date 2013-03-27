/**
 * Definition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.concepts;

public class Definition  extends org.LexGrid.commonTypes.Property  implements java.io.Serializable {
    private java.lang.Boolean isPreferred;

    public Definition() {
    }

    public Definition(
           java.lang.Object parent,
           java.util.Calendar effectiveDate,
           org.LexGrid.versions.EntryState entryState,
           java.util.Calendar expirationDate,
           java.lang.Boolean isActive,
           java.lang.String owner,
           java.lang.String status,
           boolean valid,
           java.lang.String language,
           java.lang.String propertyId,
           java.lang.String propertyName,
           org.LexGrid.commonTypes.PropertyQualifier[] propertyQualifier,
           java.lang.Object[] propertyQualifierAsReference,
           int propertyQualifierCount,
           java.lang.String propertyType,
           org.LexGrid.commonTypes.Source[] source,
           java.lang.Object[] sourceAsReference,
           int sourceCount,
           java.lang.String[] usageContext,
           java.lang.Object[] usageContextAsReference,
           int usageContextCount,
           org.LexGrid.commonTypes.Text value,
           java.lang.Boolean isPreferred) {
        super(
            parent,
            effectiveDate,
            entryState,
            expirationDate,
            isActive,
            owner,
            status,
            valid,
            language,
            propertyId,
            propertyName,
            propertyQualifier,
            propertyQualifierAsReference,
            propertyQualifierCount,
            propertyType,
            source,
            sourceAsReference,
            sourceCount,
            usageContext,
            usageContextAsReference,
            usageContextCount,
            value);
        this.isPreferred = isPreferred;
    }


    /**
     * Gets the isPreferred value for this Definition.
     * 
     * @return isPreferred
     */
    public java.lang.Boolean getIsPreferred() {
        return isPreferred;
    }


    /**
     * Sets the isPreferred value for this Definition.
     * 
     * @param isPreferred
     */
    public void setIsPreferred(java.lang.Boolean isPreferred) {
        this.isPreferred = isPreferred;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Definition)) return false;
        Definition other = (Definition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.isPreferred==null && other.getIsPreferred()==null) || 
             (this.isPreferred!=null &&
              this.isPreferred.equals(other.getIsPreferred())));
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
        if (getIsPreferred() != null) {
            _hashCode += getIsPreferred().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Definition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:concepts.LexGrid.org", "Definition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPreferred");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isPreferred"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
