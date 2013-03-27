/**
 * AssociatableElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.relations;

public class AssociatableElement  extends org.LexGrid.commonTypes.Versionable  implements java.io.Serializable {
    private java.lang.String associationInstanceId;

    private org.LexGrid.relations.AssociationQualification[] associationQualification;

    private java.lang.Object[] associationQualificationAsReference;

    private int associationQualificationCount;

    private java.lang.Boolean isDefining;

    private java.lang.Boolean isInferred;

    private java.lang.String[] usageContext;

    private java.lang.Object[] usageContextAsReference;

    private int usageContextCount;

    public AssociatableElement() {
    }

    public AssociatableElement(
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
           int usageContextCount) {
        super(
            parent,
            effectiveDate,
            entryState,
            expirationDate,
            isActive,
            owner,
            status,
            valid);
        this.associationInstanceId = associationInstanceId;
        this.associationQualification = associationQualification;
        this.associationQualificationAsReference = associationQualificationAsReference;
        this.associationQualificationCount = associationQualificationCount;
        this.isDefining = isDefining;
        this.isInferred = isInferred;
        this.usageContext = usageContext;
        this.usageContextAsReference = usageContextAsReference;
        this.usageContextCount = usageContextCount;
    }


    /**
     * Gets the associationInstanceId value for this AssociatableElement.
     * 
     * @return associationInstanceId
     */
    public java.lang.String getAssociationInstanceId() {
        return associationInstanceId;
    }


    /**
     * Sets the associationInstanceId value for this AssociatableElement.
     * 
     * @param associationInstanceId
     */
    public void setAssociationInstanceId(java.lang.String associationInstanceId) {
        this.associationInstanceId = associationInstanceId;
    }


    /**
     * Gets the associationQualification value for this AssociatableElement.
     * 
     * @return associationQualification
     */
    public org.LexGrid.relations.AssociationQualification[] getAssociationQualification() {
        return associationQualification;
    }


    /**
     * Sets the associationQualification value for this AssociatableElement.
     * 
     * @param associationQualification
     */
    public void setAssociationQualification(org.LexGrid.relations.AssociationQualification[] associationQualification) {
        this.associationQualification = associationQualification;
    }

    public org.LexGrid.relations.AssociationQualification getAssociationQualification(int i) {
        return this.associationQualification[i];
    }

    public void setAssociationQualification(int i, org.LexGrid.relations.AssociationQualification _value) {
        this.associationQualification[i] = _value;
    }


    /**
     * Gets the associationQualificationAsReference value for this AssociatableElement.
     * 
     * @return associationQualificationAsReference
     */
    public java.lang.Object[] getAssociationQualificationAsReference() {
        return associationQualificationAsReference;
    }


    /**
     * Sets the associationQualificationAsReference value for this AssociatableElement.
     * 
     * @param associationQualificationAsReference
     */
    public void setAssociationQualificationAsReference(java.lang.Object[] associationQualificationAsReference) {
        this.associationQualificationAsReference = associationQualificationAsReference;
    }


    /**
     * Gets the associationQualificationCount value for this AssociatableElement.
     * 
     * @return associationQualificationCount
     */
    public int getAssociationQualificationCount() {
        return associationQualificationCount;
    }


    /**
     * Sets the associationQualificationCount value for this AssociatableElement.
     * 
     * @param associationQualificationCount
     */
    public void setAssociationQualificationCount(int associationQualificationCount) {
        this.associationQualificationCount = associationQualificationCount;
    }


    /**
     * Gets the isDefining value for this AssociatableElement.
     * 
     * @return isDefining
     */
    public java.lang.Boolean getIsDefining() {
        return isDefining;
    }


    /**
     * Sets the isDefining value for this AssociatableElement.
     * 
     * @param isDefining
     */
    public void setIsDefining(java.lang.Boolean isDefining) {
        this.isDefining = isDefining;
    }


    /**
     * Gets the isInferred value for this AssociatableElement.
     * 
     * @return isInferred
     */
    public java.lang.Boolean getIsInferred() {
        return isInferred;
    }


    /**
     * Sets the isInferred value for this AssociatableElement.
     * 
     * @param isInferred
     */
    public void setIsInferred(java.lang.Boolean isInferred) {
        this.isInferred = isInferred;
    }


    /**
     * Gets the usageContext value for this AssociatableElement.
     * 
     * @return usageContext
     */
    public java.lang.String[] getUsageContext() {
        return usageContext;
    }


    /**
     * Sets the usageContext value for this AssociatableElement.
     * 
     * @param usageContext
     */
    public void setUsageContext(java.lang.String[] usageContext) {
        this.usageContext = usageContext;
    }

    public java.lang.String getUsageContext(int i) {
        return this.usageContext[i];
    }

    public void setUsageContext(int i, java.lang.String _value) {
        this.usageContext[i] = _value;
    }


    /**
     * Gets the usageContextAsReference value for this AssociatableElement.
     * 
     * @return usageContextAsReference
     */
    public java.lang.Object[] getUsageContextAsReference() {
        return usageContextAsReference;
    }


    /**
     * Sets the usageContextAsReference value for this AssociatableElement.
     * 
     * @param usageContextAsReference
     */
    public void setUsageContextAsReference(java.lang.Object[] usageContextAsReference) {
        this.usageContextAsReference = usageContextAsReference;
    }


    /**
     * Gets the usageContextCount value for this AssociatableElement.
     * 
     * @return usageContextCount
     */
    public int getUsageContextCount() {
        return usageContextCount;
    }


    /**
     * Sets the usageContextCount value for this AssociatableElement.
     * 
     * @param usageContextCount
     */
    public void setUsageContextCount(int usageContextCount) {
        this.usageContextCount = usageContextCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssociatableElement)) return false;
        AssociatableElement other = (AssociatableElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.associationInstanceId==null && other.getAssociationInstanceId()==null) || 
             (this.associationInstanceId!=null &&
              this.associationInstanceId.equals(other.getAssociationInstanceId()))) &&
            ((this.associationQualification==null && other.getAssociationQualification()==null) || 
             (this.associationQualification!=null &&
              java.util.Arrays.equals(this.associationQualification, other.getAssociationQualification()))) &&
            ((this.associationQualificationAsReference==null && other.getAssociationQualificationAsReference()==null) || 
             (this.associationQualificationAsReference!=null &&
              java.util.Arrays.equals(this.associationQualificationAsReference, other.getAssociationQualificationAsReference()))) &&
            this.associationQualificationCount == other.getAssociationQualificationCount() &&
            ((this.isDefining==null && other.getIsDefining()==null) || 
             (this.isDefining!=null &&
              this.isDefining.equals(other.getIsDefining()))) &&
            ((this.isInferred==null && other.getIsInferred()==null) || 
             (this.isInferred!=null &&
              this.isInferred.equals(other.getIsInferred()))) &&
            ((this.usageContext==null && other.getUsageContext()==null) || 
             (this.usageContext!=null &&
              java.util.Arrays.equals(this.usageContext, other.getUsageContext()))) &&
            ((this.usageContextAsReference==null && other.getUsageContextAsReference()==null) || 
             (this.usageContextAsReference!=null &&
              java.util.Arrays.equals(this.usageContextAsReference, other.getUsageContextAsReference()))) &&
            this.usageContextCount == other.getUsageContextCount();
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
        if (getAssociationInstanceId() != null) {
            _hashCode += getAssociationInstanceId().hashCode();
        }
        if (getAssociationQualification() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociationQualification());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssociationQualification(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssociationQualificationAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociationQualificationAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssociationQualificationAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getAssociationQualificationCount();
        if (getIsDefining() != null) {
            _hashCode += getIsDefining().hashCode();
        }
        if (getIsInferred() != null) {
            _hashCode += getIsInferred().hashCode();
        }
        if (getUsageContext() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsageContext());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsageContext(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUsageContextAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsageContextAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsageContextAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getUsageContextCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssociatableElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relations.LexGrid.org", "AssociatableElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationInstanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associationInstanceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationQualification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associationQualification"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relations.LexGrid.org", "AssociationQualification"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationQualificationAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associationQualificationAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationQualificationCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associationQualificationCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefining");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isDefining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInferred");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isInferred"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageContext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usageContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageContextAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usageContextAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageContextCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usageContextCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
