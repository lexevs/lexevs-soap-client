/**
 * Revision.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.versions;

public class Revision  extends org.LexGrid.commonTypes.Describable  implements java.io.Serializable {
    private java.lang.String changeAgent;

    private org.LexGrid.commonTypes.Text changeInstructions;

    private org.LexGrid.versions.ChangedEntry[] changedEntry;

    private java.lang.Object[] changedEntryAsReference;

    private int changedEntryCount;

    private java.lang.Long editOrder;

    private java.util.Calendar revisionDate;

    private java.lang.String revisionId;

    public Revision() {
    }

    public Revision(
           java.lang.Object parent,
           org.LexGrid.commonTypes.EntityDescription entityDescription,
           boolean valid,
           java.lang.String changeAgent,
           org.LexGrid.commonTypes.Text changeInstructions,
           org.LexGrid.versions.ChangedEntry[] changedEntry,
           java.lang.Object[] changedEntryAsReference,
           int changedEntryCount,
           java.lang.Long editOrder,
           java.util.Calendar revisionDate,
           java.lang.String revisionId) {
        super(
            parent,
            entityDescription,
            valid);
        this.changeAgent = changeAgent;
        this.changeInstructions = changeInstructions;
        this.changedEntry = changedEntry;
        this.changedEntryAsReference = changedEntryAsReference;
        this.changedEntryCount = changedEntryCount;
        this.editOrder = editOrder;
        this.revisionDate = revisionDate;
        this.revisionId = revisionId;
    }


    /**
     * Gets the changeAgent value for this Revision.
     * 
     * @return changeAgent
     */
    public java.lang.String getChangeAgent() {
        return changeAgent;
    }


    /**
     * Sets the changeAgent value for this Revision.
     * 
     * @param changeAgent
     */
    public void setChangeAgent(java.lang.String changeAgent) {
        this.changeAgent = changeAgent;
    }


    /**
     * Gets the changeInstructions value for this Revision.
     * 
     * @return changeInstructions
     */
    public org.LexGrid.commonTypes.Text getChangeInstructions() {
        return changeInstructions;
    }


    /**
     * Sets the changeInstructions value for this Revision.
     * 
     * @param changeInstructions
     */
    public void setChangeInstructions(org.LexGrid.commonTypes.Text changeInstructions) {
        this.changeInstructions = changeInstructions;
    }


    /**
     * Gets the changedEntry value for this Revision.
     * 
     * @return changedEntry
     */
    public org.LexGrid.versions.ChangedEntry[] getChangedEntry() {
        return changedEntry;
    }


    /**
     * Sets the changedEntry value for this Revision.
     * 
     * @param changedEntry
     */
    public void setChangedEntry(org.LexGrid.versions.ChangedEntry[] changedEntry) {
        this.changedEntry = changedEntry;
    }

    public org.LexGrid.versions.ChangedEntry getChangedEntry(int i) {
        return this.changedEntry[i];
    }

    public void setChangedEntry(int i, org.LexGrid.versions.ChangedEntry _value) {
        this.changedEntry[i] = _value;
    }


    /**
     * Gets the changedEntryAsReference value for this Revision.
     * 
     * @return changedEntryAsReference
     */
    public java.lang.Object[] getChangedEntryAsReference() {
        return changedEntryAsReference;
    }


    /**
     * Sets the changedEntryAsReference value for this Revision.
     * 
     * @param changedEntryAsReference
     */
    public void setChangedEntryAsReference(java.lang.Object[] changedEntryAsReference) {
        this.changedEntryAsReference = changedEntryAsReference;
    }


    /**
     * Gets the changedEntryCount value for this Revision.
     * 
     * @return changedEntryCount
     */
    public int getChangedEntryCount() {
        return changedEntryCount;
    }


    /**
     * Sets the changedEntryCount value for this Revision.
     * 
     * @param changedEntryCount
     */
    public void setChangedEntryCount(int changedEntryCount) {
        this.changedEntryCount = changedEntryCount;
    }


    /**
     * Gets the editOrder value for this Revision.
     * 
     * @return editOrder
     */
    public java.lang.Long getEditOrder() {
        return editOrder;
    }


    /**
     * Sets the editOrder value for this Revision.
     * 
     * @param editOrder
     */
    public void setEditOrder(java.lang.Long editOrder) {
        this.editOrder = editOrder;
    }


    /**
     * Gets the revisionDate value for this Revision.
     * 
     * @return revisionDate
     */
    public java.util.Calendar getRevisionDate() {
        return revisionDate;
    }


    /**
     * Sets the revisionDate value for this Revision.
     * 
     * @param revisionDate
     */
    public void setRevisionDate(java.util.Calendar revisionDate) {
        this.revisionDate = revisionDate;
    }


    /**
     * Gets the revisionId value for this Revision.
     * 
     * @return revisionId
     */
    public java.lang.String getRevisionId() {
        return revisionId;
    }


    /**
     * Sets the revisionId value for this Revision.
     * 
     * @param revisionId
     */
    public void setRevisionId(java.lang.String revisionId) {
        this.revisionId = revisionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Revision)) return false;
        Revision other = (Revision) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.changeAgent==null && other.getChangeAgent()==null) || 
             (this.changeAgent!=null &&
              this.changeAgent.equals(other.getChangeAgent()))) &&
            ((this.changeInstructions==null && other.getChangeInstructions()==null) || 
             (this.changeInstructions!=null &&
              this.changeInstructions.equals(other.getChangeInstructions()))) &&
            ((this.changedEntry==null && other.getChangedEntry()==null) || 
             (this.changedEntry!=null &&
              java.util.Arrays.equals(this.changedEntry, other.getChangedEntry()))) &&
            ((this.changedEntryAsReference==null && other.getChangedEntryAsReference()==null) || 
             (this.changedEntryAsReference!=null &&
              java.util.Arrays.equals(this.changedEntryAsReference, other.getChangedEntryAsReference()))) &&
            this.changedEntryCount == other.getChangedEntryCount() &&
            ((this.editOrder==null && other.getEditOrder()==null) || 
             (this.editOrder!=null &&
              this.editOrder.equals(other.getEditOrder()))) &&
            ((this.revisionDate==null && other.getRevisionDate()==null) || 
             (this.revisionDate!=null &&
              this.revisionDate.equals(other.getRevisionDate()))) &&
            ((this.revisionId==null && other.getRevisionId()==null) || 
             (this.revisionId!=null &&
              this.revisionId.equals(other.getRevisionId())));
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
        if (getChangeAgent() != null) {
            _hashCode += getChangeAgent().hashCode();
        }
        if (getChangeInstructions() != null) {
            _hashCode += getChangeInstructions().hashCode();
        }
        if (getChangedEntry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangedEntry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangedEntry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChangedEntryAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangedEntryAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangedEntryAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getChangedEntryCount();
        if (getEditOrder() != null) {
            _hashCode += getEditOrder().hashCode();
        }
        if (getRevisionDate() != null) {
            _hashCode += getRevisionDate().hashCode();
        }
        if (getRevisionId() != null) {
            _hashCode += getRevisionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Revision.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:versions.LexGrid.org", "Revision"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:commonTypes.LexGrid.org", "Text"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changedEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:versions.LexGrid.org", "ChangedEntry"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedEntryAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changedEntryAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedEntryCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changedEntryCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "editOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revisionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revisionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
