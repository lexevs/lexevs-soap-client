/**
 * PickListEntryExclusion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.valueSets;

public class PickListEntryExclusion  extends org.mayo.edu.lgModel.LexGridBase  implements java.io.Serializable {
    private java.lang.String entityCode;

    private java.lang.String entityCodeNamespace;

    private boolean valid;

    public PickListEntryExclusion() {
    }

    public PickListEntryExclusion(
           java.lang.Object parent,
           java.lang.String entityCode,
           java.lang.String entityCodeNamespace,
           boolean valid) {
        super(
            parent);
        this.entityCode = entityCode;
        this.entityCodeNamespace = entityCodeNamespace;
        this.valid = valid;
    }


    /**
     * Gets the entityCode value for this PickListEntryExclusion.
     * 
     * @return entityCode
     */
    public java.lang.String getEntityCode() {
        return entityCode;
    }


    /**
     * Sets the entityCode value for this PickListEntryExclusion.
     * 
     * @param entityCode
     */
    public void setEntityCode(java.lang.String entityCode) {
        this.entityCode = entityCode;
    }


    /**
     * Gets the entityCodeNamespace value for this PickListEntryExclusion.
     * 
     * @return entityCodeNamespace
     */
    public java.lang.String getEntityCodeNamespace() {
        return entityCodeNamespace;
    }


    /**
     * Sets the entityCodeNamespace value for this PickListEntryExclusion.
     * 
     * @param entityCodeNamespace
     */
    public void setEntityCodeNamespace(java.lang.String entityCodeNamespace) {
        this.entityCodeNamespace = entityCodeNamespace;
    }


    /**
     * Gets the valid value for this PickListEntryExclusion.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this PickListEntryExclusion.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PickListEntryExclusion)) return false;
        PickListEntryExclusion other = (PickListEntryExclusion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entityCode==null && other.getEntityCode()==null) || 
             (this.entityCode!=null &&
              this.entityCode.equals(other.getEntityCode()))) &&
            ((this.entityCodeNamespace==null && other.getEntityCodeNamespace()==null) || 
             (this.entityCodeNamespace!=null &&
              this.entityCodeNamespace.equals(other.getEntityCodeNamespace()))) &&
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
        if (getEntityCode() != null) {
            _hashCode += getEntityCode().hashCode();
        }
        if (getEntityCodeNamespace() != null) {
            _hashCode += getEntityCodeNamespace().hashCode();
        }
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PickListEntryExclusion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "PickListEntryExclusion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
