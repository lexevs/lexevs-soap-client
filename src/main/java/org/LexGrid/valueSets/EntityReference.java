/**
 * EntityReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.valueSets;

public class EntityReference  extends org.mayo.edu.lgModel.LexGridBase  implements java.io.Serializable {
    private java.lang.String entityCode;

    private java.lang.String entityCodeNamespace;

    private java.lang.Boolean leafOnly;

    private java.lang.String referenceAssociation;

    private java.lang.Boolean targetToSource;

    private java.lang.Boolean transitiveClosure;

    private boolean valid;

    public EntityReference() {
    }

    public EntityReference(
           java.lang.Object parent,
           java.lang.String entityCode,
           java.lang.String entityCodeNamespace,
           java.lang.Boolean leafOnly,
           java.lang.String referenceAssociation,
           java.lang.Boolean targetToSource,
           java.lang.Boolean transitiveClosure,
           boolean valid) {
        super(
            parent);
        this.entityCode = entityCode;
        this.entityCodeNamespace = entityCodeNamespace;
        this.leafOnly = leafOnly;
        this.referenceAssociation = referenceAssociation;
        this.targetToSource = targetToSource;
        this.transitiveClosure = transitiveClosure;
        this.valid = valid;
    }


    /**
     * Gets the entityCode value for this EntityReference.
     * 
     * @return entityCode
     */
    public java.lang.String getEntityCode() {
        return entityCode;
    }


    /**
     * Sets the entityCode value for this EntityReference.
     * 
     * @param entityCode
     */
    public void setEntityCode(java.lang.String entityCode) {
        this.entityCode = entityCode;
    }


    /**
     * Gets the entityCodeNamespace value for this EntityReference.
     * 
     * @return entityCodeNamespace
     */
    public java.lang.String getEntityCodeNamespace() {
        return entityCodeNamespace;
    }


    /**
     * Sets the entityCodeNamespace value for this EntityReference.
     * 
     * @param entityCodeNamespace
     */
    public void setEntityCodeNamespace(java.lang.String entityCodeNamespace) {
        this.entityCodeNamespace = entityCodeNamespace;
    }


    /**
     * Gets the leafOnly value for this EntityReference.
     * 
     * @return leafOnly
     */
    public java.lang.Boolean getLeafOnly() {
        return leafOnly;
    }


    /**
     * Sets the leafOnly value for this EntityReference.
     * 
     * @param leafOnly
     */
    public void setLeafOnly(java.lang.Boolean leafOnly) {
        this.leafOnly = leafOnly;
    }


    /**
     * Gets the referenceAssociation value for this EntityReference.
     * 
     * @return referenceAssociation
     */
    public java.lang.String getReferenceAssociation() {
        return referenceAssociation;
    }


    /**
     * Sets the referenceAssociation value for this EntityReference.
     * 
     * @param referenceAssociation
     */
    public void setReferenceAssociation(java.lang.String referenceAssociation) {
        this.referenceAssociation = referenceAssociation;
    }


    /**
     * Gets the targetToSource value for this EntityReference.
     * 
     * @return targetToSource
     */
    public java.lang.Boolean getTargetToSource() {
        return targetToSource;
    }


    /**
     * Sets the targetToSource value for this EntityReference.
     * 
     * @param targetToSource
     */
    public void setTargetToSource(java.lang.Boolean targetToSource) {
        this.targetToSource = targetToSource;
    }


    /**
     * Gets the transitiveClosure value for this EntityReference.
     * 
     * @return transitiveClosure
     */
    public java.lang.Boolean getTransitiveClosure() {
        return transitiveClosure;
    }


    /**
     * Sets the transitiveClosure value for this EntityReference.
     * 
     * @param transitiveClosure
     */
    public void setTransitiveClosure(java.lang.Boolean transitiveClosure) {
        this.transitiveClosure = transitiveClosure;
    }


    /**
     * Gets the valid value for this EntityReference.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this EntityReference.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityReference)) return false;
        EntityReference other = (EntityReference) obj;
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
            ((this.leafOnly==null && other.getLeafOnly()==null) || 
             (this.leafOnly!=null &&
              this.leafOnly.equals(other.getLeafOnly()))) &&
            ((this.referenceAssociation==null && other.getReferenceAssociation()==null) || 
             (this.referenceAssociation!=null &&
              this.referenceAssociation.equals(other.getReferenceAssociation()))) &&
            ((this.targetToSource==null && other.getTargetToSource()==null) || 
             (this.targetToSource!=null &&
              this.targetToSource.equals(other.getTargetToSource()))) &&
            ((this.transitiveClosure==null && other.getTransitiveClosure()==null) || 
             (this.transitiveClosure!=null &&
              this.transitiveClosure.equals(other.getTransitiveClosure()))) &&
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
        if (getLeafOnly() != null) {
            _hashCode += getLeafOnly().hashCode();
        }
        if (getReferenceAssociation() != null) {
            _hashCode += getReferenceAssociation().hashCode();
        }
        if (getTargetToSource() != null) {
            _hashCode += getTargetToSource().hashCode();
        }
        if (getTransitiveClosure() != null) {
            _hashCode += getTransitiveClosure().hashCode();
        }
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntityReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "EntityReference"));
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
        elemField.setFieldName("leafOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leafOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceAssociation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceAssociation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetToSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetToSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transitiveClosure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transitiveClosure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
