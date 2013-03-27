/**
 * PickListEntryNodeChoice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.valueSets;

public class PickListEntryNodeChoice  extends org.mayo.edu.lgModel.LexGridBase  implements java.io.Serializable {
    private org.LexGrid.valueSets.PickListEntryExclusion exclusionEntry;

    private org.LexGrid.valueSets.PickListEntry inclusionEntry;

    private boolean valid;

    public PickListEntryNodeChoice() {
    }

    public PickListEntryNodeChoice(
           java.lang.Object parent,
           org.LexGrid.valueSets.PickListEntryExclusion exclusionEntry,
           org.LexGrid.valueSets.PickListEntry inclusionEntry,
           boolean valid) {
        super(
            parent);
        this.exclusionEntry = exclusionEntry;
        this.inclusionEntry = inclusionEntry;
        this.valid = valid;
    }


    /**
     * Gets the exclusionEntry value for this PickListEntryNodeChoice.
     * 
     * @return exclusionEntry
     */
    public org.LexGrid.valueSets.PickListEntryExclusion getExclusionEntry() {
        return exclusionEntry;
    }


    /**
     * Sets the exclusionEntry value for this PickListEntryNodeChoice.
     * 
     * @param exclusionEntry
     */
    public void setExclusionEntry(org.LexGrid.valueSets.PickListEntryExclusion exclusionEntry) {
        this.exclusionEntry = exclusionEntry;
    }


    /**
     * Gets the inclusionEntry value for this PickListEntryNodeChoice.
     * 
     * @return inclusionEntry
     */
    public org.LexGrid.valueSets.PickListEntry getInclusionEntry() {
        return inclusionEntry;
    }


    /**
     * Sets the inclusionEntry value for this PickListEntryNodeChoice.
     * 
     * @param inclusionEntry
     */
    public void setInclusionEntry(org.LexGrid.valueSets.PickListEntry inclusionEntry) {
        this.inclusionEntry = inclusionEntry;
    }


    /**
     * Gets the valid value for this PickListEntryNodeChoice.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this PickListEntryNodeChoice.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PickListEntryNodeChoice)) return false;
        PickListEntryNodeChoice other = (PickListEntryNodeChoice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.exclusionEntry==null && other.getExclusionEntry()==null) || 
             (this.exclusionEntry!=null &&
              this.exclusionEntry.equals(other.getExclusionEntry()))) &&
            ((this.inclusionEntry==null && other.getInclusionEntry()==null) || 
             (this.inclusionEntry!=null &&
              this.inclusionEntry.equals(other.getInclusionEntry()))) &&
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
        if (getExclusionEntry() != null) {
            _hashCode += getExclusionEntry().hashCode();
        }
        if (getInclusionEntry() != null) {
            _hashCode += getInclusionEntry().hashCode();
        }
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PickListEntryNodeChoice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "PickListEntryNodeChoice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exclusionEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exclusionEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "PickListEntryExclusion"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inclusionEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inclusionEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "PickListEntry"));
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
