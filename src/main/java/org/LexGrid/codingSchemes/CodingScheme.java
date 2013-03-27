/**
 * CodingScheme.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.codingSchemes;

public class CodingScheme  extends org.LexGrid.commonTypes.VersionableAndDescribable  implements java.io.Serializable {
    private java.lang.Long approxNumConcepts;

    private java.lang.String codingSchemeName;

    private java.lang.String codingSchemeURI;

    private org.LexGrid.commonTypes.Text copyright;

    private java.lang.String defaultLanguage;

    private org.LexGrid.concepts.Entities entities;

    private java.lang.String formalName;

    private java.lang.String[] localName;

    private java.lang.Object[] localNameAsReference;

    private int localNameCount;

    private org.LexGrid.naming.Mappings mappings;

    private org.LexGrid.commonTypes.Properties properties;

    private org.LexGrid.relations.Relations[] relations;

    private java.lang.Object[] relationsAsReference;

    private int relationsCount;

    private java.lang.String representsVersion;

    private org.LexGrid.commonTypes.Source[] source;

    private java.lang.Object[] sourceAsReference;

    private int sourceCount;

    public CodingScheme() {
    }

    public CodingScheme(
           java.lang.Object parent,
           java.util.Calendar effectiveDate,
           org.LexGrid.versions.EntryState entryState,
           java.util.Calendar expirationDate,
           java.lang.Boolean isActive,
           java.lang.String owner,
           java.lang.String status,
           boolean valid,
           org.LexGrid.commonTypes.EntityDescription entityDescription,
           java.lang.Long approxNumConcepts,
           java.lang.String codingSchemeName,
           java.lang.String codingSchemeURI,
           org.LexGrid.commonTypes.Text copyright,
           java.lang.String defaultLanguage,
           org.LexGrid.concepts.Entities entities,
           java.lang.String formalName,
           java.lang.String[] localName,
           java.lang.Object[] localNameAsReference,
           int localNameCount,
           org.LexGrid.naming.Mappings mappings,
           org.LexGrid.commonTypes.Properties properties,
           org.LexGrid.relations.Relations[] relations,
           java.lang.Object[] relationsAsReference,
           int relationsCount,
           java.lang.String representsVersion,
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
        this.approxNumConcepts = approxNumConcepts;
        this.codingSchemeName = codingSchemeName;
        this.codingSchemeURI = codingSchemeURI;
        this.copyright = copyright;
        this.defaultLanguage = defaultLanguage;
        this.entities = entities;
        this.formalName = formalName;
        this.localName = localName;
        this.localNameAsReference = localNameAsReference;
        this.localNameCount = localNameCount;
        this.mappings = mappings;
        this.properties = properties;
        this.relations = relations;
        this.relationsAsReference = relationsAsReference;
        this.relationsCount = relationsCount;
        this.representsVersion = representsVersion;
        this.source = source;
        this.sourceAsReference = sourceAsReference;
        this.sourceCount = sourceCount;
    }


    /**
     * Gets the approxNumConcepts value for this CodingScheme.
     * 
     * @return approxNumConcepts
     */
    public java.lang.Long getApproxNumConcepts() {
        return approxNumConcepts;
    }


    /**
     * Sets the approxNumConcepts value for this CodingScheme.
     * 
     * @param approxNumConcepts
     */
    public void setApproxNumConcepts(java.lang.Long approxNumConcepts) {
        this.approxNumConcepts = approxNumConcepts;
    }


    /**
     * Gets the codingSchemeName value for this CodingScheme.
     * 
     * @return codingSchemeName
     */
    public java.lang.String getCodingSchemeName() {
        return codingSchemeName;
    }


    /**
     * Sets the codingSchemeName value for this CodingScheme.
     * 
     * @param codingSchemeName
     */
    public void setCodingSchemeName(java.lang.String codingSchemeName) {
        this.codingSchemeName = codingSchemeName;
    }


    /**
     * Gets the codingSchemeURI value for this CodingScheme.
     * 
     * @return codingSchemeURI
     */
    public java.lang.String getCodingSchemeURI() {
        return codingSchemeURI;
    }


    /**
     * Sets the codingSchemeURI value for this CodingScheme.
     * 
     * @param codingSchemeURI
     */
    public void setCodingSchemeURI(java.lang.String codingSchemeURI) {
        this.codingSchemeURI = codingSchemeURI;
    }


    /**
     * Gets the copyright value for this CodingScheme.
     * 
     * @return copyright
     */
    public org.LexGrid.commonTypes.Text getCopyright() {
        return copyright;
    }


    /**
     * Sets the copyright value for this CodingScheme.
     * 
     * @param copyright
     */
    public void setCopyright(org.LexGrid.commonTypes.Text copyright) {
        this.copyright = copyright;
    }


    /**
     * Gets the defaultLanguage value for this CodingScheme.
     * 
     * @return defaultLanguage
     */
    public java.lang.String getDefaultLanguage() {
        return defaultLanguage;
    }


    /**
     * Sets the defaultLanguage value for this CodingScheme.
     * 
     * @param defaultLanguage
     */
    public void setDefaultLanguage(java.lang.String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }


    /**
     * Gets the entities value for this CodingScheme.
     * 
     * @return entities
     */
    public org.LexGrid.concepts.Entities getEntities() {
        return entities;
    }


    /**
     * Sets the entities value for this CodingScheme.
     * 
     * @param entities
     */
    public void setEntities(org.LexGrid.concepts.Entities entities) {
        this.entities = entities;
    }


    /**
     * Gets the formalName value for this CodingScheme.
     * 
     * @return formalName
     */
    public java.lang.String getFormalName() {
        return formalName;
    }


    /**
     * Sets the formalName value for this CodingScheme.
     * 
     * @param formalName
     */
    public void setFormalName(java.lang.String formalName) {
        this.formalName = formalName;
    }


    /**
     * Gets the localName value for this CodingScheme.
     * 
     * @return localName
     */
    public java.lang.String[] getLocalName() {
        return localName;
    }


    /**
     * Sets the localName value for this CodingScheme.
     * 
     * @param localName
     */
    public void setLocalName(java.lang.String[] localName) {
        this.localName = localName;
    }

    public java.lang.String getLocalName(int i) {
        return this.localName[i];
    }

    public void setLocalName(int i, java.lang.String _value) {
        this.localName[i] = _value;
    }


    /**
     * Gets the localNameAsReference value for this CodingScheme.
     * 
     * @return localNameAsReference
     */
    public java.lang.Object[] getLocalNameAsReference() {
        return localNameAsReference;
    }


    /**
     * Sets the localNameAsReference value for this CodingScheme.
     * 
     * @param localNameAsReference
     */
    public void setLocalNameAsReference(java.lang.Object[] localNameAsReference) {
        this.localNameAsReference = localNameAsReference;
    }


    /**
     * Gets the localNameCount value for this CodingScheme.
     * 
     * @return localNameCount
     */
    public int getLocalNameCount() {
        return localNameCount;
    }


    /**
     * Sets the localNameCount value for this CodingScheme.
     * 
     * @param localNameCount
     */
    public void setLocalNameCount(int localNameCount) {
        this.localNameCount = localNameCount;
    }


    /**
     * Gets the mappings value for this CodingScheme.
     * 
     * @return mappings
     */
    public org.LexGrid.naming.Mappings getMappings() {
        return mappings;
    }


    /**
     * Sets the mappings value for this CodingScheme.
     * 
     * @param mappings
     */
    public void setMappings(org.LexGrid.naming.Mappings mappings) {
        this.mappings = mappings;
    }


    /**
     * Gets the properties value for this CodingScheme.
     * 
     * @return properties
     */
    public org.LexGrid.commonTypes.Properties getProperties() {
        return properties;
    }


    /**
     * Sets the properties value for this CodingScheme.
     * 
     * @param properties
     */
    public void setProperties(org.LexGrid.commonTypes.Properties properties) {
        this.properties = properties;
    }


    /**
     * Gets the relations value for this CodingScheme.
     * 
     * @return relations
     */
    public org.LexGrid.relations.Relations[] getRelations() {
        return relations;
    }


    /**
     * Sets the relations value for this CodingScheme.
     * 
     * @param relations
     */
    public void setRelations(org.LexGrid.relations.Relations[] relations) {
        this.relations = relations;
    }

    public org.LexGrid.relations.Relations getRelations(int i) {
        return this.relations[i];
    }

    public void setRelations(int i, org.LexGrid.relations.Relations _value) {
        this.relations[i] = _value;
    }


    /**
     * Gets the relationsAsReference value for this CodingScheme.
     * 
     * @return relationsAsReference
     */
    public java.lang.Object[] getRelationsAsReference() {
        return relationsAsReference;
    }


    /**
     * Sets the relationsAsReference value for this CodingScheme.
     * 
     * @param relationsAsReference
     */
    public void setRelationsAsReference(java.lang.Object[] relationsAsReference) {
        this.relationsAsReference = relationsAsReference;
    }


    /**
     * Gets the relationsCount value for this CodingScheme.
     * 
     * @return relationsCount
     */
    public int getRelationsCount() {
        return relationsCount;
    }


    /**
     * Sets the relationsCount value for this CodingScheme.
     * 
     * @param relationsCount
     */
    public void setRelationsCount(int relationsCount) {
        this.relationsCount = relationsCount;
    }


    /**
     * Gets the representsVersion value for this CodingScheme.
     * 
     * @return representsVersion
     */
    public java.lang.String getRepresentsVersion() {
        return representsVersion;
    }


    /**
     * Sets the representsVersion value for this CodingScheme.
     * 
     * @param representsVersion
     */
    public void setRepresentsVersion(java.lang.String representsVersion) {
        this.representsVersion = representsVersion;
    }


    /**
     * Gets the source value for this CodingScheme.
     * 
     * @return source
     */
    public org.LexGrid.commonTypes.Source[] getSource() {
        return source;
    }


    /**
     * Sets the source value for this CodingScheme.
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
     * Gets the sourceAsReference value for this CodingScheme.
     * 
     * @return sourceAsReference
     */
    public java.lang.Object[] getSourceAsReference() {
        return sourceAsReference;
    }


    /**
     * Sets the sourceAsReference value for this CodingScheme.
     * 
     * @param sourceAsReference
     */
    public void setSourceAsReference(java.lang.Object[] sourceAsReference) {
        this.sourceAsReference = sourceAsReference;
    }


    /**
     * Gets the sourceCount value for this CodingScheme.
     * 
     * @return sourceCount
     */
    public int getSourceCount() {
        return sourceCount;
    }


    /**
     * Sets the sourceCount value for this CodingScheme.
     * 
     * @param sourceCount
     */
    public void setSourceCount(int sourceCount) {
        this.sourceCount = sourceCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodingScheme)) return false;
        CodingScheme other = (CodingScheme) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.approxNumConcepts==null && other.getApproxNumConcepts()==null) || 
             (this.approxNumConcepts!=null &&
              this.approxNumConcepts.equals(other.getApproxNumConcepts()))) &&
            ((this.codingSchemeName==null && other.getCodingSchemeName()==null) || 
             (this.codingSchemeName!=null &&
              this.codingSchemeName.equals(other.getCodingSchemeName()))) &&
            ((this.codingSchemeURI==null && other.getCodingSchemeURI()==null) || 
             (this.codingSchemeURI!=null &&
              this.codingSchemeURI.equals(other.getCodingSchemeURI()))) &&
            ((this.copyright==null && other.getCopyright()==null) || 
             (this.copyright!=null &&
              this.copyright.equals(other.getCopyright()))) &&
            ((this.defaultLanguage==null && other.getDefaultLanguage()==null) || 
             (this.defaultLanguage!=null &&
              this.defaultLanguage.equals(other.getDefaultLanguage()))) &&
            ((this.entities==null && other.getEntities()==null) || 
             (this.entities!=null &&
              this.entities.equals(other.getEntities()))) &&
            ((this.formalName==null && other.getFormalName()==null) || 
             (this.formalName!=null &&
              this.formalName.equals(other.getFormalName()))) &&
            ((this.localName==null && other.getLocalName()==null) || 
             (this.localName!=null &&
              java.util.Arrays.equals(this.localName, other.getLocalName()))) &&
            ((this.localNameAsReference==null && other.getLocalNameAsReference()==null) || 
             (this.localNameAsReference!=null &&
              java.util.Arrays.equals(this.localNameAsReference, other.getLocalNameAsReference()))) &&
            this.localNameCount == other.getLocalNameCount() &&
            ((this.mappings==null && other.getMappings()==null) || 
             (this.mappings!=null &&
              this.mappings.equals(other.getMappings()))) &&
            ((this.properties==null && other.getProperties()==null) || 
             (this.properties!=null &&
              this.properties.equals(other.getProperties()))) &&
            ((this.relations==null && other.getRelations()==null) || 
             (this.relations!=null &&
              java.util.Arrays.equals(this.relations, other.getRelations()))) &&
            ((this.relationsAsReference==null && other.getRelationsAsReference()==null) || 
             (this.relationsAsReference!=null &&
              java.util.Arrays.equals(this.relationsAsReference, other.getRelationsAsReference()))) &&
            this.relationsCount == other.getRelationsCount() &&
            ((this.representsVersion==null && other.getRepresentsVersion()==null) || 
             (this.representsVersion!=null &&
              this.representsVersion.equals(other.getRepresentsVersion()))) &&
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
        if (getApproxNumConcepts() != null) {
            _hashCode += getApproxNumConcepts().hashCode();
        }
        if (getCodingSchemeName() != null) {
            _hashCode += getCodingSchemeName().hashCode();
        }
        if (getCodingSchemeURI() != null) {
            _hashCode += getCodingSchemeURI().hashCode();
        }
        if (getCopyright() != null) {
            _hashCode += getCopyright().hashCode();
        }
        if (getDefaultLanguage() != null) {
            _hashCode += getDefaultLanguage().hashCode();
        }
        if (getEntities() != null) {
            _hashCode += getEntities().hashCode();
        }
        if (getFormalName() != null) {
            _hashCode += getFormalName().hashCode();
        }
        if (getLocalName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocalNameAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalNameAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalNameAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getLocalNameCount();
        if (getMappings() != null) {
            _hashCode += getMappings().hashCode();
        }
        if (getProperties() != null) {
            _hashCode += getProperties().hashCode();
        }
        if (getRelations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelationsAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelationsAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelationsAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getRelationsCount();
        if (getRepresentsVersion() != null) {
            _hashCode += getRepresentsVersion().hashCode();
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
        new org.apache.axis.description.TypeDesc(CodingScheme.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:codingSchemes.LexGrid.org", "CodingScheme"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approxNumConcepts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approxNumConcepts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codingSchemeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codingSchemeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codingSchemeURI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codingSchemeURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyright");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copyright"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:commonTypes.LexGrid.org", "Text"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:concepts.LexGrid.org", "Entities"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formalName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localNameAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localNameAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localNameCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localNameCount"));
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
        elemField.setFieldName("relations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relations.LexGrid.org", "Relations"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationsAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relationsAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relationsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("representsVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "representsVersion"));
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
