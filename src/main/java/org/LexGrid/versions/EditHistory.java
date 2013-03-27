/**
 * EditHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.versions;

public class EditHistory  extends org.mayo.edu.lgModel.LexGridBase  implements java.io.Serializable {
    private org.LexGrid.versions.Revision[] revision;

    private java.lang.Object[] revisionAsReference;

    private int revisionCount;

    private boolean valid;

    public EditHistory() {
    }

    public EditHistory(
           java.lang.Object parent,
           org.LexGrid.versions.Revision[] revision,
           java.lang.Object[] revisionAsReference,
           int revisionCount,
           boolean valid) {
        super(
            parent);
        this.revision = revision;
        this.revisionAsReference = revisionAsReference;
        this.revisionCount = revisionCount;
        this.valid = valid;
    }


    /**
     * Gets the revision value for this EditHistory.
     * 
     * @return revision
     */
    public org.LexGrid.versions.Revision[] getRevision() {
        return revision;
    }


    /**
     * Sets the revision value for this EditHistory.
     * 
     * @param revision
     */
    public void setRevision(org.LexGrid.versions.Revision[] revision) {
        this.revision = revision;
    }

    public org.LexGrid.versions.Revision getRevision(int i) {
        return this.revision[i];
    }

    public void setRevision(int i, org.LexGrid.versions.Revision _value) {
        this.revision[i] = _value;
    }


    /**
     * Gets the revisionAsReference value for this EditHistory.
     * 
     * @return revisionAsReference
     */
    public java.lang.Object[] getRevisionAsReference() {
        return revisionAsReference;
    }


    /**
     * Sets the revisionAsReference value for this EditHistory.
     * 
     * @param revisionAsReference
     */
    public void setRevisionAsReference(java.lang.Object[] revisionAsReference) {
        this.revisionAsReference = revisionAsReference;
    }


    /**
     * Gets the revisionCount value for this EditHistory.
     * 
     * @return revisionCount
     */
    public int getRevisionCount() {
        return revisionCount;
    }


    /**
     * Sets the revisionCount value for this EditHistory.
     * 
     * @param revisionCount
     */
    public void setRevisionCount(int revisionCount) {
        this.revisionCount = revisionCount;
    }


    /**
     * Gets the valid value for this EditHistory.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this EditHistory.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EditHistory)) return false;
        EditHistory other = (EditHistory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.revision==null && other.getRevision()==null) || 
             (this.revision!=null &&
              java.util.Arrays.equals(this.revision, other.getRevision()))) &&
            ((this.revisionAsReference==null && other.getRevisionAsReference()==null) || 
             (this.revisionAsReference!=null &&
              java.util.Arrays.equals(this.revisionAsReference, other.getRevisionAsReference()))) &&
            this.revisionCount == other.getRevisionCount() &&
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
        if (getRevision() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevision());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevision(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevisionAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevisionAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevisionAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getRevisionCount();
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EditHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:versions.LexGrid.org", "EditHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revision"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:versions.LexGrid.org", "Revision"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revisionAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revisionCount"));
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
