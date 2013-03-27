/**
 * DefinitionEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.valueSets;

public class DefinitionEntry  extends org.LexGrid.commonTypes.Versionable  implements java.io.Serializable {
    private java.lang.Object choiceValue;

    private org.LexGrid.valueSets.CodingSchemeReference codingSchemeReference;

    private org.LexGrid.valueSets.EntityReference entityReference;

    private java.lang.Object operator;

    private org.LexGrid.valueSets.PropertyReference propertyReference;

    private java.lang.Long ruleOrder;

    private org.LexGrid.valueSets.ValueSetDefinitionReference valueSetDefinitionReference;

    public DefinitionEntry() {
    }

    public DefinitionEntry(
           java.lang.Object parent,
           java.util.Calendar effectiveDate,
           org.LexGrid.versions.EntryState entryState,
           java.util.Calendar expirationDate,
           java.lang.Boolean isActive,
           java.lang.String owner,
           java.lang.String status,
           boolean valid,
           java.lang.Object choiceValue,
           org.LexGrid.valueSets.CodingSchemeReference codingSchemeReference,
           org.LexGrid.valueSets.EntityReference entityReference,
           java.lang.Object operator,
           org.LexGrid.valueSets.PropertyReference propertyReference,
           java.lang.Long ruleOrder,
           org.LexGrid.valueSets.ValueSetDefinitionReference valueSetDefinitionReference) {
        super(
            parent,
            effectiveDate,
            entryState,
            expirationDate,
            isActive,
            owner,
            status,
            valid);
        this.choiceValue = choiceValue;
        this.codingSchemeReference = codingSchemeReference;
        this.entityReference = entityReference;
        this.operator = operator;
        this.propertyReference = propertyReference;
        this.ruleOrder = ruleOrder;
        this.valueSetDefinitionReference = valueSetDefinitionReference;
    }


    /**
     * Gets the choiceValue value for this DefinitionEntry.
     * 
     * @return choiceValue
     */
    public java.lang.Object getChoiceValue() {
        return choiceValue;
    }


    /**
     * Sets the choiceValue value for this DefinitionEntry.
     * 
     * @param choiceValue
     */
    public void setChoiceValue(java.lang.Object choiceValue) {
        this.choiceValue = choiceValue;
    }


    /**
     * Gets the codingSchemeReference value for this DefinitionEntry.
     * 
     * @return codingSchemeReference
     */
    public org.LexGrid.valueSets.CodingSchemeReference getCodingSchemeReference() {
        return codingSchemeReference;
    }


    /**
     * Sets the codingSchemeReference value for this DefinitionEntry.
     * 
     * @param codingSchemeReference
     */
    public void setCodingSchemeReference(org.LexGrid.valueSets.CodingSchemeReference codingSchemeReference) {
        this.codingSchemeReference = codingSchemeReference;
    }


    /**
     * Gets the entityReference value for this DefinitionEntry.
     * 
     * @return entityReference
     */
    public org.LexGrid.valueSets.EntityReference getEntityReference() {
        return entityReference;
    }


    /**
     * Sets the entityReference value for this DefinitionEntry.
     * 
     * @param entityReference
     */
    public void setEntityReference(org.LexGrid.valueSets.EntityReference entityReference) {
        this.entityReference = entityReference;
    }


    /**
     * Gets the operator value for this DefinitionEntry.
     * 
     * @return operator
     */
    public java.lang.Object getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this DefinitionEntry.
     * 
     * @param operator
     */
    public void setOperator(java.lang.Object operator) {
        this.operator = operator;
    }


    /**
     * Gets the propertyReference value for this DefinitionEntry.
     * 
     * @return propertyReference
     */
    public org.LexGrid.valueSets.PropertyReference getPropertyReference() {
        return propertyReference;
    }


    /**
     * Sets the propertyReference value for this DefinitionEntry.
     * 
     * @param propertyReference
     */
    public void setPropertyReference(org.LexGrid.valueSets.PropertyReference propertyReference) {
        this.propertyReference = propertyReference;
    }


    /**
     * Gets the ruleOrder value for this DefinitionEntry.
     * 
     * @return ruleOrder
     */
    public java.lang.Long getRuleOrder() {
        return ruleOrder;
    }


    /**
     * Sets the ruleOrder value for this DefinitionEntry.
     * 
     * @param ruleOrder
     */
    public void setRuleOrder(java.lang.Long ruleOrder) {
        this.ruleOrder = ruleOrder;
    }


    /**
     * Gets the valueSetDefinitionReference value for this DefinitionEntry.
     * 
     * @return valueSetDefinitionReference
     */
    public org.LexGrid.valueSets.ValueSetDefinitionReference getValueSetDefinitionReference() {
        return valueSetDefinitionReference;
    }


    /**
     * Sets the valueSetDefinitionReference value for this DefinitionEntry.
     * 
     * @param valueSetDefinitionReference
     */
    public void setValueSetDefinitionReference(org.LexGrid.valueSets.ValueSetDefinitionReference valueSetDefinitionReference) {
        this.valueSetDefinitionReference = valueSetDefinitionReference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DefinitionEntry)) return false;
        DefinitionEntry other = (DefinitionEntry) obj;
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
            ((this.codingSchemeReference==null && other.getCodingSchemeReference()==null) || 
             (this.codingSchemeReference!=null &&
              this.codingSchemeReference.equals(other.getCodingSchemeReference()))) &&
            ((this.entityReference==null && other.getEntityReference()==null) || 
             (this.entityReference!=null &&
              this.entityReference.equals(other.getEntityReference()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.propertyReference==null && other.getPropertyReference()==null) || 
             (this.propertyReference!=null &&
              this.propertyReference.equals(other.getPropertyReference()))) &&
            ((this.ruleOrder==null && other.getRuleOrder()==null) || 
             (this.ruleOrder!=null &&
              this.ruleOrder.equals(other.getRuleOrder()))) &&
            ((this.valueSetDefinitionReference==null && other.getValueSetDefinitionReference()==null) || 
             (this.valueSetDefinitionReference!=null &&
              this.valueSetDefinitionReference.equals(other.getValueSetDefinitionReference())));
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
        if (getCodingSchemeReference() != null) {
            _hashCode += getCodingSchemeReference().hashCode();
        }
        if (getEntityReference() != null) {
            _hashCode += getEntityReference().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getPropertyReference() != null) {
            _hashCode += getPropertyReference().hashCode();
        }
        if (getRuleOrder() != null) {
            _hashCode += getRuleOrder().hashCode();
        }
        if (getValueSetDefinitionReference() != null) {
            _hashCode += getValueSetDefinitionReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DefinitionEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "DefinitionEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("choiceValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "choiceValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codingSchemeReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codingSchemeReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "CodingSchemeReference"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "EntityReference"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "PropertyReference"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ruleOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueSetDefinitionReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueSetDefinitionReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "ValueSetDefinitionReference"));
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
