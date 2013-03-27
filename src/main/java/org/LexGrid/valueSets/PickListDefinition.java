/**
 * PickListDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.valueSets;

public class PickListDefinition  extends org.LexGrid.commonTypes.VersionableAndDescribable  implements java.io.Serializable {
    private java.lang.Boolean completeSet;

    private java.lang.String defaultEntityCodeNamespace;

    private java.lang.String defaultLanguage;

    private java.lang.String[] defaultPickContext;

    private java.lang.Object[] defaultPickContextAsReference;

    private int defaultPickContextCount;

    private java.lang.String defaultSortOrder;

    private org.LexGrid.naming.Mappings mappings;

    private org.LexGrid.valueSets.PickListEntryNode[] pickListEntryNode;

    private java.lang.Object[] pickListEntryNodeAsReference;

    private int pickListEntryNodeCount;

    private java.lang.String pickListId;

    private org.LexGrid.commonTypes.Properties properties;

    private java.lang.String representsValueSetDefinition;

    private org.LexGrid.commonTypes.Source[] source;

    private java.lang.Object[] sourceAsReference;

    private int sourceCount;

    public PickListDefinition() {
    }

    public PickListDefinition(
           java.lang.Object parent,
           java.util.Calendar effectiveDate,
           org.LexGrid.versions.EntryState entryState,
           java.util.Calendar expirationDate,
           java.lang.Boolean isActive,
           java.lang.String owner,
           java.lang.String status,
           boolean valid,
           org.LexGrid.commonTypes.EntityDescription entityDescription,
           java.lang.Boolean completeSet,
           java.lang.String defaultEntityCodeNamespace,
           java.lang.String defaultLanguage,
           java.lang.String[] defaultPickContext,
           java.lang.Object[] defaultPickContextAsReference,
           int defaultPickContextCount,
           java.lang.String defaultSortOrder,
           org.LexGrid.naming.Mappings mappings,
           org.LexGrid.valueSets.PickListEntryNode[] pickListEntryNode,
           java.lang.Object[] pickListEntryNodeAsReference,
           int pickListEntryNodeCount,
           java.lang.String pickListId,
           org.LexGrid.commonTypes.Properties properties,
           java.lang.String representsValueSetDefinition,
           org.LexGrid.commonTypes.Source[] source,
           java.lang.Object[] sourceAsReference,
           int sourceCount) {
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
        this.completeSet = completeSet;
        this.defaultEntityCodeNamespace = defaultEntityCodeNamespace;
        this.defaultLanguage = defaultLanguage;
        this.defaultPickContext = defaultPickContext;
        this.defaultPickContextAsReference = defaultPickContextAsReference;
        this.defaultPickContextCount = defaultPickContextCount;
        this.defaultSortOrder = defaultSortOrder;
        this.mappings = mappings;
        this.pickListEntryNode = pickListEntryNode;
        this.pickListEntryNodeAsReference = pickListEntryNodeAsReference;
        this.pickListEntryNodeCount = pickListEntryNodeCount;
        this.pickListId = pickListId;
        this.properties = properties;
        this.representsValueSetDefinition = representsValueSetDefinition;
        this.source = source;
        this.sourceAsReference = sourceAsReference;
        this.sourceCount = sourceCount;
    }


    /**
     * Gets the completeSet value for this PickListDefinition.
     * 
     * @return completeSet
     */
    public java.lang.Boolean getCompleteSet() {
        return completeSet;
    }


    /**
     * Sets the completeSet value for this PickListDefinition.
     * 
     * @param completeSet
     */
    public void setCompleteSet(java.lang.Boolean completeSet) {
        this.completeSet = completeSet;
    }


    /**
     * Gets the defaultEntityCodeNamespace value for this PickListDefinition.
     * 
     * @return defaultEntityCodeNamespace
     */
    public java.lang.String getDefaultEntityCodeNamespace() {
        return defaultEntityCodeNamespace;
    }


    /**
     * Sets the defaultEntityCodeNamespace value for this PickListDefinition.
     * 
     * @param defaultEntityCodeNamespace
     */
    public void setDefaultEntityCodeNamespace(java.lang.String defaultEntityCodeNamespace) {
        this.defaultEntityCodeNamespace = defaultEntityCodeNamespace;
    }


    /**
     * Gets the defaultLanguage value for this PickListDefinition.
     * 
     * @return defaultLanguage
     */
    public java.lang.String getDefaultLanguage() {
        return defaultLanguage;
    }


    /**
     * Sets the defaultLanguage value for this PickListDefinition.
     * 
     * @param defaultLanguage
     */
    public void setDefaultLanguage(java.lang.String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }


    /**
     * Gets the defaultPickContext value for this PickListDefinition.
     * 
     * @return defaultPickContext
     */
    public java.lang.String[] getDefaultPickContext() {
        return defaultPickContext;
    }


    /**
     * Sets the defaultPickContext value for this PickListDefinition.
     * 
     * @param defaultPickContext
     */
    public void setDefaultPickContext(java.lang.String[] defaultPickContext) {
        this.defaultPickContext = defaultPickContext;
    }

    public java.lang.String getDefaultPickContext(int i) {
        return this.defaultPickContext[i];
    }

    public void setDefaultPickContext(int i, java.lang.String _value) {
        this.defaultPickContext[i] = _value;
    }


    /**
     * Gets the defaultPickContextAsReference value for this PickListDefinition.
     * 
     * @return defaultPickContextAsReference
     */
    public java.lang.Object[] getDefaultPickContextAsReference() {
        return defaultPickContextAsReference;
    }


    /**
     * Sets the defaultPickContextAsReference value for this PickListDefinition.
     * 
     * @param defaultPickContextAsReference
     */
    public void setDefaultPickContextAsReference(java.lang.Object[] defaultPickContextAsReference) {
        this.defaultPickContextAsReference = defaultPickContextAsReference;
    }


    /**
     * Gets the defaultPickContextCount value for this PickListDefinition.
     * 
     * @return defaultPickContextCount
     */
    public int getDefaultPickContextCount() {
        return defaultPickContextCount;
    }


    /**
     * Sets the defaultPickContextCount value for this PickListDefinition.
     * 
     * @param defaultPickContextCount
     */
    public void setDefaultPickContextCount(int defaultPickContextCount) {
        this.defaultPickContextCount = defaultPickContextCount;
    }


    /**
     * Gets the defaultSortOrder value for this PickListDefinition.
     * 
     * @return defaultSortOrder
     */
    public java.lang.String getDefaultSortOrder() {
        return defaultSortOrder;
    }


    /**
     * Sets the defaultSortOrder value for this PickListDefinition.
     * 
     * @param defaultSortOrder
     */
    public void setDefaultSortOrder(java.lang.String defaultSortOrder) {
        this.defaultSortOrder = defaultSortOrder;
    }


    /**
     * Gets the mappings value for this PickListDefinition.
     * 
     * @return mappings
     */
    public org.LexGrid.naming.Mappings getMappings() {
        return mappings;
    }


    /**
     * Sets the mappings value for this PickListDefinition.
     * 
     * @param mappings
     */
    public void setMappings(org.LexGrid.naming.Mappings mappings) {
        this.mappings = mappings;
    }


    /**
     * Gets the pickListEntryNode value for this PickListDefinition.
     * 
     * @return pickListEntryNode
     */
    public org.LexGrid.valueSets.PickListEntryNode[] getPickListEntryNode() {
        return pickListEntryNode;
    }


    /**
     * Sets the pickListEntryNode value for this PickListDefinition.
     * 
     * @param pickListEntryNode
     */
    public void setPickListEntryNode(org.LexGrid.valueSets.PickListEntryNode[] pickListEntryNode) {
        this.pickListEntryNode = pickListEntryNode;
    }

    public org.LexGrid.valueSets.PickListEntryNode getPickListEntryNode(int i) {
        return this.pickListEntryNode[i];
    }

    public void setPickListEntryNode(int i, org.LexGrid.valueSets.PickListEntryNode _value) {
        this.pickListEntryNode[i] = _value;
    }


    /**
     * Gets the pickListEntryNodeAsReference value for this PickListDefinition.
     * 
     * @return pickListEntryNodeAsReference
     */
    public java.lang.Object[] getPickListEntryNodeAsReference() {
        return pickListEntryNodeAsReference;
    }


    /**
     * Sets the pickListEntryNodeAsReference value for this PickListDefinition.
     * 
     * @param pickListEntryNodeAsReference
     */
    public void setPickListEntryNodeAsReference(java.lang.Object[] pickListEntryNodeAsReference) {
        this.pickListEntryNodeAsReference = pickListEntryNodeAsReference;
    }


    /**
     * Gets the pickListEntryNodeCount value for this PickListDefinition.
     * 
     * @return pickListEntryNodeCount
     */
    public int getPickListEntryNodeCount() {
        return pickListEntryNodeCount;
    }


    /**
     * Sets the pickListEntryNodeCount value for this PickListDefinition.
     * 
     * @param pickListEntryNodeCount
     */
    public void setPickListEntryNodeCount(int pickListEntryNodeCount) {
        this.pickListEntryNodeCount = pickListEntryNodeCount;
    }


    /**
     * Gets the pickListId value for this PickListDefinition.
     * 
     * @return pickListId
     */
    public java.lang.String getPickListId() {
        return pickListId;
    }


    /**
     * Sets the pickListId value for this PickListDefinition.
     * 
     * @param pickListId
     */
    public void setPickListId(java.lang.String pickListId) {
        this.pickListId = pickListId;
    }


    /**
     * Gets the properties value for this PickListDefinition.
     * 
     * @return properties
     */
    public org.LexGrid.commonTypes.Properties getProperties() {
        return properties;
    }


    /**
     * Sets the properties value for this PickListDefinition.
     * 
     * @param properties
     */
    public void setProperties(org.LexGrid.commonTypes.Properties properties) {
        this.properties = properties;
    }


    /**
     * Gets the representsValueSetDefinition value for this PickListDefinition.
     * 
     * @return representsValueSetDefinition
     */
    public java.lang.String getRepresentsValueSetDefinition() {
        return representsValueSetDefinition;
    }


    /**
     * Sets the representsValueSetDefinition value for this PickListDefinition.
     * 
     * @param representsValueSetDefinition
     */
    public void setRepresentsValueSetDefinition(java.lang.String representsValueSetDefinition) {
        this.representsValueSetDefinition = representsValueSetDefinition;
    }


    /**
     * Gets the source value for this PickListDefinition.
     * 
     * @return source
     */
    public org.LexGrid.commonTypes.Source[] getSource() {
        return source;
    }


    /**
     * Sets the source value for this PickListDefinition.
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
     * Gets the sourceAsReference value for this PickListDefinition.
     * 
     * @return sourceAsReference
     */
    public java.lang.Object[] getSourceAsReference() {
        return sourceAsReference;
    }


    /**
     * Sets the sourceAsReference value for this PickListDefinition.
     * 
     * @param sourceAsReference
     */
    public void setSourceAsReference(java.lang.Object[] sourceAsReference) {
        this.sourceAsReference = sourceAsReference;
    }


    /**
     * Gets the sourceCount value for this PickListDefinition.
     * 
     * @return sourceCount
     */
    public int getSourceCount() {
        return sourceCount;
    }


    /**
     * Sets the sourceCount value for this PickListDefinition.
     * 
     * @param sourceCount
     */
    public void setSourceCount(int sourceCount) {
        this.sourceCount = sourceCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PickListDefinition)) return false;
        PickListDefinition other = (PickListDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.completeSet==null && other.getCompleteSet()==null) || 
             (this.completeSet!=null &&
              this.completeSet.equals(other.getCompleteSet()))) &&
            ((this.defaultEntityCodeNamespace==null && other.getDefaultEntityCodeNamespace()==null) || 
             (this.defaultEntityCodeNamespace!=null &&
              this.defaultEntityCodeNamespace.equals(other.getDefaultEntityCodeNamespace()))) &&
            ((this.defaultLanguage==null && other.getDefaultLanguage()==null) || 
             (this.defaultLanguage!=null &&
              this.defaultLanguage.equals(other.getDefaultLanguage()))) &&
            ((this.defaultPickContext==null && other.getDefaultPickContext()==null) || 
             (this.defaultPickContext!=null &&
              java.util.Arrays.equals(this.defaultPickContext, other.getDefaultPickContext()))) &&
            ((this.defaultPickContextAsReference==null && other.getDefaultPickContextAsReference()==null) || 
             (this.defaultPickContextAsReference!=null &&
              java.util.Arrays.equals(this.defaultPickContextAsReference, other.getDefaultPickContextAsReference()))) &&
            this.defaultPickContextCount == other.getDefaultPickContextCount() &&
            ((this.defaultSortOrder==null && other.getDefaultSortOrder()==null) || 
             (this.defaultSortOrder!=null &&
              this.defaultSortOrder.equals(other.getDefaultSortOrder()))) &&
            ((this.mappings==null && other.getMappings()==null) || 
             (this.mappings!=null &&
              this.mappings.equals(other.getMappings()))) &&
            ((this.pickListEntryNode==null && other.getPickListEntryNode()==null) || 
             (this.pickListEntryNode!=null &&
              java.util.Arrays.equals(this.pickListEntryNode, other.getPickListEntryNode()))) &&
            ((this.pickListEntryNodeAsReference==null && other.getPickListEntryNodeAsReference()==null) || 
             (this.pickListEntryNodeAsReference!=null &&
              java.util.Arrays.equals(this.pickListEntryNodeAsReference, other.getPickListEntryNodeAsReference()))) &&
            this.pickListEntryNodeCount == other.getPickListEntryNodeCount() &&
            ((this.pickListId==null && other.getPickListId()==null) || 
             (this.pickListId!=null &&
              this.pickListId.equals(other.getPickListId()))) &&
            ((this.properties==null && other.getProperties()==null) || 
             (this.properties!=null &&
              this.properties.equals(other.getProperties()))) &&
            ((this.representsValueSetDefinition==null && other.getRepresentsValueSetDefinition()==null) || 
             (this.representsValueSetDefinition!=null &&
              this.representsValueSetDefinition.equals(other.getRepresentsValueSetDefinition()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              java.util.Arrays.equals(this.source, other.getSource()))) &&
            ((this.sourceAsReference==null && other.getSourceAsReference()==null) || 
             (this.sourceAsReference!=null &&
              java.util.Arrays.equals(this.sourceAsReference, other.getSourceAsReference()))) &&
            this.sourceCount == other.getSourceCount();
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
        if (getCompleteSet() != null) {
            _hashCode += getCompleteSet().hashCode();
        }
        if (getDefaultEntityCodeNamespace() != null) {
            _hashCode += getDefaultEntityCodeNamespace().hashCode();
        }
        if (getDefaultLanguage() != null) {
            _hashCode += getDefaultLanguage().hashCode();
        }
        if (getDefaultPickContext() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefaultPickContext());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefaultPickContext(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultPickContextAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefaultPickContextAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefaultPickContextAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getDefaultPickContextCount();
        if (getDefaultSortOrder() != null) {
            _hashCode += getDefaultSortOrder().hashCode();
        }
        if (getMappings() != null) {
            _hashCode += getMappings().hashCode();
        }
        if (getPickListEntryNode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPickListEntryNode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPickListEntryNode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPickListEntryNodeAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPickListEntryNodeAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPickListEntryNodeAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPickListEntryNodeCount();
        if (getPickListId() != null) {
            _hashCode += getPickListId().hashCode();
        }
        if (getProperties() != null) {
            _hashCode += getProperties().hashCode();
        }
        if (getRepresentsValueSetDefinition() != null) {
            _hashCode += getRepresentsValueSetDefinition().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PickListDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "PickListDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completeSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "completeSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultEntityCodeNamespace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultEntityCodeNamespace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPickContext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultPickContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPickContextAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultPickContextAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPickContextCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultPickContextCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultSortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultSortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mappings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mappings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:naming.LexGrid.org", "Mappings"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickListEntryNode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickListEntryNode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "PickListEntryNode"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickListEntryNodeAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickListEntryNodeAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickListEntryNodeCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickListEntryNodeCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickListId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickListId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properties");
        elemField.setXmlName(new javax.xml.namespace.QName("", "properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:commonTypes.LexGrid.org", "Properties"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("representsValueSetDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "representsValueSetDefinition"));
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
