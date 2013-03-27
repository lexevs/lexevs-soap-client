/**
 * AssociationSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.relations;

public class AssociationSource  extends org.mayo.edu.lgModel.LexGridBase  implements java.io.Serializable {
    private java.lang.Object choiceValue;

    private java.lang.String sourceEntityCode;

    private java.lang.String sourceEntityCodeNamespace;

    private org.LexGrid.relations.AssociationTarget[] target;

    private java.lang.Object[] targetAsReference;

    private int targetCount;

    private org.LexGrid.relations.AssociationData[] targetData;

    private java.lang.Object[] targetDataAsReference;

    private int targetDataCount;

    private boolean valid;

    public AssociationSource() {
    }

    public AssociationSource(
           java.lang.Object parent,
           java.lang.Object choiceValue,
           java.lang.String sourceEntityCode,
           java.lang.String sourceEntityCodeNamespace,
           org.LexGrid.relations.AssociationTarget[] target,
           java.lang.Object[] targetAsReference,
           int targetCount,
           org.LexGrid.relations.AssociationData[] targetData,
           java.lang.Object[] targetDataAsReference,
           int targetDataCount,
           boolean valid) {
        super(
            parent);
        this.choiceValue = choiceValue;
        this.sourceEntityCode = sourceEntityCode;
        this.sourceEntityCodeNamespace = sourceEntityCodeNamespace;
        this.target = target;
        this.targetAsReference = targetAsReference;
        this.targetCount = targetCount;
        this.targetData = targetData;
        this.targetDataAsReference = targetDataAsReference;
        this.targetDataCount = targetDataCount;
        this.valid = valid;
    }


    /**
     * Gets the choiceValue value for this AssociationSource.
     * 
     * @return choiceValue
     */
    public java.lang.Object getChoiceValue() {
        return choiceValue;
    }


    /**
     * Sets the choiceValue value for this AssociationSource.
     * 
     * @param choiceValue
     */
    public void setChoiceValue(java.lang.Object choiceValue) {
        this.choiceValue = choiceValue;
    }


    /**
     * Gets the sourceEntityCode value for this AssociationSource.
     * 
     * @return sourceEntityCode
     */
    public java.lang.String getSourceEntityCode() {
        return sourceEntityCode;
    }


    /**
     * Sets the sourceEntityCode value for this AssociationSource.
     * 
     * @param sourceEntityCode
     */
    public void setSourceEntityCode(java.lang.String sourceEntityCode) {
        this.sourceEntityCode = sourceEntityCode;
    }


    /**
     * Gets the sourceEntityCodeNamespace value for this AssociationSource.
     * 
     * @return sourceEntityCodeNamespace
     */
    public java.lang.String getSourceEntityCodeNamespace() {
        return sourceEntityCodeNamespace;
    }


    /**
     * Sets the sourceEntityCodeNamespace value for this AssociationSource.
     * 
     * @param sourceEntityCodeNamespace
     */
    public void setSourceEntityCodeNamespace(java.lang.String sourceEntityCodeNamespace) {
        this.sourceEntityCodeNamespace = sourceEntityCodeNamespace;
    }


    /**
     * Gets the target value for this AssociationSource.
     * 
     * @return target
     */
    public org.LexGrid.relations.AssociationTarget[] getTarget() {
        return target;
    }


    /**
     * Sets the target value for this AssociationSource.
     * 
     * @param target
     */
    public void setTarget(org.LexGrid.relations.AssociationTarget[] target) {
        this.target = target;
    }

    public org.LexGrid.relations.AssociationTarget getTarget(int i) {
        return this.target[i];
    }

    public void setTarget(int i, org.LexGrid.relations.AssociationTarget _value) {
        this.target[i] = _value;
    }


    /**
     * Gets the targetAsReference value for this AssociationSource.
     * 
     * @return targetAsReference
     */
    public java.lang.Object[] getTargetAsReference() {
        return targetAsReference;
    }


    /**
     * Sets the targetAsReference value for this AssociationSource.
     * 
     * @param targetAsReference
     */
    public void setTargetAsReference(java.lang.Object[] targetAsReference) {
        this.targetAsReference = targetAsReference;
    }


    /**
     * Gets the targetCount value for this AssociationSource.
     * 
     * @return targetCount
     */
    public int getTargetCount() {
        return targetCount;
    }


    /**
     * Sets the targetCount value for this AssociationSource.
     * 
     * @param targetCount
     */
    public void setTargetCount(int targetCount) {
        this.targetCount = targetCount;
    }


    /**
     * Gets the targetData value for this AssociationSource.
     * 
     * @return targetData
     */
    public org.LexGrid.relations.AssociationData[] getTargetData() {
        return targetData;
    }


    /**
     * Sets the targetData value for this AssociationSource.
     * 
     * @param targetData
     */
    public void setTargetData(org.LexGrid.relations.AssociationData[] targetData) {
        this.targetData = targetData;
    }

    public org.LexGrid.relations.AssociationData getTargetData(int i) {
        return this.targetData[i];
    }

    public void setTargetData(int i, org.LexGrid.relations.AssociationData _value) {
        this.targetData[i] = _value;
    }


    /**
     * Gets the targetDataAsReference value for this AssociationSource.
     * 
     * @return targetDataAsReference
     */
    public java.lang.Object[] getTargetDataAsReference() {
        return targetDataAsReference;
    }


    /**
     * Sets the targetDataAsReference value for this AssociationSource.
     * 
     * @param targetDataAsReference
     */
    public void setTargetDataAsReference(java.lang.Object[] targetDataAsReference) {
        this.targetDataAsReference = targetDataAsReference;
    }


    /**
     * Gets the targetDataCount value for this AssociationSource.
     * 
     * @return targetDataCount
     */
    public int getTargetDataCount() {
        return targetDataCount;
    }


    /**
     * Sets the targetDataCount value for this AssociationSource.
     * 
     * @param targetDataCount
     */
    public void setTargetDataCount(int targetDataCount) {
        this.targetDataCount = targetDataCount;
    }


    /**
     * Gets the valid value for this AssociationSource.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this AssociationSource.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssociationSource)) return false;
        AssociationSource other = (AssociationSource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.choiceValue==null && other.getChoiceValue()==null) || 
             (this.choiceValue!=null &&
              this.choiceValue.equals(other.getChoiceValue()))) &&
            ((this.sourceEntityCode==null && other.getSourceEntityCode()==null) || 
             (this.sourceEntityCode!=null &&
              this.sourceEntityCode.equals(other.getSourceEntityCode()))) &&
            ((this.sourceEntityCodeNamespace==null && other.getSourceEntityCodeNamespace()==null) || 
             (this.sourceEntityCodeNamespace!=null &&
              this.sourceEntityCodeNamespace.equals(other.getSourceEntityCodeNamespace()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              java.util.Arrays.equals(this.target, other.getTarget()))) &&
            ((this.targetAsReference==null && other.getTargetAsReference()==null) || 
             (this.targetAsReference!=null &&
              java.util.Arrays.equals(this.targetAsReference, other.getTargetAsReference()))) &&
            this.targetCount == other.getTargetCount() &&
            ((this.targetData==null && other.getTargetData()==null) || 
             (this.targetData!=null &&
              java.util.Arrays.equals(this.targetData, other.getTargetData()))) &&
            ((this.targetDataAsReference==null && other.getTargetDataAsReference()==null) || 
             (this.targetDataAsReference!=null &&
              java.util.Arrays.equals(this.targetDataAsReference, other.getTargetDataAsReference()))) &&
            this.targetDataCount == other.getTargetDataCount() &&
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
        if (getChoiceValue() != null) {
            _hashCode += getChoiceValue().hashCode();
        }
        if (getSourceEntityCode() != null) {
            _hashCode += getSourceEntityCode().hashCode();
        }
        if (getSourceEntityCodeNamespace() != null) {
            _hashCode += getSourceEntityCodeNamespace().hashCode();
        }
        if (getTarget() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTarget());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTarget(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargetAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getTargetCount();
        if (getTargetData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargetDataAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetDataAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetDataAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getTargetDataCount();
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssociationSource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relations.LexGrid.org", "AssociationSource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("choiceValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "choiceValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceEntityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceEntityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceEntityCodeNamespace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceEntityCodeNamespace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("", "target"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relations.LexGrid.org", "AssociationTarget"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relations.LexGrid.org", "AssociationData"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetDataAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetDataAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetDataCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetDataCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
