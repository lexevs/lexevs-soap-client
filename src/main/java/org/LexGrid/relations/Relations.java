/**
 * Relations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.relations;

public class Relations  extends org.LexGrid.commonTypes.VersionableAndDescribable  implements java.io.Serializable {
    private org.LexGrid.relations.Association[] associationPredicate;

    private java.lang.Object[] associationPredicateAsReference;

    private int associationPredicateCount;

    private java.lang.String containerName;

    private java.lang.Boolean isMapping;

    private org.LexGrid.commonTypes.Properties properties;

    private java.lang.String representsVersion;

    private java.lang.String sourceCodingScheme;

    private java.lang.String sourceCodingSchemeVersion;

    private java.lang.String targetCodingScheme;

    private java.lang.String targetCodingSchemeVersion;

    public Relations() {
    }

    public Relations(
           java.lang.Object parent,
           java.util.Calendar effectiveDate,
           org.LexGrid.versions.EntryState entryState,
           java.util.Calendar expirationDate,
           java.lang.Boolean isActive,
           java.lang.String owner,
           java.lang.String status,
           boolean valid,
           org.LexGrid.commonTypes.EntityDescription entityDescription,
           org.LexGrid.relations.Association[] associationPredicate,
           java.lang.Object[] associationPredicateAsReference,
           int associationPredicateCount,
           java.lang.String containerName,
           java.lang.Boolean isMapping,
           org.LexGrid.commonTypes.Properties properties,
           java.lang.String representsVersion,
           java.lang.String sourceCodingScheme,
           java.lang.String sourceCodingSchemeVersion,
           java.lang.String targetCodingScheme,
           java.lang.String targetCodingSchemeVersion) {
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
        this.associationPredicate = associationPredicate;
        this.associationPredicateAsReference = associationPredicateAsReference;
        this.associationPredicateCount = associationPredicateCount;
        this.containerName = containerName;
        this.isMapping = isMapping;
        this.properties = properties;
        this.representsVersion = representsVersion;
        this.sourceCodingScheme = sourceCodingScheme;
        this.sourceCodingSchemeVersion = sourceCodingSchemeVersion;
        this.targetCodingScheme = targetCodingScheme;
        this.targetCodingSchemeVersion = targetCodingSchemeVersion;
    }


    /**
     * Gets the associationPredicate value for this Relations.
     * 
     * @return associationPredicate
     */
    public org.LexGrid.relations.Association[] getAssociationPredicate() {
        return associationPredicate;
    }


    /**
     * Sets the associationPredicate value for this Relations.
     * 
     * @param associationPredicate
     */
    public void setAssociationPredicate(org.LexGrid.relations.Association[] associationPredicate) {
        this.associationPredicate = associationPredicate;
    }

    public org.LexGrid.relations.Association getAssociationPredicate(int i) {
        return this.associationPredicate[i];
    }

    public void setAssociationPredicate(int i, org.LexGrid.relations.Association _value) {
        this.associationPredicate[i] = _value;
    }


    /**
     * Gets the associationPredicateAsReference value for this Relations.
     * 
     * @return associationPredicateAsReference
     */
    public java.lang.Object[] getAssociationPredicateAsReference() {
        return associationPredicateAsReference;
    }


    /**
     * Sets the associationPredicateAsReference value for this Relations.
     * 
     * @param associationPredicateAsReference
     */
    public void setAssociationPredicateAsReference(java.lang.Object[] associationPredicateAsReference) {
        this.associationPredicateAsReference = associationPredicateAsReference;
    }


    /**
     * Gets the associationPredicateCount value for this Relations.
     * 
     * @return associationPredicateCount
     */
    public int getAssociationPredicateCount() {
        return associationPredicateCount;
    }


    /**
     * Sets the associationPredicateCount value for this Relations.
     * 
     * @param associationPredicateCount
     */
    public void setAssociationPredicateCount(int associationPredicateCount) {
        this.associationPredicateCount = associationPredicateCount;
    }


    /**
     * Gets the containerName value for this Relations.
     * 
     * @return containerName
     */
    public java.lang.String getContainerName() {
        return containerName;
    }


    /**
     * Sets the containerName value for this Relations.
     * 
     * @param containerName
     */
    public void setContainerName(java.lang.String containerName) {
        this.containerName = containerName;
    }


    /**
     * Gets the isMapping value for this Relations.
     * 
     * @return isMapping
     */
    public java.lang.Boolean getIsMapping() {
        return isMapping;
    }


    /**
     * Sets the isMapping value for this Relations.
     * 
     * @param isMapping
     */
    public void setIsMapping(java.lang.Boolean isMapping) {
        this.isMapping = isMapping;
    }


    /**
     * Gets the properties value for this Relations.
     * 
     * @return properties
     */
    public org.LexGrid.commonTypes.Properties getProperties() {
        return properties;
    }


    /**
     * Sets the properties value for this Relations.
     * 
     * @param properties
     */
    public void setProperties(org.LexGrid.commonTypes.Properties properties) {
        this.properties = properties;
    }


    /**
     * Gets the representsVersion value for this Relations.
     * 
     * @return representsVersion
     */
    public java.lang.String getRepresentsVersion() {
        return representsVersion;
    }


    /**
     * Sets the representsVersion value for this Relations.
     * 
     * @param representsVersion
     */
    public void setRepresentsVersion(java.lang.String representsVersion) {
        this.representsVersion = representsVersion;
    }


    /**
     * Gets the sourceCodingScheme value for this Relations.
     * 
     * @return sourceCodingScheme
     */
    public java.lang.String getSourceCodingScheme() {
        return sourceCodingScheme;
    }


    /**
     * Sets the sourceCodingScheme value for this Relations.
     * 
     * @param sourceCodingScheme
     */
    public void setSourceCodingScheme(java.lang.String sourceCodingScheme) {
        this.sourceCodingScheme = sourceCodingScheme;
    }


    /**
     * Gets the sourceCodingSchemeVersion value for this Relations.
     * 
     * @return sourceCodingSchemeVersion
     */
    public java.lang.String getSourceCodingSchemeVersion() {
        return sourceCodingSchemeVersion;
    }


    /**
     * Sets the sourceCodingSchemeVersion value for this Relations.
     * 
     * @param sourceCodingSchemeVersion
     */
    public void setSourceCodingSchemeVersion(java.lang.String sourceCodingSchemeVersion) {
        this.sourceCodingSchemeVersion = sourceCodingSchemeVersion;
    }


    /**
     * Gets the targetCodingScheme value for this Relations.
     * 
     * @return targetCodingScheme
     */
    public java.lang.String getTargetCodingScheme() {
        return targetCodingScheme;
    }


    /**
     * Sets the targetCodingScheme value for this Relations.
     * 
     * @param targetCodingScheme
     */
    public void setTargetCodingScheme(java.lang.String targetCodingScheme) {
        this.targetCodingScheme = targetCodingScheme;
    }


    /**
     * Gets the targetCodingSchemeVersion value for this Relations.
     * 
     * @return targetCodingSchemeVersion
     */
    public java.lang.String getTargetCodingSchemeVersion() {
        return targetCodingSchemeVersion;
    }


    /**
     * Sets the targetCodingSchemeVersion value for this Relations.
     * 
     * @param targetCodingSchemeVersion
     */
    public void setTargetCodingSchemeVersion(java.lang.String targetCodingSchemeVersion) {
        this.targetCodingSchemeVersion = targetCodingSchemeVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Relations)) return false;
        Relations other = (Relations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.associationPredicate==null && other.getAssociationPredicate()==null) || 
             (this.associationPredicate!=null &&
              java.util.Arrays.equals(this.associationPredicate, other.getAssociationPredicate()))) &&
            ((this.associationPredicateAsReference==null && other.getAssociationPredicateAsReference()==null) || 
             (this.associationPredicateAsReference!=null &&
              java.util.Arrays.equals(this.associationPredicateAsReference, other.getAssociationPredicateAsReference()))) &&
            this.associationPredicateCount == other.getAssociationPredicateCount() &&
            ((this.containerName==null && other.getContainerName()==null) || 
             (this.containerName!=null &&
              this.containerName.equals(other.getContainerName()))) &&
            ((this.isMapping==null && other.getIsMapping()==null) || 
             (this.isMapping!=null &&
              this.isMapping.equals(other.getIsMapping()))) &&
            ((this.properties==null && other.getProperties()==null) || 
             (this.properties!=null &&
              this.properties.equals(other.getProperties()))) &&
            ((this.representsVersion==null && other.getRepresentsVersion()==null) || 
             (this.representsVersion!=null &&
              this.representsVersion.equals(other.getRepresentsVersion()))) &&
            ((this.sourceCodingScheme==null && other.getSourceCodingScheme()==null) || 
             (this.sourceCodingScheme!=null &&
              this.sourceCodingScheme.equals(other.getSourceCodingScheme()))) &&
            ((this.sourceCodingSchemeVersion==null && other.getSourceCodingSchemeVersion()==null) || 
             (this.sourceCodingSchemeVersion!=null &&
              this.sourceCodingSchemeVersion.equals(other.getSourceCodingSchemeVersion()))) &&
            ((this.targetCodingScheme==null && other.getTargetCodingScheme()==null) || 
             (this.targetCodingScheme!=null &&
              this.targetCodingScheme.equals(other.getTargetCodingScheme()))) &&
            ((this.targetCodingSchemeVersion==null && other.getTargetCodingSchemeVersion()==null) || 
             (this.targetCodingSchemeVersion!=null &&
              this.targetCodingSchemeVersion.equals(other.getTargetCodingSchemeVersion())));
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
        if (getAssociationPredicate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociationPredicate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssociationPredicate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssociationPredicateAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociationPredicateAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssociationPredicateAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getAssociationPredicateCount();
        if (getContainerName() != null) {
            _hashCode += getContainerName().hashCode();
        }
        if (getIsMapping() != null) {
            _hashCode += getIsMapping().hashCode();
        }
        if (getProperties() != null) {
            _hashCode += getProperties().hashCode();
        }
        if (getRepresentsVersion() != null) {
            _hashCode += getRepresentsVersion().hashCode();
        }
        if (getSourceCodingScheme() != null) {
            _hashCode += getSourceCodingScheme().hashCode();
        }
        if (getSourceCodingSchemeVersion() != null) {
            _hashCode += getSourceCodingSchemeVersion().hashCode();
        }
        if (getTargetCodingScheme() != null) {
            _hashCode += getTargetCodingScheme().hashCode();
        }
        if (getTargetCodingSchemeVersion() != null) {
            _hashCode += getTargetCodingSchemeVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Relations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relations.LexGrid.org", "Relations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationPredicate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associationPredicate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relations.LexGrid.org", "Association"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationPredicateAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associationPredicateAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationPredicateCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associationPredicateCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("containerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "containerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properties");
        elemField.setXmlName(new javax.xml.namespace.QName("", "properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:commonTypes.LexGrid.org", "Properties"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("representsVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "representsVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceCodingScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceCodingScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceCodingSchemeVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceCodingSchemeVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetCodingScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetCodingScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetCodingSchemeVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetCodingSchemeVersion"));
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
