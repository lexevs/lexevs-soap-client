/**
 * ValueSetDefinitions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.valueSets;

public class ValueSetDefinitions  extends org.mayo.edu.lgModel.LexGridBase  implements java.io.Serializable {
    private org.LexGrid.naming.Mappings mappings;

    private boolean valid;

    private org.LexGrid.valueSets.ValueSetDefinition[] valueSetDefinition;

    private java.lang.Object[] valueSetDefinitionAsReference;

    private int valueSetDefinitionCount;

    public ValueSetDefinitions() {
    }

    public ValueSetDefinitions(
           java.lang.Object parent,
           org.LexGrid.naming.Mappings mappings,
           boolean valid,
           org.LexGrid.valueSets.ValueSetDefinition[] valueSetDefinition,
           java.lang.Object[] valueSetDefinitionAsReference,
           int valueSetDefinitionCount) {
        super(
            parent);
        this.mappings = mappings;
        this.valid = valid;
        this.valueSetDefinition = valueSetDefinition;
        this.valueSetDefinitionAsReference = valueSetDefinitionAsReference;
        this.valueSetDefinitionCount = valueSetDefinitionCount;
    }


    /**
     * Gets the mappings value for this ValueSetDefinitions.
     * 
     * @return mappings
     */
    public org.LexGrid.naming.Mappings getMappings() {
        return mappings;
    }


    /**
     * Sets the mappings value for this ValueSetDefinitions.
     * 
     * @param mappings
     */
    public void setMappings(org.LexGrid.naming.Mappings mappings) {
        this.mappings = mappings;
    }


    /**
     * Gets the valid value for this ValueSetDefinitions.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this ValueSetDefinitions.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }


    /**
     * Gets the valueSetDefinition value for this ValueSetDefinitions.
     * 
     * @return valueSetDefinition
     */
    public org.LexGrid.valueSets.ValueSetDefinition[] getValueSetDefinition() {
        return valueSetDefinition;
    }


    /**
     * Sets the valueSetDefinition value for this ValueSetDefinitions.
     * 
     * @param valueSetDefinition
     */
    public void setValueSetDefinition(org.LexGrid.valueSets.ValueSetDefinition[] valueSetDefinition) {
        this.valueSetDefinition = valueSetDefinition;
    }

    public org.LexGrid.valueSets.ValueSetDefinition getValueSetDefinition(int i) {
        return this.valueSetDefinition[i];
    }

    public void setValueSetDefinition(int i, org.LexGrid.valueSets.ValueSetDefinition _value) {
        this.valueSetDefinition[i] = _value;
    }


    /**
     * Gets the valueSetDefinitionAsReference value for this ValueSetDefinitions.
     * 
     * @return valueSetDefinitionAsReference
     */
    public java.lang.Object[] getValueSetDefinitionAsReference() {
        return valueSetDefinitionAsReference;
    }


    /**
     * Sets the valueSetDefinitionAsReference value for this ValueSetDefinitions.
     * 
     * @param valueSetDefinitionAsReference
     */
    public void setValueSetDefinitionAsReference(java.lang.Object[] valueSetDefinitionAsReference) {
        this.valueSetDefinitionAsReference = valueSetDefinitionAsReference;
    }


    /**
     * Gets the valueSetDefinitionCount value for this ValueSetDefinitions.
     * 
     * @return valueSetDefinitionCount
     */
    public int getValueSetDefinitionCount() {
        return valueSetDefinitionCount;
    }


    /**
     * Sets the valueSetDefinitionCount value for this ValueSetDefinitions.
     * 
     * @param valueSetDefinitionCount
     */
    public void setValueSetDefinitionCount(int valueSetDefinitionCount) {
        this.valueSetDefinitionCount = valueSetDefinitionCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValueSetDefinitions)) return false;
        ValueSetDefinitions other = (ValueSetDefinitions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mappings==null && other.getMappings()==null) || 
             (this.mappings!=null &&
              this.mappings.equals(other.getMappings()))) &&
            this.valid == other.isValid() &&
            ((this.valueSetDefinition==null && other.getValueSetDefinition()==null) || 
             (this.valueSetDefinition!=null &&
              java.util.Arrays.equals(this.valueSetDefinition, other.getValueSetDefinition()))) &&
            ((this.valueSetDefinitionAsReference==null && other.getValueSetDefinitionAsReference()==null) || 
             (this.valueSetDefinitionAsReference!=null &&
              java.util.Arrays.equals(this.valueSetDefinitionAsReference, other.getValueSetDefinitionAsReference()))) &&
            this.valueSetDefinitionCount == other.getValueSetDefinitionCount();
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
        if (getMappings() != null) {
            _hashCode += getMappings().hashCode();
        }
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getValueSetDefinition() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValueSetDefinition());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValueSetDefinition(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValueSetDefinitionAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValueSetDefinitionAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValueSetDefinitionAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getValueSetDefinitionCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValueSetDefinitions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "ValueSetDefinitions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mappings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mappings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:naming.LexGrid.org", "Mappings"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueSetDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueSetDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "ValueSetDefinition"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueSetDefinitionAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueSetDefinitionAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueSetDefinitionCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueSetDefinitionCount"));
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
