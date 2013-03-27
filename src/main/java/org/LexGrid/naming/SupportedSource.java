/**
 * SupportedSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.naming;

public class SupportedSource  extends org.LexGrid.naming.URIMap  implements java.io.Serializable {
    private java.lang.String assemblyRule;

    public SupportedSource() {
    }

    public SupportedSource(
           java.lang.Object parent,
           java.lang.String content,
           java.lang.String localId,
           java.lang.String uri,
           boolean valid,
           java.lang.String assemblyRule) {
        super(
            parent,
            content,
            localId,
            uri,
            valid);
        this.assemblyRule = assemblyRule;
    }


    /**
     * Gets the assemblyRule value for this SupportedSource.
     * 
     * @return assemblyRule
     */
    public java.lang.String getAssemblyRule() {
        return assemblyRule;
    }


    /**
     * Sets the assemblyRule value for this SupportedSource.
     * 
     * @param assemblyRule
     */
    public void setAssemblyRule(java.lang.String assemblyRule) {
        this.assemblyRule = assemblyRule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupportedSource)) return false;
        SupportedSource other = (SupportedSource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assemblyRule==null && other.getAssemblyRule()==null) || 
             (this.assemblyRule!=null &&
              this.assemblyRule.equals(other.getAssemblyRule())));
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
        if (getAssemblyRule() != null) {
            _hashCode += getAssemblyRule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupportedSource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:naming.LexGrid.org", "SupportedSource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assemblyRule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assemblyRule"));
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
