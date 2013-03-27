/**
 * PickListEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.valueSets;

public class PickListEntry  extends org.mayo.edu.lgModel.LexGridBase  implements java.io.Serializable {
    private java.lang.String entityCode;

    private java.lang.String entityCodeNamespace;

    private java.lang.Long entryOrder;

    private java.lang.Boolean isDefault;

    private java.lang.String language;

    private java.lang.Boolean matchIfNoContext;

    private java.lang.String[] pickContext;

    private java.lang.Object[] pickContextAsReference;

    private int pickContextCount;

    private java.lang.String pickText;

    private java.lang.String propertyId;

    private boolean valid;

    public PickListEntry() {
    }

    public PickListEntry(
           java.lang.Object parent,
           java.lang.String entityCode,
           java.lang.String entityCodeNamespace,
           java.lang.Long entryOrder,
           java.lang.Boolean isDefault,
           java.lang.String language,
           java.lang.Boolean matchIfNoContext,
           java.lang.String[] pickContext,
           java.lang.Object[] pickContextAsReference,
           int pickContextCount,
           java.lang.String pickText,
           java.lang.String propertyId,
           boolean valid) {
        super(
            parent);
        this.entityCode = entityCode;
        this.entityCodeNamespace = entityCodeNamespace;
        this.entryOrder = entryOrder;
        this.isDefault = isDefault;
        this.language = language;
        this.matchIfNoContext = matchIfNoContext;
        this.pickContext = pickContext;
        this.pickContextAsReference = pickContextAsReference;
        this.pickContextCount = pickContextCount;
        this.pickText = pickText;
        this.propertyId = propertyId;
        this.valid = valid;
    }


    /**
     * Gets the entityCode value for this PickListEntry.
     * 
     * @return entityCode
     */
    public java.lang.String getEntityCode() {
        return entityCode;
    }


    /**
     * Sets the entityCode value for this PickListEntry.
     * 
     * @param entityCode
     */
    public void setEntityCode(java.lang.String entityCode) {
        this.entityCode = entityCode;
    }


    /**
     * Gets the entityCodeNamespace value for this PickListEntry.
     * 
     * @return entityCodeNamespace
     */
    public java.lang.String getEntityCodeNamespace() {
        return entityCodeNamespace;
    }


    /**
     * Sets the entityCodeNamespace value for this PickListEntry.
     * 
     * @param entityCodeNamespace
     */
    public void setEntityCodeNamespace(java.lang.String entityCodeNamespace) {
        this.entityCodeNamespace = entityCodeNamespace;
    }


    /**
     * Gets the entryOrder value for this PickListEntry.
     * 
     * @return entryOrder
     */
    public java.lang.Long getEntryOrder() {
        return entryOrder;
    }


    /**
     * Sets the entryOrder value for this PickListEntry.
     * 
     * @param entryOrder
     */
    public void setEntryOrder(java.lang.Long entryOrder) {
        this.entryOrder = entryOrder;
    }


    /**
     * Gets the isDefault value for this PickListEntry.
     * 
     * @return isDefault
     */
    public java.lang.Boolean getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this PickListEntry.
     * 
     * @param isDefault
     */
    public void setIsDefault(java.lang.Boolean isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * Gets the language value for this PickListEntry.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this PickListEntry.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the matchIfNoContext value for this PickListEntry.
     * 
     * @return matchIfNoContext
     */
    public java.lang.Boolean getMatchIfNoContext() {
        return matchIfNoContext;
    }


    /**
     * Sets the matchIfNoContext value for this PickListEntry.
     * 
     * @param matchIfNoContext
     */
    public void setMatchIfNoContext(java.lang.Boolean matchIfNoContext) {
        this.matchIfNoContext = matchIfNoContext;
    }


    /**
     * Gets the pickContext value for this PickListEntry.
     * 
     * @return pickContext
     */
    public java.lang.String[] getPickContext() {
        return pickContext;
    }


    /**
     * Sets the pickContext value for this PickListEntry.
     * 
     * @param pickContext
     */
    public void setPickContext(java.lang.String[] pickContext) {
        this.pickContext = pickContext;
    }

    public java.lang.String getPickContext(int i) {
        return this.pickContext[i];
    }

    public void setPickContext(int i, java.lang.String _value) {
        this.pickContext[i] = _value;
    }


    /**
     * Gets the pickContextAsReference value for this PickListEntry.
     * 
     * @return pickContextAsReference
     */
    public java.lang.Object[] getPickContextAsReference() {
        return pickContextAsReference;
    }


    /**
     * Sets the pickContextAsReference value for this PickListEntry.
     * 
     * @param pickContextAsReference
     */
    public void setPickContextAsReference(java.lang.Object[] pickContextAsReference) {
        this.pickContextAsReference = pickContextAsReference;
    }


    /**
     * Gets the pickContextCount value for this PickListEntry.
     * 
     * @return pickContextCount
     */
    public int getPickContextCount() {
        return pickContextCount;
    }


    /**
     * Sets the pickContextCount value for this PickListEntry.
     * 
     * @param pickContextCount
     */
    public void setPickContextCount(int pickContextCount) {
        this.pickContextCount = pickContextCount;
    }


    /**
     * Gets the pickText value for this PickListEntry.
     * 
     * @return pickText
     */
    public java.lang.String getPickText() {
        return pickText;
    }


    /**
     * Sets the pickText value for this PickListEntry.
     * 
     * @param pickText
     */
    public void setPickText(java.lang.String pickText) {
        this.pickText = pickText;
    }


    /**
     * Gets the propertyId value for this PickListEntry.
     * 
     * @return propertyId
     */
    public java.lang.String getPropertyId() {
        return propertyId;
    }


    /**
     * Sets the propertyId value for this PickListEntry.
     * 
     * @param propertyId
     */
    public void setPropertyId(java.lang.String propertyId) {
        this.propertyId = propertyId;
    }


    /**
     * Gets the valid value for this PickListEntry.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this PickListEntry.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PickListEntry)) return false;
        PickListEntry other = (PickListEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entityCode==null && other.getEntityCode()==null) || 
             (this.entityCode!=null &&
              this.entityCode.equals(other.getEntityCode()))) &&
            ((this.entityCodeNamespace==null && other.getEntityCodeNamespace()==null) || 
             (this.entityCodeNamespace!=null &&
              this.entityCodeNamespace.equals(other.getEntityCodeNamespace()))) &&
            ((this.entryOrder==null && other.getEntryOrder()==null) || 
             (this.entryOrder!=null &&
              this.entryOrder.equals(other.getEntryOrder()))) &&
            ((this.isDefault==null && other.getIsDefault()==null) || 
             (this.isDefault!=null &&
              this.isDefault.equals(other.getIsDefault()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.matchIfNoContext==null && other.getMatchIfNoContext()==null) || 
             (this.matchIfNoContext!=null &&
              this.matchIfNoContext.equals(other.getMatchIfNoContext()))) &&
            ((this.pickContext==null && other.getPickContext()==null) || 
             (this.pickContext!=null &&
              java.util.Arrays.equals(this.pickContext, other.getPickContext()))) &&
            ((this.pickContextAsReference==null && other.getPickContextAsReference()==null) || 
             (this.pickContextAsReference!=null &&
              java.util.Arrays.equals(this.pickContextAsReference, other.getPickContextAsReference()))) &&
            this.pickContextCount == other.getPickContextCount() &&
            ((this.pickText==null && other.getPickText()==null) || 
             (this.pickText!=null &&
              this.pickText.equals(other.getPickText()))) &&
            ((this.propertyId==null && other.getPropertyId()==null) || 
             (this.propertyId!=null &&
              this.propertyId.equals(other.getPropertyId()))) &&
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
        if (getEntityCode() != null) {
            _hashCode += getEntityCode().hashCode();
        }
        if (getEntityCodeNamespace() != null) {
            _hashCode += getEntityCodeNamespace().hashCode();
        }
        if (getEntryOrder() != null) {
            _hashCode += getEntryOrder().hashCode();
        }
        if (getIsDefault() != null) {
            _hashCode += getIsDefault().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getMatchIfNoContext() != null) {
            _hashCode += getMatchIfNoContext().hashCode();
        }
        if (getPickContext() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPickContext());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPickContext(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPickContextAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPickContextAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPickContextAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPickContextCount();
        if (getPickText() != null) {
            _hashCode += getPickText().hashCode();
        }
        if (getPropertyId() != null) {
            _hashCode += getPropertyId().hashCode();
        }
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PickListEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "PickListEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityCodeNamespace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityCodeNamespace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entryOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchIfNoContext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchIfNoContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickContext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickContextAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickContextAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickContextCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickContextCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
