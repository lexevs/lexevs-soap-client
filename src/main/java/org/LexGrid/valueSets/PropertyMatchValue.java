/**
 * PropertyMatchValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.valueSets;

public class PropertyMatchValue  extends org.LexGrid.commonTypes.Text  implements java.io.Serializable {
    private java.lang.String matchAlgorithm;

    public PropertyMatchValue() {
    }

    public PropertyMatchValue(
           java.lang.Object parent,
           java.lang.Object[] anyObject,
           java.lang.Object[] anyObjectAsReference,
           int anyObjectCount,
           java.lang.String content,
           boolean valid,
           java.lang.String dataType,
           java.lang.String matchAlgorithm) {
        super(
            parent,
            anyObject,
            anyObjectAsReference,
            anyObjectCount,
            content,
            valid,
            dataType);
        this.matchAlgorithm = matchAlgorithm;
    }


    /**
     * Gets the matchAlgorithm value for this PropertyMatchValue.
     * 
     * @return matchAlgorithm
     */
    public java.lang.String getMatchAlgorithm() {
        return matchAlgorithm;
    }


    /**
     * Sets the matchAlgorithm value for this PropertyMatchValue.
     * 
     * @param matchAlgorithm
     */
    public void setMatchAlgorithm(java.lang.String matchAlgorithm) {
        this.matchAlgorithm = matchAlgorithm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PropertyMatchValue)) return false;
        PropertyMatchValue other = (PropertyMatchValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.matchAlgorithm==null && other.getMatchAlgorithm()==null) || 
             (this.matchAlgorithm!=null &&
              this.matchAlgorithm.equals(other.getMatchAlgorithm())));
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
        if (getMatchAlgorithm() != null) {
            _hashCode += getMatchAlgorithm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PropertyMatchValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "PropertyMatchValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchAlgorithm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchAlgorithm"));
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
