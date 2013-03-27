/**
 * PickListDefinitions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.valueSets;

public class PickListDefinitions  extends org.mayo.edu.lgModel.LexGridBase  implements java.io.Serializable {
    private org.LexGrid.naming.Mappings mappings;

    private org.LexGrid.valueSets.PickListDefinition[] pickListDefinition;

    private java.lang.Object[] pickListDefinitionAsReference;

    private int pickListDefinitionCount;

    private boolean valid;

    public PickListDefinitions() {
    }

    public PickListDefinitions(
           java.lang.Object parent,
           org.LexGrid.naming.Mappings mappings,
           org.LexGrid.valueSets.PickListDefinition[] pickListDefinition,
           java.lang.Object[] pickListDefinitionAsReference,
           int pickListDefinitionCount,
           boolean valid) {
        super(
            parent);
        this.mappings = mappings;
        this.pickListDefinition = pickListDefinition;
        this.pickListDefinitionAsReference = pickListDefinitionAsReference;
        this.pickListDefinitionCount = pickListDefinitionCount;
        this.valid = valid;
    }


    /**
     * Gets the mappings value for this PickListDefinitions.
     * 
     * @return mappings
     */
    public org.LexGrid.naming.Mappings getMappings() {
        return mappings;
    }


    /**
     * Sets the mappings value for this PickListDefinitions.
     * 
     * @param mappings
     */
    public void setMappings(org.LexGrid.naming.Mappings mappings) {
        this.mappings = mappings;
    }


    /**
     * Gets the pickListDefinition value for this PickListDefinitions.
     * 
     * @return pickListDefinition
     */
    public org.LexGrid.valueSets.PickListDefinition[] getPickListDefinition() {
        return pickListDefinition;
    }


    /**
     * Sets the pickListDefinition value for this PickListDefinitions.
     * 
     * @param pickListDefinition
     */
    public void setPickListDefinition(org.LexGrid.valueSets.PickListDefinition[] pickListDefinition) {
        this.pickListDefinition = pickListDefinition;
    }

    public org.LexGrid.valueSets.PickListDefinition getPickListDefinition(int i) {
        return this.pickListDefinition[i];
    }

    public void setPickListDefinition(int i, org.LexGrid.valueSets.PickListDefinition _value) {
        this.pickListDefinition[i] = _value;
    }


    /**
     * Gets the pickListDefinitionAsReference value for this PickListDefinitions.
     * 
     * @return pickListDefinitionAsReference
     */
    public java.lang.Object[] getPickListDefinitionAsReference() {
        return pickListDefinitionAsReference;
    }


    /**
     * Sets the pickListDefinitionAsReference value for this PickListDefinitions.
     * 
     * @param pickListDefinitionAsReference
     */
    public void setPickListDefinitionAsReference(java.lang.Object[] pickListDefinitionAsReference) {
        this.pickListDefinitionAsReference = pickListDefinitionAsReference;
    }


    /**
     * Gets the pickListDefinitionCount value for this PickListDefinitions.
     * 
     * @return pickListDefinitionCount
     */
    public int getPickListDefinitionCount() {
        return pickListDefinitionCount;
    }


    /**
     * Sets the pickListDefinitionCount value for this PickListDefinitions.
     * 
     * @param pickListDefinitionCount
     */
    public void setPickListDefinitionCount(int pickListDefinitionCount) {
        this.pickListDefinitionCount = pickListDefinitionCount;
    }


    /**
     * Gets the valid value for this PickListDefinitions.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this PickListDefinitions.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PickListDefinitions)) return false;
        PickListDefinitions other = (PickListDefinitions) obj;
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
            ((this.pickListDefinition==null && other.getPickListDefinition()==null) || 
             (this.pickListDefinition!=null &&
              java.util.Arrays.equals(this.pickListDefinition, other.getPickListDefinition()))) &&
            ((this.pickListDefinitionAsReference==null && other.getPickListDefinitionAsReference()==null) || 
             (this.pickListDefinitionAsReference!=null &&
              java.util.Arrays.equals(this.pickListDefinitionAsReference, other.getPickListDefinitionAsReference()))) &&
            this.pickListDefinitionCount == other.getPickListDefinitionCount() &&
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
        if (getMappings() != null) {
            _hashCode += getMappings().hashCode();
        }
        if (getPickListDefinition() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPickListDefinition());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPickListDefinition(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPickListDefinitionAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPickListDefinitionAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPickListDefinitionAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPickListDefinitionCount();
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PickListDefinitions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "PickListDefinitions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mappings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mappings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:naming.LexGrid.org", "Mappings"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickListDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickListDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "PickListDefinition"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickListDefinitionAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickListDefinitionAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickListDefinitionCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickListDefinitionCount"));
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
