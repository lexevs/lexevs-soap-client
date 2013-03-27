/**
 * PickListEntryNode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.valueSets;

public class PickListEntryNode  extends org.LexGrid.commonTypes.Versionable  implements java.io.Serializable {
    private java.lang.String pickListEntryId;

    private org.LexGrid.valueSets.PickListEntryNodeChoice pickListEntryNodeChoice;

    private org.LexGrid.commonTypes.Properties properties;

    public PickListEntryNode() {
    }

    public PickListEntryNode(
           java.lang.Object parent,
           java.util.Calendar effectiveDate,
           org.LexGrid.versions.EntryState entryState,
           java.util.Calendar expirationDate,
           java.lang.Boolean isActive,
           java.lang.String owner,
           java.lang.String status,
           boolean valid,
           java.lang.String pickListEntryId,
           org.LexGrid.valueSets.PickListEntryNodeChoice pickListEntryNodeChoice,
           org.LexGrid.commonTypes.Properties properties) {
        super(
            parent,
            effectiveDate,
            entryState,
            expirationDate,
            isActive,
            owner,
            status,
            valid);
        this.pickListEntryId = pickListEntryId;
        this.pickListEntryNodeChoice = pickListEntryNodeChoice;
        this.properties = properties;
    }


    /**
     * Gets the pickListEntryId value for this PickListEntryNode.
     * 
     * @return pickListEntryId
     */
    public java.lang.String getPickListEntryId() {
        return pickListEntryId;
    }


    /**
     * Sets the pickListEntryId value for this PickListEntryNode.
     * 
     * @param pickListEntryId
     */
    public void setPickListEntryId(java.lang.String pickListEntryId) {
        this.pickListEntryId = pickListEntryId;
    }


    /**
     * Gets the pickListEntryNodeChoice value for this PickListEntryNode.
     * 
     * @return pickListEntryNodeChoice
     */
    public org.LexGrid.valueSets.PickListEntryNodeChoice getPickListEntryNodeChoice() {
        return pickListEntryNodeChoice;
    }


    /**
     * Sets the pickListEntryNodeChoice value for this PickListEntryNode.
     * 
     * @param pickListEntryNodeChoice
     */
    public void setPickListEntryNodeChoice(org.LexGrid.valueSets.PickListEntryNodeChoice pickListEntryNodeChoice) {
        this.pickListEntryNodeChoice = pickListEntryNodeChoice;
    }


    /**
     * Gets the properties value for this PickListEntryNode.
     * 
     * @return properties
     */
    public org.LexGrid.commonTypes.Properties getProperties() {
        return properties;
    }


    /**
     * Sets the properties value for this PickListEntryNode.
     * 
     * @param properties
     */
    public void setProperties(org.LexGrid.commonTypes.Properties properties) {
        this.properties = properties;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PickListEntryNode)) return false;
        PickListEntryNode other = (PickListEntryNode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pickListEntryId==null && other.getPickListEntryId()==null) || 
             (this.pickListEntryId!=null &&
              this.pickListEntryId.equals(other.getPickListEntryId()))) &&
            ((this.pickListEntryNodeChoice==null && other.getPickListEntryNodeChoice()==null) || 
             (this.pickListEntryNodeChoice!=null &&
              this.pickListEntryNodeChoice.equals(other.getPickListEntryNodeChoice()))) &&
            ((this.properties==null && other.getProperties()==null) || 
             (this.properties!=null &&
              this.properties.equals(other.getProperties())));
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
        if (getPickListEntryId() != null) {
            _hashCode += getPickListEntryId().hashCode();
        }
        if (getPickListEntryNodeChoice() != null) {
            _hashCode += getPickListEntryNodeChoice().hashCode();
        }
        if (getProperties() != null) {
            _hashCode += getProperties().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PickListEntryNode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "PickListEntryNode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickListEntryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickListEntryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickListEntryNodeChoice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickListEntryNodeChoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "PickListEntryNodeChoice"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properties");
        elemField.setXmlName(new javax.xml.namespace.QName("", "properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:commonTypes.LexGrid.org", "Properties"));
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
