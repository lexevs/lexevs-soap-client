/**
 * ValueSetDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.valueSets;

public class ValueSetDefinition  extends org.LexGrid.commonTypes.VersionableAndDescribable  implements java.io.Serializable {
    private java.lang.String conceptDomain;

    private java.lang.String defaultCodingScheme;

    private org.LexGrid.valueSets.DefinitionEntry[] definitionEntry;

    private java.lang.Object[] definitionEntryAsReference;

    private int definitionEntryCount;

    private org.LexGrid.naming.Mappings mappings;

    private org.LexGrid.commonTypes.Properties properties;

    private java.lang.String[] representsRealmOrContext;

    private java.lang.Object[] representsRealmOrContextAsReference;

    private int representsRealmOrContextCount;

    private org.LexGrid.commonTypes.Source[] source;

    private java.lang.Object[] sourceAsReference;

    private int sourceCount;

    private java.lang.String valueSetDefinitionName;

    private java.lang.String valueSetDefinitionURI;

    public ValueSetDefinition() {
    }

    public ValueSetDefinition(
           java.lang.Object parent,
           java.util.Calendar effectiveDate,
           org.LexGrid.versions.EntryState entryState,
           java.util.Calendar expirationDate,
           java.lang.Boolean isActive,
           java.lang.String owner,
           java.lang.String status,
           boolean valid,
           org.LexGrid.commonTypes.EntityDescription entityDescription,
           java.lang.String conceptDomain,
           java.lang.String defaultCodingScheme,
           org.LexGrid.valueSets.DefinitionEntry[] definitionEntry,
           java.lang.Object[] definitionEntryAsReference,
           int definitionEntryCount,
           org.LexGrid.naming.Mappings mappings,
           org.LexGrid.commonTypes.Properties properties,
           java.lang.String[] representsRealmOrContext,
           java.lang.Object[] representsRealmOrContextAsReference,
           int representsRealmOrContextCount,
           org.LexGrid.commonTypes.Source[] source,
           java.lang.Object[] sourceAsReference,
           int sourceCount,
           java.lang.String valueSetDefinitionName,
           java.lang.String valueSetDefinitionURI) {
        super(
            parent,
            effectiveDate,
            entryState,
            expirationDate,
            isActive,
            owner,
            status,
            valid,
            entityDescription);
        this.conceptDomain = conceptDomain;
        this.defaultCodingScheme = defaultCodingScheme;
        this.definitionEntry = definitionEntry;
        this.definitionEntryAsReference = definitionEntryAsReference;
        this.definitionEntryCount = definitionEntryCount;
        this.mappings = mappings;
        this.properties = properties;
        this.representsRealmOrContext = representsRealmOrContext;
        this.representsRealmOrContextAsReference = representsRealmOrContextAsReference;
        this.representsRealmOrContextCount = representsRealmOrContextCount;
        this.source = source;
        this.sourceAsReference = sourceAsReference;
        this.sourceCount = sourceCount;
        this.valueSetDefinitionName = valueSetDefinitionName;
        this.valueSetDefinitionURI = valueSetDefinitionURI;
    }


    /**
     * Gets the conceptDomain value for this ValueSetDefinition.
     * 
     * @return conceptDomain
     */
    public java.lang.String getConceptDomain() {
        return conceptDomain;
    }


    /**
     * Sets the conceptDomain value for this ValueSetDefinition.
     * 
     * @param conceptDomain
     */
    public void setConceptDomain(java.lang.String conceptDomain) {
        this.conceptDomain = conceptDomain;
    }


    /**
     * Gets the defaultCodingScheme value for this ValueSetDefinition.
     * 
     * @return defaultCodingScheme
     */
    public java.lang.String getDefaultCodingScheme() {
        return defaultCodingScheme;
    }


    /**
     * Sets the defaultCodingScheme value for this ValueSetDefinition.
     * 
     * @param defaultCodingScheme
     */
    public void setDefaultCodingScheme(java.lang.String defaultCodingScheme) {
        this.defaultCodingScheme = defaultCodingScheme;
    }


    /**
     * Gets the definitionEntry value for this ValueSetDefinition.
     * 
     * @return definitionEntry
     */
    public org.LexGrid.valueSets.DefinitionEntry[] getDefinitionEntry() {
        return definitionEntry;
    }


    /**
     * Sets the definitionEntry value for this ValueSetDefinition.
     * 
     * @param definitionEntry
     */
    public void setDefinitionEntry(org.LexGrid.valueSets.DefinitionEntry[] definitionEntry) {
        this.definitionEntry = definitionEntry;
    }

    public org.LexGrid.valueSets.DefinitionEntry getDefinitionEntry(int i) {
        return this.definitionEntry[i];
    }

    public void setDefinitionEntry(int i, org.LexGrid.valueSets.DefinitionEntry _value) {
        this.definitionEntry[i] = _value;
    }


    /**
     * Gets the definitionEntryAsReference value for this ValueSetDefinition.
     * 
     * @return definitionEntryAsReference
     */
    public java.lang.Object[] getDefinitionEntryAsReference() {
        return definitionEntryAsReference;
    }


    /**
     * Sets the definitionEntryAsReference value for this ValueSetDefinition.
     * 
     * @param definitionEntryAsReference
     */
    public void setDefinitionEntryAsReference(java.lang.Object[] definitionEntryAsReference) {
        this.definitionEntryAsReference = definitionEntryAsReference;
    }


    /**
     * Gets the definitionEntryCount value for this ValueSetDefinition.
     * 
     * @return definitionEntryCount
     */
    public int getDefinitionEntryCount() {
        return definitionEntryCount;
    }


    /**
     * Sets the definitionEntryCount value for this ValueSetDefinition.
     * 
     * @param definitionEntryCount
     */
    public void setDefinitionEntryCount(int definitionEntryCount) {
        this.definitionEntryCount = definitionEntryCount;
    }


    /**
     * Gets the mappings value for this ValueSetDefinition.
     * 
     * @return mappings
     */
    public org.LexGrid.naming.Mappings getMappings() {
        return mappings;
    }


    /**
     * Sets the mappings value for this ValueSetDefinition.
     * 
     * @param mappings
     */
    public void setMappings(org.LexGrid.naming.Mappings mappings) {
        this.mappings = mappings;
    }


    /**
     * Gets the properties value for this ValueSetDefinition.
     * 
     * @return properties
     */
    public org.LexGrid.commonTypes.Properties getProperties() {
        return properties;
    }


    /**
     * Sets the properties value for this ValueSetDefinition.
     * 
     * @param properties
     */
    public void setProperties(org.LexGrid.commonTypes.Properties properties) {
        this.properties = properties;
    }


    /**
     * Gets the representsRealmOrContext value for this ValueSetDefinition.
     * 
     * @return representsRealmOrContext
     */
    public java.lang.String[] getRepresentsRealmOrContext() {
        return representsRealmOrContext;
    }


    /**
     * Sets the representsRealmOrContext value for this ValueSetDefinition.
     * 
     * @param representsRealmOrContext
     */
    public void setRepresentsRealmOrContext(java.lang.String[] representsRealmOrContext) {
        this.representsRealmOrContext = representsRealmOrContext;
    }

    public java.lang.String getRepresentsRealmOrContext(int i) {
        return this.representsRealmOrContext[i];
    }

    public void setRepresentsRealmOrContext(int i, java.lang.String _value) {
        this.representsRealmOrContext[i] = _value;
    }


    /**
     * Gets the representsRealmOrContextAsReference value for this ValueSetDefinition.
     * 
     * @return representsRealmOrContextAsReference
     */
    public java.lang.Object[] getRepresentsRealmOrContextAsReference() {
        return representsRealmOrContextAsReference;
    }


    /**
     * Sets the representsRealmOrContextAsReference value for this ValueSetDefinition.
     * 
     * @param representsRealmOrContextAsReference
     */
    public void setRepresentsRealmOrContextAsReference(java.lang.Object[] representsRealmOrContextAsReference) {
        this.representsRealmOrContextAsReference = representsRealmOrContextAsReference;
    }


    /**
     * Gets the representsRealmOrContextCount value for this ValueSetDefinition.
     * 
     * @return representsRealmOrContextCount
     */
    public int getRepresentsRealmOrContextCount() {
        return representsRealmOrContextCount;
    }


    /**
     * Sets the representsRealmOrContextCount value for this ValueSetDefinition.
     * 
     * @param representsRealmOrContextCount
     */
    public void setRepresentsRealmOrContextCount(int representsRealmOrContextCount) {
        this.representsRealmOrContextCount = representsRealmOrContextCount;
    }


    /**
     * Gets the source value for this ValueSetDefinition.
     * 
     * @return source
     */
    public org.LexGrid.commonTypes.Source[] getSource() {
        return source;
    }


    /**
     * Sets the source value for this ValueSetDefinition.
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
     * Gets the sourceAsReference value for this ValueSetDefinition.
     * 
     * @return sourceAsReference
     */
    public java.lang.Object[] getSourceAsReference() {
        return sourceAsReference;
    }


    /**
     * Sets the sourceAsReference value for this ValueSetDefinition.
     * 
     * @param sourceAsReference
     */
    public void setSourceAsReference(java.lang.Object[] sourceAsReference) {
        this.sourceAsReference = sourceAsReference;
    }


    /**
     * Gets the sourceCount value for this ValueSetDefinition.
     * 
     * @return sourceCount
     */
    public int getSourceCount() {
        return sourceCount;
    }


    /**
     * Sets the sourceCount value for this ValueSetDefinition.
     * 
     * @param sourceCount
     */
    public void setSourceCount(int sourceCount) {
        this.sourceCount = sourceCount;
    }


    /**
     * Gets the valueSetDefinitionName value for this ValueSetDefinition.
     * 
     * @return valueSetDefinitionName
     */
    public java.lang.String getValueSetDefinitionName() {
        return valueSetDefinitionName;
    }


    /**
     * Sets the valueSetDefinitionName value for this ValueSetDefinition.
     * 
     * @param valueSetDefinitionName
     */
    public void setValueSetDefinitionName(java.lang.String valueSetDefinitionName) {
        this.valueSetDefinitionName = valueSetDefinitionName;
    }


    /**
     * Gets the valueSetDefinitionURI value for this ValueSetDefinition.
     * 
     * @return valueSetDefinitionURI
     */
    public java.lang.String getValueSetDefinitionURI() {
        return valueSetDefinitionURI;
    }


    /**
     * Sets the valueSetDefinitionURI value for this ValueSetDefinition.
     * 
     * @param valueSetDefinitionURI
     */
    public void setValueSetDefinitionURI(java.lang.String valueSetDefinitionURI) {
        this.valueSetDefinitionURI = valueSetDefinitionURI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValueSetDefinition)) return false;
        ValueSetDefinition other = (ValueSetDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.conceptDomain==null && other.getConceptDomain()==null) || 
             (this.conceptDomain!=null &&
              this.conceptDomain.equals(other.getConceptDomain()))) &&
            ((this.defaultCodingScheme==null && other.getDefaultCodingScheme()==null) || 
             (this.defaultCodingScheme!=null &&
              this.defaultCodingScheme.equals(other.getDefaultCodingScheme()))) &&
            ((this.definitionEntry==null && other.getDefinitionEntry()==null) || 
             (this.definitionEntry!=null &&
              java.util.Arrays.equals(this.definitionEntry, other.getDefinitionEntry()))) &&
            ((this.definitionEntryAsReference==null && other.getDefinitionEntryAsReference()==null) || 
             (this.definitionEntryAsReference!=null &&
              java.util.Arrays.equals(this.definitionEntryAsReference, other.getDefinitionEntryAsReference()))) &&
            this.definitionEntryCount == other.getDefinitionEntryCount() &&
            ((this.mappings==null && other.getMappings()==null) || 
             (this.mappings!=null &&
              this.mappings.equals(other.getMappings()))) &&
            ((this.properties==null && other.getProperties()==null) || 
             (this.properties!=null &&
              this.properties.equals(other.getProperties()))) &&
            ((this.representsRealmOrContext==null && other.getRepresentsRealmOrContext()==null) || 
             (this.representsRealmOrContext!=null &&
              java.util.Arrays.equals(this.representsRealmOrContext, other.getRepresentsRealmOrContext()))) &&
            ((this.representsRealmOrContextAsReference==null && other.getRepresentsRealmOrContextAsReference()==null) || 
             (this.representsRealmOrContextAsReference!=null &&
              java.util.Arrays.equals(this.representsRealmOrContextAsReference, other.getRepresentsRealmOrContextAsReference()))) &&
            this.representsRealmOrContextCount == other.getRepresentsRealmOrContextCount() &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              java.util.Arrays.equals(this.source, other.getSource()))) &&
            ((this.sourceAsReference==null && other.getSourceAsReference()==null) || 
             (this.sourceAsReference!=null &&
              java.util.Arrays.equals(this.sourceAsReference, other.getSourceAsReference()))) &&
            this.sourceCount == other.getSourceCount() &&
            ((this.valueSetDefinitionName==null && other.getValueSetDefinitionName()==null) || 
             (this.valueSetDefinitionName!=null &&
              this.valueSetDefinitionName.equals(other.getValueSetDefinitionName()))) &&
            ((this.valueSetDefinitionURI==null && other.getValueSetDefinitionURI()==null) || 
             (this.valueSetDefinitionURI!=null &&
              this.valueSetDefinitionURI.equals(other.getValueSetDefinitionURI())));
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
        if (getConceptDomain() != null) {
            _hashCode += getConceptDomain().hashCode();
        }
        if (getDefaultCodingScheme() != null) {
            _hashCode += getDefaultCodingScheme().hashCode();
        }
        if (getDefinitionEntry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefinitionEntry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefinitionEntry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefinitionEntryAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefinitionEntryAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefinitionEntryAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getDefinitionEntryCount();
        if (getMappings() != null) {
            _hashCode += getMappings().hashCode();
        }
        if (getProperties() != null) {
            _hashCode += getProperties().hashCode();
        }
        if (getRepresentsRealmOrContext() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRepresentsRealmOrContext());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRepresentsRealmOrContext(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRepresentsRealmOrContextAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRepresentsRealmOrContextAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRepresentsRealmOrContextAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getRepresentsRealmOrContextCount();
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
        if (getValueSetDefinitionName() != null) {
            _hashCode += getValueSetDefinitionName().hashCode();
        }
        if (getValueSetDefinitionURI() != null) {
            _hashCode += getValueSetDefinitionURI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValueSetDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "ValueSetDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conceptDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conceptDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCodingScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultCodingScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definitionEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "definitionEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "DefinitionEntry"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definitionEntryAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "definitionEntryAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definitionEntryCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "definitionEntryCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mappings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mappings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:naming.LexGrid.org", "Mappings"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properties");
        elemField.setXmlName(new javax.xml.namespace.QName("", "properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:commonTypes.LexGrid.org", "Properties"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("representsRealmOrContext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "representsRealmOrContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("representsRealmOrContextAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "representsRealmOrContextAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("representsRealmOrContextCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "representsRealmOrContextCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
        elemField.setFieldName("valueSetDefinitionName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueSetDefinitionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueSetDefinitionURI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueSetDefinitionURI"));
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
