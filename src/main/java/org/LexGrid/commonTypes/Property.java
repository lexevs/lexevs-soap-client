/**
 * Property.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.commonTypes;

public class Property  extends org.LexGrid.commonTypes.Versionable  implements java.io.Serializable {
    private java.lang.String language;

    private java.lang.String propertyId;

    private java.lang.String propertyName;

    private org.LexGrid.commonTypes.PropertyQualifier[] propertyQualifier;

    private java.lang.Object[] propertyQualifierAsReference;

    private int propertyQualifierCount;

    private java.lang.String propertyType;

    private org.LexGrid.commonTypes.Source[] source;

    private java.lang.Object[] sourceAsReference;

    private int sourceCount;

    private java.lang.String[] usageContext;

    private java.lang.Object[] usageContextAsReference;

    private int usageContextCount;

    private org.LexGrid.commonTypes.Text value;

    public Property() {
    }

    public Property(
           java.lang.Object parent,
           java.util.Calendar effectiveDate,
           org.LexGrid.versions.EntryState entryState,
           java.util.Calendar expirationDate,
           java.lang.Boolean isActive,
           java.lang.String owner,
           java.lang.String status,
           boolean valid,
           java.lang.String language,
           java.lang.String propertyId,
           java.lang.String propertyName,
           org.LexGrid.commonTypes.PropertyQualifier[] propertyQualifier,
           java.lang.Object[] propertyQualifierAsReference,
           int propertyQualifierCount,
           java.lang.String propertyType,
           org.LexGrid.commonTypes.Source[] source,
           java.lang.Object[] sourceAsReference,
           int sourceCount,
           java.lang.String[] usageContext,
           java.lang.Object[] usageContextAsReference,
           int usageContextCount,
           org.LexGrid.commonTypes.Text value) {
        super(
            parent,
            effectiveDate,
            entryState,
            expirationDate,
            isActive,
            owner,
            status,
            valid);
        this.language = language;
        this.propertyId = propertyId;
        this.propertyName = propertyName;
        this.propertyQualifier = propertyQualifier;
        this.propertyQualifierAsReference = propertyQualifierAsReference;
        this.propertyQualifierCount = propertyQualifierCount;
        this.propertyType = propertyType;
        this.source = source;
        this.sourceAsReference = sourceAsReference;
        this.sourceCount = sourceCount;
        this.usageContext = usageContext;
        this.usageContextAsReference = usageContextAsReference;
        this.usageContextCount = usageContextCount;
        this.value = value;
    }


    /**
     * Gets the language value for this Property.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this Property.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the propertyId value for this Property.
     * 
     * @return propertyId
     */
    public java.lang.String getPropertyId() {
        return propertyId;
    }


    /**
     * Sets the propertyId value for this Property.
     * 
     * @param propertyId
     */
    public void setPropertyId(java.lang.String propertyId) {
        this.propertyId = propertyId;
    }


    /**
     * Gets the propertyName value for this Property.
     * 
     * @return propertyName
     */
    public java.lang.String getPropertyName() {
        return propertyName;
    }


    /**
     * Sets the propertyName value for this Property.
     * 
     * @param propertyName
     */
    public void setPropertyName(java.lang.String propertyName) {
        this.propertyName = propertyName;
    }


    /**
     * Gets the propertyQualifier value for this Property.
     * 
     * @return propertyQualifier
     */
    public org.LexGrid.commonTypes.PropertyQualifier[] getPropertyQualifier() {
        return propertyQualifier;
    }


    /**
     * Sets the propertyQualifier value for this Property.
     * 
     * @param propertyQualifier
     */
    public void setPropertyQualifier(org.LexGrid.commonTypes.PropertyQualifier[] propertyQualifier) {
        this.propertyQualifier = propertyQualifier;
    }

    public org.LexGrid.commonTypes.PropertyQualifier getPropertyQualifier(int i) {
        return this.propertyQualifier[i];
    }

    public void setPropertyQualifier(int i, org.LexGrid.commonTypes.PropertyQualifier _value) {
        this.propertyQualifier[i] = _value;
    }


    /**
     * Gets the propertyQualifierAsReference value for this Property.
     * 
     * @return propertyQualifierAsReference
     */
    public java.lang.Object[] getPropertyQualifierAsReference() {
        return propertyQualifierAsReference;
    }


    /**
     * Sets the propertyQualifierAsReference value for this Property.
     * 
     * @param propertyQualifierAsReference
     */
    public void setPropertyQualifierAsReference(java.lang.Object[] propertyQualifierAsReference) {
        this.propertyQualifierAsReference = propertyQualifierAsReference;
    }


    /**
     * Gets the propertyQualifierCount value for this Property.
     * 
     * @return propertyQualifierCount
     */
    public int getPropertyQualifierCount() {
        return propertyQualifierCount;
    }


    /**
     * Sets the propertyQualifierCount value for this Property.
     * 
     * @param propertyQualifierCount
     */
    public void setPropertyQualifierCount(int propertyQualifierCount) {
        this.propertyQualifierCount = propertyQualifierCount;
    }


    /**
     * Gets the propertyType value for this Property.
     * 
     * @return propertyType
     */
    public java.lang.String getPropertyType() {
        return propertyType;
    }


    /**
     * Sets the propertyType value for this Property.
     * 
     * @param propertyType
     */
    public void setPropertyType(java.lang.String propertyType) {
        this.propertyType = propertyType;
    }


    /**
     * Gets the source value for this Property.
     * 
     * @return source
     */
    public org.LexGrid.commonTypes.Source[] getSource() {
        return source;
    }


    /**
     * Sets the source value for this Property.
     * 
     * @param source
     */
    public void setSource(org.LexGrid.commonTypes.Source[] source) {
        this.source = source;
    }

    public org.LexGrid.commonTypes.Source getSource(int i) {
        return this.source[i];
    }

    public void setSource(int i, org.LexGrid.commonTypes.Source _value) {
        this.source[i] = _value;
    }


    /**
     * Gets the sourceAsReference value for this Property.
     * 
     * @return sourceAsReference
     */
    public java.lang.Object[] getSourceAsReference() {
        return sourceAsReference;
    }


    /**
     * Sets the sourceAsReference value for this Property.
     * 
     * @param sourceAsReference
     */
    public void setSourceAsReference(java.lang.Object[] sourceAsReference) {
        this.sourceAsReference = sourceAsReference;
    }


    /**
     * Gets the sourceCount value for this Property.
     * 
     * @return sourceCount
     */
    public int getSourceCount() {
        return sourceCount;
    }


    /**
     * Sets the sourceCount value for this Property.
     * 
     * @param sourceCount
     */
    public void setSourceCount(int sourceCount) {
        this.sourceCount = sourceCount;
    }


    /**
     * Gets the usageContext value for this Property.
     * 
     * @return usageContext
     */
    public java.lang.String[] getUsageContext() {
        return usageContext;
    }


    /**
     * Sets the usageContext value for this Property.
     * 
     * @param usageContext
     */
    public void setUsageContext(java.lang.String[] usageContext) {
        this.usageContext = usageContext;
    }

    public java.lang.String getUsageContext(int i) {
        return this.usageContext[i];
    }

    public void setUsageContext(int i, java.lang.String _value) {
        this.usageContext[i] = _value;
    }


    /**
     * Gets the usageContextAsReference value for this Property.
     * 
     * @return usageContextAsReference
     */
    public java.lang.Object[] getUsageContextAsReference() {
        return usageContextAsReference;
    }


    /**
     * Sets the usageContextAsReference value for this Property.
     * 
     * @param usageContextAsReference
     */
    public void setUsageContextAsReference(java.lang.Object[] usageContextAsReference) {
        this.usageContextAsReference = usageContextAsReference;
    }


    /**
     * Gets the usageContextCount value for this Property.
     * 
     * @return usageContextCount
     */
    public int getUsageContextCount() {
        return usageContextCount;
    }


    /**
     * Sets the usageContextCount value for this Property.
     * 
     * @param usageContextCount
     */
    public void setUsageContextCount(int usageContextCount) {
        this.usageContextCount = usageContextCount;
    }


    /**
     * Gets the value value for this Property.
     * 
     * @return value
     */
    public org.LexGrid.commonTypes.Text getValue() {
        return value;
    }


    /**
     * Sets the value value for this Property.
     * 
     * @param value
     */
    public void setValue(org.LexGrid.commonTypes.Text value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Property)) return false;
        Property other = (Property) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.propertyId==null && other.getPropertyId()==null) || 
             (this.propertyId!=null &&
              this.propertyId.equals(other.getPropertyId()))) &&
            ((this.propertyName==null && other.getPropertyName()==null) || 
             (this.propertyName!=null &&
              this.propertyName.equals(other.getPropertyName()))) &&
            ((this.propertyQualifier==null && other.getPropertyQualifier()==null) || 
             (this.propertyQualifier!=null &&
              java.util.Arrays.equals(this.propertyQualifier, other.getPropertyQualifier()))) &&
            ((this.propertyQualifierAsReference==null && other.getPropertyQualifierAsReference()==null) || 
             (this.propertyQualifierAsReference!=null &&
              java.util.Arrays.equals(this.propertyQualifierAsReference, other.getPropertyQualifierAsReference()))) &&
            this.propertyQualifierCount == other.getPropertyQualifierCount() &&
            ((this.propertyType==null && other.getPropertyType()==null) || 
             (this.propertyType!=null &&
              this.propertyType.equals(other.getPropertyType()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              java.util.Arrays.equals(this.source, other.getSource()))) &&
            ((this.sourceAsReference==null && other.getSourceAsReference()==null) || 
             (this.sourceAsReference!=null &&
              java.util.Arrays.equals(this.sourceAsReference, other.getSourceAsReference()))) &&
            this.sourceCount == other.getSourceCount() &&
            ((this.usageContext==null && other.getUsageContext()==null) || 
             (this.usageContext!=null &&
              java.util.Arrays.equals(this.usageContext, other.getUsageContext()))) &&
            ((this.usageContextAsReference==null && other.getUsageContextAsReference()==null) || 
             (this.usageContextAsReference!=null &&
              java.util.Arrays.equals(this.usageContextAsReference, other.getUsageContextAsReference()))) &&
            this.usageContextCount == other.getUsageContextCount() &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getPropertyId() != null) {
            _hashCode += getPropertyId().hashCode();
        }
        if (getPropertyName() != null) {
            _hashCode += getPropertyName().hashCode();
        }
        if (getPropertyQualifier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPropertyQualifier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPropertyQualifier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPropertyQualifierAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPropertyQualifierAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPropertyQualifierAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPropertyQualifierCount();
        if (getPropertyType() != null) {
            _hashCode += getPropertyType().hashCode();
        }
        if (getSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSourceAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSourceAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSourceAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getSourceCount();
        if (getUsageContext() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsageContext());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsageContext(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUsageContextAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsageContextAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsageContextAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getUsageContextCount();
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Property.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:commonTypes.LexGrid.org", "Property"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "language"));
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
        elemField.setFieldName("propertyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyQualifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyQualifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:commonTypes.LexGrid.org", "PropertyQualifier"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyQualifierAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyQualifierAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyQualifierCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyQualifierCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:commonTypes.LexGrid.org", "Source"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageContext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usageContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageContextAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usageContextAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageContextCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usageContextCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:commonTypes.LexGrid.org", "Text"));
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
