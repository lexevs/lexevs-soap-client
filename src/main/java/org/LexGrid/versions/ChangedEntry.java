/**
 * ChangedEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.versions;

public class ChangedEntry  extends org.mayo.edu.lgModel.LexGridBase  implements java.io.Serializable {
    private org.LexGrid.codingSchemes.CodingScheme changedCodingSchemeEntry;

    private org.LexGrid.valueSets.PickListDefinition changedPickListDefinitionEntry;

    private org.LexGrid.valueSets.ValueSetDefinition changedValueSetDefinitionEntry;

    private java.lang.Object choiceValue;

    private boolean valid;

    public ChangedEntry() {
    }

    public ChangedEntry(
           java.lang.Object parent,
           org.LexGrid.codingSchemes.CodingScheme changedCodingSchemeEntry,
           org.LexGrid.valueSets.PickListDefinition changedPickListDefinitionEntry,
           org.LexGrid.valueSets.ValueSetDefinition changedValueSetDefinitionEntry,
           java.lang.Object choiceValue,
           boolean valid) {
        super(
            parent);
        this.changedCodingSchemeEntry = changedCodingSchemeEntry;
        this.changedPickListDefinitionEntry = changedPickListDefinitionEntry;
        this.changedValueSetDefinitionEntry = changedValueSetDefinitionEntry;
        this.choiceValue = choiceValue;
        this.valid = valid;
    }


    /**
     * Gets the changedCodingSchemeEntry value for this ChangedEntry.
     * 
     * @return changedCodingSchemeEntry
     */
    public org.LexGrid.codingSchemes.CodingScheme getChangedCodingSchemeEntry() {
        return changedCodingSchemeEntry;
    }


    /**
     * Sets the changedCodingSchemeEntry value for this ChangedEntry.
     * 
     * @param changedCodingSchemeEntry
     */
    public void setChangedCodingSchemeEntry(org.LexGrid.codingSchemes.CodingScheme changedCodingSchemeEntry) {
        this.changedCodingSchemeEntry = changedCodingSchemeEntry;
    }


    /**
     * Gets the changedPickListDefinitionEntry value for this ChangedEntry.
     * 
     * @return changedPickListDefinitionEntry
     */
    public org.LexGrid.valueSets.PickListDefinition getChangedPickListDefinitionEntry() {
        return changedPickListDefinitionEntry;
    }


    /**
     * Sets the changedPickListDefinitionEntry value for this ChangedEntry.
     * 
     * @param changedPickListDefinitionEntry
     */
    public void setChangedPickListDefinitionEntry(org.LexGrid.valueSets.PickListDefinition changedPickListDefinitionEntry) {
        this.changedPickListDefinitionEntry = changedPickListDefinitionEntry;
    }


    /**
     * Gets the changedValueSetDefinitionEntry value for this ChangedEntry.
     * 
     * @return changedValueSetDefinitionEntry
     */
    public org.LexGrid.valueSets.ValueSetDefinition getChangedValueSetDefinitionEntry() {
        return changedValueSetDefinitionEntry;
    }


    /**
     * Sets the changedValueSetDefinitionEntry value for this ChangedEntry.
     * 
     * @param changedValueSetDefinitionEntry
     */
    public void setChangedValueSetDefinitionEntry(org.LexGrid.valueSets.ValueSetDefinition changedValueSetDefinitionEntry) {
        this.changedValueSetDefinitionEntry = changedValueSetDefinitionEntry;
    }


    /**
     * Gets the choiceValue value for this ChangedEntry.
     * 
     * @return choiceValue
     */
    public java.lang.Object getChoiceValue() {
        return choiceValue;
    }


    /**
     * Sets the choiceValue value for this ChangedEntry.
     * 
     * @param choiceValue
     */
    public void setChoiceValue(java.lang.Object choiceValue) {
        this.choiceValue = choiceValue;
    }


    /**
     * Gets the valid value for this ChangedEntry.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this ChangedEntry.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangedEntry)) return false;
        ChangedEntry other = (ChangedEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.changedCodingSchemeEntry==null && other.getChangedCodingSchemeEntry()==null) || 
             (this.changedCodingSchemeEntry!=null &&
              this.changedCodingSchemeEntry.equals(other.getChangedCodingSchemeEntry()))) &&
            ((this.changedPickListDefinitionEntry==null && other.getChangedPickListDefinitionEntry()==null) || 
             (this.changedPickListDefinitionEntry!=null &&
              this.changedPickListDefinitionEntry.equals(other.getChangedPickListDefinitionEntry()))) &&
            ((this.changedValueSetDefinitionEntry==null && other.getChangedValueSetDefinitionEntry()==null) || 
             (this.changedValueSetDefinitionEntry!=null &&
              this.changedValueSetDefinitionEntry.equals(other.getChangedValueSetDefinitionEntry()))) &&
            ((this.choiceValue==null && other.getChoiceValue()==null) || 
             (this.choiceValue!=null &&
              this.choiceValue.equals(other.getChoiceValue()))) &&
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
        if (getChangedCodingSchemeEntry() != null) {
            _hashCode += getChangedCodingSchemeEntry().hashCode();
        }
        if (getChangedPickListDefinitionEntry() != null) {
            _hashCode += getChangedPickListDefinitionEntry().hashCode();
        }
        if (getChangedValueSetDefinitionEntry() != null) {
            _hashCode += getChangedValueSetDefinitionEntry().hashCode();
        }
        if (getChoiceValue() != null) {
            _hashCode += getChoiceValue().hashCode();
        }
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangedEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:versions.LexGrid.org", "ChangedEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedCodingSchemeEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changedCodingSchemeEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:codingSchemes.LexGrid.org", "CodingScheme"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedPickListDefinitionEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changedPickListDefinitionEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "PickListDefinition"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedValueSetDefinitionEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changedValueSetDefinitionEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "ValueSetDefinition"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("choiceValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "choiceValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
