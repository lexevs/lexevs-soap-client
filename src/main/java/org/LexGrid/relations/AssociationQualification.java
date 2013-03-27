/**
 * AssociationQualification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.relations;

public class AssociationQualification  extends org.mayo.edu.lgModel.LexGridBase  implements java.io.Serializable {
    private java.lang.String associationQualifier;

    private org.LexGrid.commonTypes.Text qualifierText;

    private boolean valid;

    public AssociationQualification() {
    }

    public AssociationQualification(
           java.lang.Object parent,
           java.lang.String associationQualifier,
           org.LexGrid.commonTypes.Text qualifierText,
           boolean valid) {
        super(
            parent);
        this.associationQualifier = associationQualifier;
        this.qualifierText = qualifierText;
        this.valid = valid;
    }


    /**
     * Gets the associationQualifier value for this AssociationQualification.
     * 
     * @return associationQualifier
     */
    public java.lang.String getAssociationQualifier() {
        return associationQualifier;
    }


    /**
     * Sets the associationQualifier value for this AssociationQualification.
     * 
     * @param associationQualifier
     */
    public void setAssociationQualifier(java.lang.String associationQualifier) {
        this.associationQualifier = associationQualifier;
    }


    /**
     * Gets the qualifierText value for this AssociationQualification.
     * 
     * @return qualifierText
     */
    public org.LexGrid.commonTypes.Text getQualifierText() {
        return qualifierText;
    }


    /**
     * Sets the qualifierText value for this AssociationQualification.
     * 
     * @param qualifierText
     */
    public void setQualifierText(org.LexGrid.commonTypes.Text qualifierText) {
        this.qualifierText = qualifierText;
    }


    /**
     * Gets the valid value for this AssociationQualification.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this AssociationQualification.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssociationQualification)) return false;
        AssociationQualification other = (AssociationQualification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.associationQualifier==null && other.getAssociationQualifier()==null) || 
             (this.associationQualifier!=null &&
              this.associationQualifier.equals(other.getAssociationQualifier()))) &&
            ((this.qualifierText==null && other.getQualifierText()==null) || 
             (this.qualifierText!=null &&
              this.qualifierText.equals(other.getQualifierText()))) &&
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
        if (getAssociationQualifier() != null) {
            _hashCode += getAssociationQualifier().hashCode();
        }
        if (getQualifierText() != null) {
            _hashCode += getQualifierText().hashCode();
        }
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssociationQualification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relations.LexGrid.org", "AssociationQualification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationQualifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associationQualifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualifierText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qualifierText"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:commonTypes.LexGrid.org", "Text"));
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
