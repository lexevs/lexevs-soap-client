/**
 * AssociationData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.relations;

public class AssociationData  extends org.LexGrid.relations.AssociatableElement  implements java.io.Serializable {
    private org.LexGrid.commonTypes.Text associationDataText;

    public AssociationData() {
    }

    public AssociationData(
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
           org.LexGrid.commonTypes.Text associationDataText) {
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
        this.associationDataText = associationDataText;
    }


    /**
     * Gets the associationDataText value for this AssociationData.
     * 
     * @return associationDataText
     */
    public org.LexGrid.commonTypes.Text getAssociationDataText() {
        return associationDataText;
    }


    /**
     * Sets the associationDataText value for this AssociationData.
     * 
     * @param associationDataText
     */
    public void setAssociationDataText(org.LexGrid.commonTypes.Text associationDataText) {
        this.associationDataText = associationDataText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssociationData)) return false;
        AssociationData other = (AssociationData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.associationDataText==null && other.getAssociationDataText()==null) || 
             (this.associationDataText!=null &&
              this.associationDataText.equals(other.getAssociationDataText())));
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
        if (getAssociationDataText() != null) {
            _hashCode += getAssociationDataText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssociationData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relations.LexGrid.org", "AssociationData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationDataText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associationDataText"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:commonTypes.LexGrid.org", "Text"));
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
