/**
 * EntryState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.versions;

public class EntryState  extends org.mayo.edu.lgModel.LexGridBase  implements java.io.Serializable {
    private java.lang.Object changeType;

    private java.lang.String containingRevision;

    private java.lang.String prevRevision;

    private java.lang.Long relativeOrder;

    private boolean valid;

    public EntryState() {
    }

    public EntryState(
           java.lang.Object parent,
           java.lang.Object changeType,
           java.lang.String containingRevision,
           java.lang.String prevRevision,
           java.lang.Long relativeOrder,
           boolean valid) {
        super(
            parent);
        this.changeType = changeType;
        this.containingRevision = containingRevision;
        this.prevRevision = prevRevision;
        this.relativeOrder = relativeOrder;
        this.valid = valid;
    }


    /**
     * Gets the changeType value for this EntryState.
     * 
     * @return changeType
     */
    public java.lang.Object getChangeType() {
        return changeType;
    }


    /**
     * Sets the changeType value for this EntryState.
     * 
     * @param changeType
     */
    public void setChangeType(java.lang.Object changeType) {
        this.changeType = changeType;
    }


    /**
     * Gets the containingRevision value for this EntryState.
     * 
     * @return containingRevision
     */
    public java.lang.String getContainingRevision() {
        return containingRevision;
    }


    /**
     * Sets the containingRevision value for this EntryState.
     * 
     * @param containingRevision
     */
    public void setContainingRevision(java.lang.String containingRevision) {
        this.containingRevision = containingRevision;
    }


    /**
     * Gets the prevRevision value for this EntryState.
     * 
     * @return prevRevision
     */
    public java.lang.String getPrevRevision() {
        return prevRevision;
    }


    /**
     * Sets the prevRevision value for this EntryState.
     * 
     * @param prevRevision
     */
    public void setPrevRevision(java.lang.String prevRevision) {
        this.prevRevision = prevRevision;
    }


    /**
     * Gets the relativeOrder value for this EntryState.
     * 
     * @return relativeOrder
     */
    public java.lang.Long getRelativeOrder() {
        return relativeOrder;
    }


    /**
     * Sets the relativeOrder value for this EntryState.
     * 
     * @param relativeOrder
     */
    public void setRelativeOrder(java.lang.Long relativeOrder) {
        this.relativeOrder = relativeOrder;
    }


    /**
     * Gets the valid value for this EntryState.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this EntryState.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntryState)) return false;
        EntryState other = (EntryState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.changeType==null && other.getChangeType()==null) || 
             (this.changeType!=null &&
              this.changeType.equals(other.getChangeType()))) &&
            ((this.containingRevision==null && other.getContainingRevision()==null) || 
             (this.containingRevision!=null &&
              this.containingRevision.equals(other.getContainingRevision()))) &&
            ((this.prevRevision==null && other.getPrevRevision()==null) || 
             (this.prevRevision!=null &&
              this.prevRevision.equals(other.getPrevRevision()))) &&
            ((this.relativeOrder==null && other.getRelativeOrder()==null) || 
             (this.relativeOrder!=null &&
              this.relativeOrder.equals(other.getRelativeOrder()))) &&
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
        if (getChangeType() != null) {
            _hashCode += getChangeType().hashCode();
        }
        if (getContainingRevision() != null) {
            _hashCode += getContainingRevision().hashCode();
        }
        if (getPrevRevision() != null) {
            _hashCode += getPrevRevision().hashCode();
        }
        if (getRelativeOrder() != null) {
            _hashCode += getRelativeOrder().hashCode();
        }
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntryState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:versions.LexGrid.org", "EntryState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("containingRevision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "containingRevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevRevision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prevRevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativeOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relativeOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
