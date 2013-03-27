/**
 * SupportedAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.naming;

public class SupportedAssociation  extends org.LexGrid.naming.URIMap  implements java.io.Serializable {
    private java.lang.String codingScheme;

    private java.lang.String entityCode;

    private java.lang.String entityCodeNamespace;

    public SupportedAssociation() {
    }

    public SupportedAssociation(
           java.lang.Object parent,
           java.lang.String content,
           java.lang.String localId,
           java.lang.String uri,
           boolean valid,
           java.lang.String codingScheme,
           java.lang.String entityCode,
           java.lang.String entityCodeNamespace) {
        super(
            parent,
            content,
            localId,
            uri,
            valid);
        this.codingScheme = codingScheme;
        this.entityCode = entityCode;
        this.entityCodeNamespace = entityCodeNamespace;
    }


    /**
     * Gets the codingScheme value for this SupportedAssociation.
     * 
     * @return codingScheme
     */
    public java.lang.String getCodingScheme() {
        return codingScheme;
    }


    /**
     * Sets the codingScheme value for this SupportedAssociation.
     * 
     * @param codingScheme
     */
    public void setCodingScheme(java.lang.String codingScheme) {
        this.codingScheme = codingScheme;
    }


    /**
     * Gets the entityCode value for this SupportedAssociation.
     * 
     * @return entityCode
     */
    public java.lang.String getEntityCode() {
        return entityCode;
    }


    /**
     * Sets the entityCode value for this SupportedAssociation.
     * 
     * @param entityCode
     */
    public void setEntityCode(java.lang.String entityCode) {
        this.entityCode = entityCode;
    }


    /**
     * Gets the entityCodeNamespace value for this SupportedAssociation.
     * 
     * @return entityCodeNamespace
     */
    public java.lang.String getEntityCodeNamespace() {
        return entityCodeNamespace;
    }


    /**
     * Sets the entityCodeNamespace value for this SupportedAssociation.
     * 
     * @param entityCodeNamespace
     */
    public void setEntityCodeNamespace(java.lang.String entityCodeNamespace) {
        this.entityCodeNamespace = entityCodeNamespace;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupportedAssociation)) return false;
        SupportedAssociation other = (SupportedAssociation) obj;
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
            ((this.entityCode==null && other.getEntityCode()==null) || 
             (this.entityCode!=null &&
              this.entityCode.equals(other.getEntityCode()))) &&
            ((this.entityCodeNamespace==null && other.getEntityCodeNamespace()==null) || 
             (this.entityCodeNamespace!=null &&
              this.entityCodeNamespace.equals(other.getEntityCodeNamespace())));
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
        if (getEntityCode() != null) {
            _hashCode += getEntityCode().hashCode();
        }
        if (getEntityCodeNamespace() != null) {
            _hashCode += getEntityCodeNamespace().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupportedAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:naming.LexGrid.org", "SupportedAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codingScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codingScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityCodeNamespace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityCodeNamespace"));
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
