/**
 * AssociationTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.relations;

public class AssociationTarget  extends org.LexGrid.relations.AssociatableElement  implements java.io.Serializable {
    private java.lang.String targetEntityCode;

    private java.lang.String targetEntityCodeNamespace;

    public AssociationTarget() {
    }

    public AssociationTarget(
           java.lang.Object parent,
           java.util.Calendar effectiveDate,
           org.LexGrid.versions.EntryState entryState,
           java.util.Calendar expirationDate,
           java.lang.Boolean isActive,
           java.lang.String owner,
           java.lang.String status,
           boolean valid,
           java.lang.String associationInstanceId,
           org.LexGrid.relations.AssociationQualification[] associationQualification,
           java.lang.Object[] associationQualificationAsReference,
           int associationQualificationCount,
           java.lang.Boolean isDefining,
           java.lang.Boolean isInferred,
           java.lang.String[] usageContext,
           java.lang.Object[] usageContextAsReference,
           int usageContextCount,
           java.lang.String targetEntityCode,
           java.lang.String targetEntityCodeNamespace) {
        super(
            parent,
            effectiveDate,
            entryState,
            expirationDate,
            isActive,
            owner,
            status,
            valid,
            associationInstanceId,
            associationQualification,
            associationQualificationAsReference,
            associationQualificationCount,
            isDefining,
            isInferred,
            usageContext,
            usageContextAsReference,
            usageContextCount);
        this.targetEntityCode = targetEntityCode;
        this.targetEntityCodeNamespace = targetEntityCodeNamespace;
    }


    /**
     * Gets the targetEntityCode value for this AssociationTarget.
     * 
     * @return targetEntityCode
     */
    public java.lang.String getTargetEntityCode() {
        return targetEntityCode;
    }


    /**
     * Sets the targetEntityCode value for this AssociationTarget.
     * 
     * @param targetEntityCode
     */
    public void setTargetEntityCode(java.lang.String targetEntityCode) {
        this.targetEntityCode = targetEntityCode;
    }


    /**
     * Gets the targetEntityCodeNamespace value for this AssociationTarget.
     * 
     * @return targetEntityCodeNamespace
     */
    public java.lang.String getTargetEntityCodeNamespace() {
        return targetEntityCodeNamespace;
    }


    /**
     * Sets the targetEntityCodeNamespace value for this AssociationTarget.
     * 
     * @param targetEntityCodeNamespace
     */
    public void setTargetEntityCodeNamespace(java.lang.String targetEntityCodeNamespace) {
        this.targetEntityCodeNamespace = targetEntityCodeNamespace;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssociationTarget)) return false;
        AssociationTarget other = (AssociationTarget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.targetEntityCode==null && other.getTargetEntityCode()==null) || 
             (this.targetEntityCode!=null &&
              this.targetEntityCode.equals(other.getTargetEntityCode()))) &&
            ((this.targetEntityCodeNamespace==null && other.getTargetEntityCodeNamespace()==null) || 
             (this.targetEntityCodeNamespace!=null &&
              this.targetEntityCodeNamespace.equals(other.getTargetEntityCodeNamespace())));
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
        if (getTargetEntityCode() != null) {
            _hashCode += getTargetEntityCode().hashCode();
        }
        if (getTargetEntityCodeNamespace() != null) {
            _hashCode += getTargetEntityCodeNamespace().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssociationTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relations.LexGrid.org", "AssociationTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetEntityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetEntityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetEntityCodeNamespace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetEntityCodeNamespace"));
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
